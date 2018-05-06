package com.ml.diamond.mapper;

import com.ml.diamond.entity.Projects;

import java.util.List;

public interface ProjectsMapper {

    int getCount(Projects record);

    List<Projects> getPage(Projects record);
}