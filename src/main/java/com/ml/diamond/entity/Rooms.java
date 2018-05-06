package com.ml.diamond.entity;

import com.fasterxml.jackson.annotation.JsonFormat;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.util.Date;

@Data
public class Rooms extends BaseEntity {
    @ApiModelProperty("项目编号")
    private String projectId;

    @ApiModelProperty("项目名称")
    private String projectName;

    @ApiModelProperty("幢号")
    private String buildingId;

    @ApiModelProperty("幢名称")
    private String buildingName;

    @ApiModelProperty("户编号")
    private String roomId;

    @ApiModelProperty("户名")
    private String roomName;

    @ApiModelProperty("销售状态")
    private String roomStatus;

    @ApiModelProperty("建筑面积")
    private String roomBuildArea;

    @ApiModelProperty("公摊面积")
    private String roomShareArea;

    @ApiModelProperty("内部面积")
    private String roomInsideArea;

    @ApiModelProperty("所在层")
    private String roomFloor;

    @ApiModelProperty("建筑结构")
    private String roomStructure;

    @ApiModelProperty("参考价,可能是总价")
    private String roomRefPrice;

    @ApiModelProperty("参考价,可能是总价")
    private String roomTotalPrice;

    @ApiModelProperty("单元号")
    private String unitName;

    @ApiModelProperty("位置")
    private String roomLocation;

    @ApiModelProperty("大类划分：商品房，商品配套，基础配套，拆迁房，经适房，工业    说明：商品配套-可以销售，基础配套-不可以销售")
    private String roomRelocation;

    @ApiModelProperty("交易日期")
    @JsonFormat(pattern = "yyyy-MM-dd")
    private Date transDate;

    @ApiModelProperty("交易均价")
    private String transavgPrice;

    @ApiModelProperty("交易总价")
    private String transTotalPrice;

    @ApiModelProperty("交易可售")
    private String transFromTo;

    @ApiModelProperty("物业类型")
    private String roomUsage;

    @ApiModelProperty("装修情况")
    private String roomZhuangXiu;

    @ApiModelProperty("房型")
    private String roomType;
}