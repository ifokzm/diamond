package com.ml.diamond.mapper;

import com.ml.diamond.entity.Buildings;
import com.ml.diamond.entity.Trans;

import java.util.List;

public interface TransMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Trans record);

    int insertSelective(Trans record);

    Trans selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Trans record);

    int updateByPrimaryKey(Trans record);

    int getCount(Trans record);

    List<Trans> getPage(Trans record);
}