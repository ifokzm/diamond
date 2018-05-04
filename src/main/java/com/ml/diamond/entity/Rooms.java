package com.ml.diamond.entity;

import io.swagger.annotations.ApiModelProperty;

import java.math.BigDecimal;
import java.util.Date;

public class Rooms  extends BaseEntity{
    @ApiModelProperty("户编号")
    private String roomId;

    @ApiModelProperty("户名")
    private String roomName;

    @ApiModelProperty("项目编号")
    private String projectId;

    @ApiModelProperty("项目名称")
    private String projectName;

    @ApiModelProperty("区")
    private String district;

    @ApiModelProperty("幢号")
    private String buildingId;

    @ApiModelProperty("幢名称")
    private String buildingName;

    private String roomusageNew;

    @ApiModelProperty("一般住宅，联排，叠排，独栋等")
    private String roomUsage11;

    @ApiModelProperty("房型，几室几厅")
    private String roomTypeurl;

    @ApiModelProperty("建筑面积")
    private BigDecimal roomBuildarea;

    @ApiModelProperty("销售状态")
    private String roomStatus;

    private Date insertdate;

    @ApiModelProperty("参考价,可能是总价")
    private String roomRefprice;

    @ApiModelProperty("位置")
    private String roomLocation;

    @ApiModelProperty("公摊面积")
    private BigDecimal roomSharearea;

    @ApiModelProperty("内部面积")
    private BigDecimal roomInsidearea;

    @ApiModelProperty("户网址")
    private String roomUrl;

    @ApiModelProperty("户型名称")
    private String roomHx;

    @ApiModelProperty("一般住宅，联排，叠排，独栋等")
    private String roomUsageurl;

    @ApiModelProperty("户型参考价")
    private BigDecimal roomReferprice;

    @ApiModelProperty("推广名")
    private String generalizeName;

    @ApiModelProperty("交易平均价")
    private BigDecimal transAvgprice;

    @ApiModelProperty("交易总价")
    private BigDecimal transTotalprice;

    @ApiModelProperty("交易日期")
    private Date transDate;

    @ApiModelProperty("交易类型")
    private String transType;

    @ApiModelProperty("交易变化")
    private String transFromto;

    @ApiModelProperty("所在层")
    private Integer roomFloor;

    @ApiModelProperty("销售状态颜色")
    private String roomStatuscolor;

    private String roomIdt;

    private String roomUsage;

    private String roomType;

    private String roomRelocationd;

    @ApiModelProperty("-大类划分：商品房，商品配套，基础配套，拆迁房，经适房，工业    说明：商品配套-可以销售，基础配套-不可以销售")
    private String roomRelocation;

    private Date updatedate;

    public String getRoomId() {
        return roomId;
    }

    public void setRoomId(String roomId) {
        this.roomId = roomId == null ? null : roomId.trim();
    }

    public String getRoomName() {
        return roomName;
    }

    public void setRoomName(String roomName) {
        this.roomName = roomName == null ? null : roomName.trim();
    }

    public String getProjectId() {
        return projectId;
    }

    public void setProjectId(String projectId) {
        this.projectId = projectId == null ? null : projectId.trim();
    }

    public String getProjectName() {
        return projectName;
    }

    public void setProjectName(String projectName) {
        this.projectName = projectName == null ? null : projectName.trim();
    }

    public String getDistrict() {
        return district;
    }

    public void setDistrict(String district) {
        this.district = district == null ? null : district.trim();
    }

    public String getBuildingId() {
        return buildingId;
    }

    public void setBuildingId(String buildingId) {
        this.buildingId = buildingId == null ? null : buildingId.trim();
    }

    public String getBuildingName() {
        return buildingName;
    }

    public void setBuildingName(String buildingName) {
        this.buildingName = buildingName == null ? null : buildingName.trim();
    }

    public String getRoomusageNew() {
        return roomusageNew;
    }

    public void setRoomusageNew(String roomusageNew) {
        this.roomusageNew = roomusageNew == null ? null : roomusageNew.trim();
    }

    public String getRoomUsage11() {
        return roomUsage11;
    }

    public void setRoomUsage11(String roomUsage11) {
        this.roomUsage11 = roomUsage11 == null ? null : roomUsage11.trim();
    }

    public String getRoomTypeurl() {
        return roomTypeurl;
    }

    public void setRoomTypeurl(String roomTypeurl) {
        this.roomTypeurl = roomTypeurl == null ? null : roomTypeurl.trim();
    }

    public BigDecimal getRoomBuildarea() {
        return roomBuildarea;
    }

    public void setRoomBuildarea(BigDecimal roomBuildarea) {
        this.roomBuildarea = roomBuildarea;
    }

