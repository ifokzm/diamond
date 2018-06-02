package com.ml.diamond.service;

import com.ml.diamond.entity.SysUser;

public interface SysUserService extends BaseService<SysUser> {

    SysUser checkLogin(String loginName, String password);

}
