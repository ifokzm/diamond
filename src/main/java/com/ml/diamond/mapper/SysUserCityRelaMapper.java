package com.ml.diamond.mapper;

import com.ml.diamond.entity.SysUserCityRela;

public interface SysUserCityRelaMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(SysUserCityRela record);

    int insertSelective(SysUserCityRela record);

    SysUserCityRela selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(SysUserCityRela record);

    int updateByPrimaryKey(SysUserCityRela record);
}