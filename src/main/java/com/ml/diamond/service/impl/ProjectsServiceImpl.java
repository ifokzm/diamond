package com.ml.diamond.service.impl;

import com.ml.diamond.config.DS;
import com.ml.diamond.config.DataSourceType;
import com.ml.diamond.entity.Projects;
import com.ml.diamond.mapper.ProjectsMapper;
import com.ml.diamond.service.ProjectsService;
import com.ml.diamond.utils.DataGrid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProjectsServiceImpl implements ProjectsService {


    @Autowired
    ProjectsMapper projectsMapper;

    @Override
    @DS(DataSourceType.Slave)
    public DataGrid<Projects> getPage(Projects projects) {
        DataGrid<Projects> dg = new DataGrid<Projects>();

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
