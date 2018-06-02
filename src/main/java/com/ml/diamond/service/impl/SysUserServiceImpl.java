package com.ml.diamond.service.impl;

import com.ml.diamond.config.DS;
import com.ml.diamond.config.DataSourceType;
import com.ml.diamond.entity.SysUser;
import com.ml.diamond.mapper.SysUserMapper;
import com.ml.diamond.service.SysUserService;
import com.ml.diamond.utils.DataGrid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SysUserServiceImpl implements SysUserService {
    @Autowired
    SysUserMapper sysUserMapper;

    @Override
    @DS(DataSourceType.Master)
    public DataGrid<SysUser> getPage(SysUser object) {
        DataGrid<SysUser> dg = new DataGrid<>();
        dg.setRows(sysUserMapper.getPage(object));
        dg.setTotal(sysUserMapper.getCount(object));
        return dg;
    }

    @Override
    public List<SysUser> getAllList(SysUser object) {
        return null;
    }

    @Override
    @DS(DataSourceType.Master)
    public SysUser checkLogin(String loginName, String password) {

        SysUser sysUser = sysUserMapper.selectUser(loginName, password);

        return sysUser;
    }
}
