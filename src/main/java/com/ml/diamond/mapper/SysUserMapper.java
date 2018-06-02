package com.ml.diamond.mapper;

import com.ml.diamond.entity.SysUser;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface SysUserMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(SysUser record);

    int insertSelective(SysUser record);

    SysUser selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(SysUser record);

    int updateByPrimaryKey(SysUser record);

    int getCount(SysUser record);

    List<SysUser> getPage(SysUser record);

    SysUser selectUser(@Param("loginName") String loginName, @Param("password") String password);
}