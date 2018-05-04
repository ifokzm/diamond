package com.ml.diamond.entity;

import java.math.BigDecimal;
import java.util.Date;

public class Trans extends BaseEntity {
    private Date transDate;

    private String transTime;

    private String projectId;

    private String projectName;

    private String district;

    private String buildingId;

    private String buildingName;

    private String roomId;

    private String roomName;

    private String transType;

    private BigDecimal transArea;

    private BigDecimal transAvgprice;

    private String roomUsage;

    private String roomType;

    private BigDecimal pAvgprice;

    private String transFromto;

    private BigDecimal pHouseavgprice;

    private BigDecimal pBusinessavgprice;

    private BigDecimal pOfficeavgprice;

    private BigDecimal transTotalprice;

    private String generalizeName;

    private String roomM;

    private String roomRefprice;

    public Date getTransDate() {
        return transDate;
    }

    public void setTransDate(Date transDate) {
        this.transDate = transDate;
    }

    public String getTransTime() {
        return transTime;
    }

    public void setTransTime(String transTime) {
        this.transTime = transTime == null ? null : transTime.trim();
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

    public String getTransType() {
        return transType;
    }

    public void setTransType(String transType) {
        this.transType = transType == null ? null : transType.trim();
    }

    public BigDecimal getTransArea() {
        return transArea;
    }

    public void setTransArea(BigDecimal transArea) {
        this.transArea = transArea;
    }

    public BigDecimal getTransAvgprice() {
        return transAvgprice;
    }

    public void setTransAvgprice(BigDecimal transAvgprice) {
        this.transAvgprice = transAvgprice;
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

    public BigDecimal getpAvgprice() {
        return pAvgprice;
    }

    public void setpAvgprice(BigDecimal pAvgprice) {
        this.pAvgprice = pAvgprice;
    }

    public String getTransFromto() {
        return transFromto;
    }

    public void setTransFromto(String transFromto) {
        this.transFromto = transFromto == null ? null : transFromto.trim();
    }

    public BigDecimal getpHouseavgprice() {
        return pHouseavgprice;
    }

    public void setpHouseavgprice(BigDecimal pHouseavgprice) {
        this.pHouseavgprice = pHouseavgprice;
    }

    public BigDecimal getpBusinessavgprice() {
        return pBusinessavgprice;
    }

    public void setpBusinessavgprice(BigDecimal pBusinessavgprice) {
        this.pBusinessavgprice = pBusinessavgprice;
    }

    public BigDecimal getpOfficeavgprice() {
        return pOfficeavgprice;
    }

    public void setpOfficeavgprice(BigDecimal pOfficeavgprice) {
        this.pOfficeavgprice = pOfficeavgprice;
    }

    public BigDecimal getTransTotalprice() {
        return transTotalprice;
    }

    public void setTransTotalprice(BigDecimal transTotalprice) {
        this.transTotalprice = transTotalprice;
    }

    public String getGeneralizeName() {
        return generalizeName;
    }

    public void setGeneralizeName(String generalizeName) {
        this.generalizeName = generalizeName == null ? null : generalizeName.trim();
    }

    public String getRoomM() {
        return roomM;
    }

    public void setRoomM(String roomM) {
        this.roomM = roomM == null ? null : roomM.trim();
    }

    public String getRoomRefprice() {
        return roomRefprice;
    }

    public void setRoomRefprice(String roomRefprice) {
        this.roomRefprice = roomRefprice == null ? null : roomRefprice.trim();
    }
}