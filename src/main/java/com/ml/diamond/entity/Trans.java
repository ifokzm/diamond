package com.ml.diamond.entity;

import com.fasterxml.jackson.annotation.JsonFormat;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

@Data
public class Trans extends BaseEntity {

    private String rec;
    @ApiModelProperty("项目名称")
    private String projectName;
    @ApiModelProperty("项目推广名")
    private String generalizeName;
    @ApiModelProperty("区域")
    private String district;
    @ApiModelProperty("板块")
    private String projectRegion;
    @ApiModelProperty("微板块")
    private String projectRegiont;
    @ApiModelProperty("幢号")
    private String buildingId;
    @ApiModelProperty("幢号")
    private String buildingName;
    @ApiModelProperty("房号")
    private String roomName;
    @ApiModelProperty("面积")
    private String roomBuildArea;
    @ApiModelProperty("户型")
    private String roomType;
    @ApiModelProperty("用途")
    private String roomUsage;
    @ApiModelProperty("房源状态")
    private String roomStatus;
    @ApiModelProperty("申报均价")
    private String roomRefPrice;
    @ApiModelProperty("交易均价")
    private String transAvgPrice;
    @ApiModelProperty("交易总价")
    private String transTotalPrice;
    @ApiModelProperty("交易日期")
    private String transDate;
    @ApiModelProperty("交易类型")
    private String transType;
    @ApiModelProperty("交易类型")
    private String transFromTo;
    @ApiModelProperty("所在层数")
    private String roomFloor;
    @ApiModelProperty("开盘日期")
    private String openDate;
    @ApiModelProperty("项目ID")
    private String projectId;
    @ApiModelProperty("项目推广名")
    private String groupName;
    @ApiModelProperty("项目推广名")
    private String agent;
    @ApiModelProperty("项目推广名")
    private String buildingType;
    @ApiModelProperty("项目推广名")
    private String developer;
    @ApiModelProperty("项目推广名")
    private String projectDType;
    @ApiModelProperty("项目推广名")
    private String buildingGroupName;
    @ApiModelProperty("最高层")
    private String roomTopFloor;
    @ApiModelProperty("房源状态")
    private String roomReLocation;

    @JsonFormat(pattern = "yyyy-MM-dd")
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date transBeginDate;
    @JsonFormat(pattern = "yyyy-MM-dd")
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date transEndDate;
}