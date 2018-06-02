package com.ml.diamond.mapper;

import com.ml.diamond.entity.SysCity;
import com.ml.diamond.entity.SysUser;

import java.util.List;

public interface SysCityMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(SysCity record);

    int insertSelective(SysCity record);

    SysCity selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(SysCity record);

    int updateByPrimaryKey(SysCity record);

    int getCount(SysCity record);

    List<SysCity> getPage(SysCity record);
}