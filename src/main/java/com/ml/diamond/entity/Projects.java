package com.ml.diamond.entity;

import com.fasterxml.jackson.annotation.JsonFormat;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.sql.Timestamp;
import java.util.Date;

@Data
public class Projects extends BaseEntity {
    @ApiModelProperty("项目号")
    private String projectId;

    @ApiModelProperty("项目名(备案名)")
    private String projectName;

    @ApiModelProperty("企业系")
    private String groupName;

    @ApiModelProperty("推广名")
    private String generalizeName;

    @ApiModelProperty("区")
    private String district;

    @ApiModelProperty("项目开发类型 A:开发商独立开发-默认  B:股权合作开发  C:分标段开发-分幢开发")
    private String projectDType;

    @ApiModelProperty("板块1")
    private String projectRegion;

    @ApiModelProperty("地址")
    private String location;

    @ApiModelProperty("开发商")
    private String developer;

    @ApiModelProperty("开盘日期")
    @JsonFormat(pattern = "yyyy-MM-dd")
    private Timestamp openDate;

    @ApiModelProperty("第一次开盘日期")
    @JsonFormat(pattern = "yyyy-MM-dd")
    private Timestamp firstOpenDate;

    private Long firstOpenDateTime;

    public Long getFirstOpenDateTime() {
        return null == firstOpenDate ? null : firstOpenDate.getTime() / 1000 ;
    }

    @ApiModelProperty("最近一次开盘")
    @JsonFormat(pattern = "yyyy-MM-dd")
    private Timestamp lastOpenDate;

    private Long lastOpenDateTime;

    public Long getLastOpenDateTime() {
        return null == lastOpenDate ? null : lastOpenDate.getTime() / 1000;
    }

    @ApiModelProperty("成交均价")
    private String transAvgPrice;
    @ApiModelProperty("成交总价")
    private String transTotalPrice;
    @ApiModelProperty("小微板块")
    private String projectRegion1;

    @ApiModelProperty("申报单价")
    private String declarePrice;
    @ApiModelProperty("申报总价")
    private String declareTotalPrice;

}