    public String getRoomStatus() {
        return roomStatus;
    }

    public void setRoomStatus(String roomStatus) {
        this.roomStatus = roomStatus == null ? null : roomStatus.trim();
    }

    public Date getInsertdate() {
        return insertdate;
    }

    public void setInsertdate(Date insertdate) {
        this.insertdate = insertdate;
    }

    public String getRoomRefprice() {
        return roomRefprice;
    }

    public void setRoomRefprice(String roomRefprice) {
        this.roomRefprice = roomRefprice == null ? null : roomRefprice.trim();
    }

    public String getRoomLocation() {
        return roomLocation;
    }

    public void setRoomLocation(String roomLocation) {
        this.roomLocation = roomLocation == null ? null : roomLocation.trim();
    }

    public BigDecimal getRoomSharearea() {
        return roomSharearea;
    }

    public void setRoomSharearea(BigDecimal roomSharearea) {
        this.roomSharearea = roomSharearea;
    }

    public BigDecimal getRoomInsidearea() {
        return roomInsidearea;
    }

    public void setRoomInsidearea(BigDecimal roomInsidearea) {
        this.roomInsidearea = roomInsidearea;
    }

    public String getRoomUrl() {
        return roomUrl;
    }

    public void setRoomUrl(String roomUrl) {
        this.roomUrl = roomUrl == null ? null : roomUrl.trim();
    }

    public String getRoomHx() {
        return roomHx;
    }

    public void setRoomHx(String roomHx) {
        this.roomHx = roomHx == null ? null : roomHx.trim();
    }

    public String getRoomUsageurl() {
        return roomUsageurl;
    }

    public void setRoomUsageurl(String roomUsageurl) {
        this.roomUsageurl = roomUsageurl == null ? null : roomUsageurl.trim();
    }

    public BigDecimal getRoomReferprice() {
        return roomReferprice;
    }

    public void setRoomReferprice(BigDecimal roomReferprice) {
        this.roomReferprice = roomReferprice;
    }

    public String getGeneralizeName() {
        return generalizeName;
    }

    public void setGeneralizeName(String generalizeName) {
        this.generalizeName = generalizeName == null ? null : generalizeName.trim();
    }

    public BigDecimal getTransAvgprice() {
        return transAvgprice;
    }

    public void setTransAvgprice(BigDecimal transAvgprice) {
        this.transAvgprice = transAvgprice;
    }

    public BigDecimal getTransTotalprice() {
        return transTotalprice;
    }

    public void setTransTotalprice(BigDecimal transTotalprice) {
        this.transTotalprice = transTotalprice;
    }

    public Date getTransDate() {
        return transDate;
    }

    public void setTransDate(Date transDate) {
        this.transDate = transDate;
    }

    public String getTransType() {
        return transType;
    }

    public void setTransType(String transType) {
        this.transType = transType == null ? null : transType.trim();
    }

    public String getTransFromto() {
        return transFromto;
    }

    public void setTransFromto(String transFromto) {
        this.transFromto = transFromto == null ? null : transFromto.trim();
    }

    public Integer getRoomFloor() {
        return roomFloor;
    }

    public void setRoomFloor(Integer roomFloor) {
        this.roomFloor = roomFloor;
    }

    public String getRoomStatuscolor() {
        return roomStatuscolor;
    }

    public void setRoomStatuscolor(String roomStatuscolor) {
        this.roomStatuscolor = roomStatuscolor == null ? null : roomStatuscolor.trim();
    }

    public String getRoomIdt() {
        return roomIdt;
    }

    public void setRoomIdt(String roomIdt) {
        this.roomIdt = roomIdt == null ? null : roomIdt.trim();
    }

    public String getRoomUsage() {
        return roomUsage;
    }

    public void setRoomUsage(String roomUsage) {
        this.roomUsage = roomUsage == null ? null : roomUsage.trim();
    }

    public String getRoomType() {
        return roomType;
    }

    public void setRoomType(String roomType) {
        this.roomType = roomType == null ? null : roomType.trim();
    }

    public String getRoomRelocationd() {
        return roomRelocationd;
    }

    public void setRoomRelocationd(String roomRelocationd) {
        this.roomRelocationd = roomRelocationd == null ? null : roomRelocationd.trim();
    }

    public String getRoomRelocation() {
        return roomRelocation;
    }

    public void setRoomRelocation(String roomRelocation) {
        this.roomRelocation = roomRelocation == null ? null : roomRelocation.trim();
    }

    public Date getUpdatedate() {
        return updatedate;
    }

    public void setUpdatedate(Date updatedate) {
        this.updatedate = updatedate;
    }
}