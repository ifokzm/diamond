package com.ml.diamond.service.impl;

import com.alibaba.fastjson.JSONObject;
import com.ml.diamond.config.DS;
import com.ml.diamond.config.DataSourceType;
import com.ml.diamond.entity.Projects;
import com.ml.diamond.mapper.ProjectsMapper;
import com.ml.diamond.service.ProjectsService;
import com.ml.diamond.utils.DataGrid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

@Service
public class ProjectsServiceImpl implements ProjectsService {


    @Autowired
    ProjectsMapper projectsMapper;

    @Override
    @DS(DataSourceType.Slave)
    public DataGrid<Projects> getPage(Projects projects) {
        DataGrid<Projects> dg = new DataGrid<Projects>();

        JSONObject filter = JSONObject.parseObject(projects.getFilter());
        JSONObject op = JSONObject.parseObject(projects.getOp());

        StringBuffer conditionStr = new StringBuffer();
        Iterator<Map.Entry<String, Object>> filterEntrys = filter.entrySet().iterator();
        while(filterEntrys.hasNext()){
            Map.Entry<String, Object> filterEntity = filterEntrys.next();

            String fieldName = filterEntity.getKey();
            String fieldValue = filterEntity.getValue().toString();

            String condition = op.getString(fieldName);

            if(condition.matches("BETWEEN")){
                conditionStr.append(" AND ")
                        .append(fieldName).append(" ").append(condition).append(" ")
                        .append(fieldValue.replace(",", " AND "));
            }else if(condition.matches("LIKE(.*)")){
                conditionStr.append(" AND ")
                        .append(fieldName).append(" ")
                        .append(condition.replace("...", fieldValue));
            }
        }

        System.out.println(conditionStr.toString());

        dg.setTotal(projectsMapper.getCount(projects));
        dg.setRows(projectsMapper.getPage(projects));

        return dg;
    }

    @Override
    @DS(DataSourceType.Slave)
    public List<Projects> getAllList(Projects object) {
        return null;
    }
}
