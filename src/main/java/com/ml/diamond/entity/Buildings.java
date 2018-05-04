package com.ml.diamond.entity;

import io.swagger.annotations.ApiModelProperty;

import java.math.BigDecimal;
import java.util.Date;

public class Buildings extends BaseEntity {

    @ApiModelProperty("幢号")
    private String buildingId;

    @ApiModelProperty("项目号")
    private String projectId;

    @ApiModelProperty("幢名称")
    private String buildingName;

    @ApiModelProperty("项目名")
    private String projectName;

    @ApiModelProperty("合作开发项目属于哪个企业系")
    private String groupName;

    @ApiModelProperty("开盘日期")
    private Date openDate;

    @ApiModelProperty("入网总套数")
    private Integer onlineTotalcount;

    @ApiModelProperty("入网总面积")
    private BigDecimal onlineTotalarea;


    private Integer availableTotalcountweb;

    @ApiModelProperty("可售总套数")
    private Integer availableTotalcount;

    @ApiModelProperty("可售总面积")
    private BigDecimal availableTotalarea;

    @ApiModelProperty("预订套数")
    private Integer bookedTotalcount;

    @ApiModelProperty("已售套数")
    private Integer soldTotalcount;

    @ApiModelProperty("已售套数")
    private BigDecimal soldTotalarea;

    @ApiModelProperty("已售套数")
    private BigDecimal soldAvgprice;

    @ApiModelProperty("户列表网址")
    private String roomUrl;

    private Date insertdate;

    @ApiModelProperty("今日预订个数")
    private Integer todayBookedcount;

    @ApiModelProperty("今日已售个数")
    private Integer todaySoldcount;

    private Integer isupdate;

    @ApiModelProperty("总层数")
    private Integer roomTopfloor;

    @ApiModelProperty("楼层性质")
    private String buildingtype;

    @ApiModelProperty("预售证号")
    private String presellId;

    @ApiModelProperty("预售证名称")
    private String presellName;

    @ApiModelProperty("备用幢编号")
    private String buildingIdt;

    private String buildingTyped;

    @ApiModelProperty("已售住宅均价")
    private BigDecimal soldHouseavgprice;

    @ApiModelProperty("已售商业均价")
    private BigDecimal soldBusinessavgprice;

    @ApiModelProperty("已售住宅面积")
    private BigDecimal soldHousetotalarea;

    @ApiModelProperty("已售商业面积")
    private BigDecimal soldBusinesstotalarea;

    private Date updatedate;

    public String getBuildingId() {
        return buildingId;
    }

    public void setBuildingId(String buildingId) {
        this.buildingId = buildingId == null ? null : buildingId.trim();
    }

    public String getProjectId() {
        return projectId;
    }

    public void setProjectId(String projectId) {
        this.projectId = projectId == null ? null : projectId.trim();
    }

    public String getBuildingName() {
        return buildingName;
    }

    public void setBuildingName(String buildingName) {
        this.buildingName = buildingName == null ? null : buildingName.trim();
    }

    public String getProjectName() {
        return projectName;
    }

    public void setProjectName(String projectName) {
        this.projectName = projectName == null ? null : projectName.trim();
    }

    public String getGroupName() {
        return groupName;
    }

    public void setGroupName(String groupName) {
        this.groupName = groupName == null ? null : groupName.trim();
    }

    public Date getOpenDate() {
        return openDate;
    }

    public void setOpenDate(Date openDate) {
        this.openDate = openDate;
    }

    public Integer getOnlineTotalcount() {
        return onlineTotalcount;
    }

    public void setOnlineTotalcount(Integer onlineTotalcount) {
        this.onlineTotalcount = onlineTotalcount;
    }

    public BigDecimal getOnlineTotalarea() {
        return onlineTotalarea;
    }

    public void setOnlineTotalarea(BigDecimal onlineTotalarea) {
        this.onlineTotalarea = onlineTotalarea;
    }

    public Integer getAvailableTotalcountweb() {
        return availableTotalcountweb;
    }

    public void setAvailableTotalcountweb(Integer availableTotalcountweb) {
        this.availableTotalcountweb = availableTotalcountweb;
    }

    public Integer getAvailableTotalcount() {
        return availableTotalcount;
    }

    public void setAvailableTotalcount(Integer availableTotalcount) {
        this.availableTotalcount = availableTotalcount;
    }

