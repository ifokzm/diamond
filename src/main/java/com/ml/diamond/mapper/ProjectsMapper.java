package com.ml.diamond.mapper;

import com.ml.diamond.entity.Buildings;
import com.ml.diamond.entity.Projects;
import com.ml.diamond.entity.Trans;

import java.util.List;

public interface ProjectsMapper {
    int deleteByPrimaryKey(String projectId);

    int insert(Projects record);

    int insertSelective(Projects record);

    Projects selectByPrimaryKey(String projectId);

    int updateByPrimaryKeySelective(Projects record);

    int updateByPrimaryKeyWithBLOBs(Projects record);

    int updateByPrimaryKey(Projects record);

    int getCount(Projects record);

    List<Projects> getPage(Projects record);
}