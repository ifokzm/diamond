package com.ml.diamond.entity;

import com.fasterxml.jackson.annotation.JsonFormat;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.math.BigDecimal;
import java.sql.Timestamp;
import java.util.Date;

@Data
public class Buildings extends BaseEntity {

    @ApiModelProperty("项目编号")
    private String projectId;

    @ApiModelProperty("项目名称")
    private String projectName;

    @ApiModelProperty("幢号")
    private String buildingId;

    @ApiModelProperty("幢名称")
    private String buildingName;

    @ApiModelProperty("合作开发项目属于哪个企业系")
    private String groupName;

    @ApiModelProperty("开盘日期")
    @JsonFormat(pattern = "yyyy-MM-dd")
    private Timestamp openDate;

    @ApiModelProperty("总层数")
    private String roomTopFloor;

}