    public BigDecimal getAvailableTotalarea() {
        return availableTotalarea;
    }

    public void setAvailableTotalarea(BigDecimal availableTotalarea) {
        this.availableTotalarea = availableTotalarea;
    }

    public Integer getBookedTotalcount() {
        return bookedTotalcount;
    }

    public void setBookedTotalcount(Integer bookedTotalcount) {
        this.bookedTotalcount = bookedTotalcount;
    }

    public Integer getSoldTotalcount() {
        return soldTotalcount;
    }

    public void setSoldTotalcount(Integer soldTotalcount) {
        this.soldTotalcount = soldTotalcount;
    }

    public BigDecimal getSoldTotalarea() {
        return soldTotalarea;
    }

    public void setSoldTotalarea(BigDecimal soldTotalarea) {
        this.soldTotalarea = soldTotalarea;
    }

    public BigDecimal getSoldAvgprice() {
        return soldAvgprice;
    }

    public void setSoldAvgprice(BigDecimal soldAvgprice) {
        this.soldAvgprice = soldAvgprice;
    }

    public String getRoomUrl() {
        return roomUrl;
    }

    public void setRoomUrl(String roomUrl) {
        this.roomUrl = roomUrl == null ? null : roomUrl.trim();
    }

    public Date getInsertdate() {
        return insertdate;
    }

    public void setInsertdate(Date insertdate) {
        this.insertdate = insertdate;
    }

    public Integer getTodayBookedcount() {
        return todayBookedcount;
    }

    public void setTodayBookedcount(Integer todayBookedcount) {
        this.todayBookedcount = todayBookedcount;
    }

    public Integer getTodaySoldcount() {
        return todaySoldcount;
    }

    public void setTodaySoldcount(Integer todaySoldcount) {
        this.todaySoldcount = todaySoldcount;
    }

    public Integer getIsupdate() {
        return isupdate;
    }

    public void setIsupdate(Integer isupdate) {
        this.isupdate = isupdate;
    }

    public Integer getRoomTopfloor() {
        return roomTopfloor;
    }

    public void setRoomTopfloor(Integer roomTopfloor) {
        this.roomTopfloor = roomTopfloor;
    }

    public String getBuildingtype() {
        return buildingtype;
    }

    public void setBuildingtype(String buildingtype) {
        this.buildingtype = buildingtype == null ? null : buildingtype.trim();
    }

    public String getPresellId() {
        return presellId;
    }

    public void setPresellId(String presellId) {
        this.presellId = presellId == null ? null : presellId.trim();
    }

    public String getPresellName() {
        return presellName;
    }

    public void setPresellName(String presellName) {
        this.presellName = presellName == null ? null : presellName.trim();
    }

    public String getBuildingIdt() {
        return buildingIdt;
    }

    public void setBuildingIdt(String buildingIdt) {
        this.buildingIdt = buildingIdt == null ? null : buildingIdt.trim();
    }

    public String getBuildingTyped() {
        return buildingTyped;
    }

    public void setBuildingTyped(String buildingTyped) {
        this.buildingTyped = buildingTyped == null ? null : buildingTyped.trim();
    }

    public BigDecimal getSoldHouseavgprice() {
        return soldHouseavgprice;
    }

    public void setSoldHouseavgprice(BigDecimal soldHouseavgprice) {
        this.soldHouseavgprice = soldHouseavgprice;
    }

    public BigDecimal getSoldBusinessavgprice() {
        return soldBusinessavgprice;
    }

    public void setSoldBusinessavgprice(BigDecimal soldBusinessavgprice) {
        this.soldBusinessavgprice = soldBusinessavgprice;
    }

    public BigDecimal getSoldHousetotalarea() {
        return soldHousetotalarea;
    }

    public void setSoldHousetotalarea(BigDecimal soldHousetotalarea) {
        this.soldHousetotalarea = soldHousetotalarea;
    }

    public BigDecimal getSoldBusinesstotalarea() {
        return soldBusinesstotalarea;
    }

    public void setSoldBusinesstotalarea(BigDecimal soldBusinesstotalarea) {
        this.soldBusinesstotalarea = soldBusinesstotalarea;
    }

    public Date getUpdatedate() {
        return updatedate;
    }

    public void setUpdatedate(Date updatedate) {
        this.updatedate = updatedate;
    }
}