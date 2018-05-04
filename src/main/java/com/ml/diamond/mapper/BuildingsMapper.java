package com.ml.diamond.mapper;

import com.ml.diamond.entity.Buildings;
import com.ml.diamond.entity.Trans;

import java.util.List;

public interface BuildingsMapper {
    int deleteByPrimaryKey(Buildings key);

    int insert(Buildings record);

    int insertSelective(Buildings record);

    Buildings selectByPrimaryKey(Buildings key);

    int updateByPrimaryKeySelective(Buildings record);

    int updateByPrimaryKey(Buildings record);

    int getCount(Buildings record);

    List<Buildings> getPage(Buildings record);

}