package com.ml.diamond.controller;

import com.ml.diamond.entity.SysUser;
import com.ml.diamond.service.SysUserService;
import com.ml.diamond.utils.DataGrid;
import com.ml.diamond.utils.ResponseEntity;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;


@Api(value = "用户管理", description = "用户管理")
@RestController
@RequestMapping("/api/user")
@Slf4j
public class UserController {

    @Autowired
    SysUserService service;

    @ApiOperation("登录")
    @PostMapping(value = "login")
    @ResponseBody
    public ResponseEntity<SysUser> login(@RequestParam(value = "username", required = true) String username,
                                         @RequestParam(value = "password", required = true) String password,
                                         @RequestParam(value = "keeplogin", required = false) String keeplogin) {

        SysUser sysUser = service.checkLogin(username, password);

        if (sysUser != null) {
            sysUser.setUrl("index.html");
            return new ResponseEntity(sysUser).success();
        } else {
            return new ResponseEntity(null).failure("登录失败");
        }
    }


    @ApiOperation("获取用户列表")
    @GetMapping(value = "/getPage", produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public DataGrid<SysUser> getPage(SysUser user) {
        return service.getPage(user);
    }


}
