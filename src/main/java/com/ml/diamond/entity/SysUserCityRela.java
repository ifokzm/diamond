package com.ml.diamond.entity;

import java.util.Date;

public class SysUserCityRela {
    private Integer id;

    private String userCode;

    private String cityCode;

    private Date svcBeginDate;

    private Date svcEndDate;

    private Integer downcount;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUserCode() {
        return userCode;
    }

    public void setUserCode(String userCode) {
        this.userCode = userCode == null ? null : userCode.trim();
    }

    public String getCityCode() {
        return cityCode;
    }

    public void setCityCode(String cityCode) {
        this.cityCode = cityCode == null ? null : cityCode.trim();
    }

    public Date getSvcBeginDate() {
        return svcBeginDate;
    }

    public void setSvcBeginDate(Date svcBeginDate) {
        this.svcBeginDate = svcBeginDate;
    }

    public Date getSvcEndDate() {
        return svcEndDate;
    }

    public void setSvcEndDate(Date svcEndDate) {
        this.svcEndDate = svcEndDate;
    }

    public Integer getDowncount() {
        return downcount;
    }

    public void setDowncount(Integer downcount) {
        this.downcount = downcount;
    }
}