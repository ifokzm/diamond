package com.ml.diamond.entity;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;

import java.util.Date;

@Data
public class SysUser extends BaseEntity{

    private String userCode;

    private String userName;

    private String loginName;

    private String password;

    private String isAdmin;

    private String isLock;

    private String groupName;

    @JsonFormat(pattern="yyyy-MM-dd")
    private Date beginTime;

    @JsonFormat(pattern="yyyy-MM-dd")
    private Date endTime;

    @JsonFormat(pattern="yyyy-MM-dd")
    private Date createTime;


}