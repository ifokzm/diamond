package com.ml.diamond.entity;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.math.BigDecimal;
import java.util.Date;

public class Projects extends BaseEntity {
    @ApiModelProperty("项目号")
    private String projectId;

    @ApiModelProperty("")
    private String project365id;

    private String prjid;

    @ApiModelProperty("项目名")
    private String projectName;

    @ApiModelProperty("推广名")
    private String generalizeName;

    @ApiModelProperty("开发商")
    private String developer;

    @ApiModelProperty("开发商")
    private String developerurl;

    @ApiModelProperty("开盘日期")
    private Date openDate;

    @ApiModelProperty("土地证")
    private String projectLandname;

    @ApiModelProperty("代理商")
    private String agent;

    @ApiModelProperty("代理商")
    private String agenturl;

    @ApiModelProperty("工程规划许可证")
    private String projectPlanningpermit;

    @ApiModelProperty("区")
    private String district;

    @ApiModelProperty("")
    private String projectregionFc;

    @ApiModelProperty("板块1")
    private String projectregion;

    @ApiModelProperty("城镇板块2")
    private String townregion;

    @ApiModelProperty("地址")
    private String location;

    @ApiModelProperty("入网总套数")
    private Integer onlineTotalcount;

    @ApiModelProperty("入网总面积")
    private BigDecimal onlineTotalarea;

    @ApiModelProperty("可售套数")
    private Integer availableTotalcount;

    @ApiModelProperty("可售面积")
    private BigDecimal availableTotalarea;

    @ApiModelProperty("车库可售套数")
    private Integer availableCarportcount;

    @ApiModelProperty("预订套数")
    private Integer bookedTotalcount;

    @ApiModelProperty("已售套数")
    private Integer soldTotalcount;

    @ApiModelProperty("已售面积")
    private BigDecimal soldTotalarea;

    @ApiModelProperty("均价")
    private BigDecimal soldAvgprice;

    @ApiModelProperty("住宅均价")
    private BigDecimal soldHouseavgprice;

    @ApiModelProperty("办公均价")
    private BigDecimal soldOfficeavgprice;

    @ApiModelProperty("商业均价")
    private BigDecimal soldBusinessavgprice;

    @ApiModelProperty("今日预订套数")
    private Integer todayBookedcount;

    @ApiModelProperty("今日成交套数")
    private Integer todaySoldcount;

    @ApiModelProperty("幢网址")
    private String buildingUrl;

    @ApiModelProperty("插入日期")
    private Date insertdate;

    private Integer isupdate;

    private Integer bookedtoday;

    private Integer soldtoday;

    @ApiModelProperty("当月住宅均价")
    private BigDecimal monthHouseavgprice;

    @ApiModelProperty("当月办公均价")
    private BigDecimal monthOfficeavgprice;

    @ApiModelProperty("当月商业均价")
    private BigDecimal monthBusinessavgprice;

    @ApiModelProperty("已售住宅套数")
    private Integer soldHousetotalcount;

    @ApiModelProperty("已售住宅面积")
    private BigDecimal soldHousetotalarea;

    @ApiModelProperty("已售商业套数")
    private Integer soldBusinesstotalcount;

    @ApiModelProperty("已售商业面积")
    private BigDecimal soldBusinesstotalarea;

    @ApiModelProperty("已售办公套数")
    private Integer soldOfficetotalcount;

    @ApiModelProperty("已售办公面积")
    private BigDecimal soldOfficetotalarea;

    @ApiModelProperty("已售其他套数")
    private Integer soldOthertotalcount;

    @ApiModelProperty("已售其他面积")
    private BigDecimal soldOthertotalarea;

    @ApiModelProperty("项目用途 住宅，商业")
    private String projectUsage;

    @ApiModelProperty("售楼热线")
    private String sellerPhone;

    @ApiModelProperty("主力户型")
    private String projectMainroomhx;

    @ApiModelProperty("参考均价")
    private String projectReferprice;

    @ApiModelProperty("项目特色")
    private String projectTese;

    @ApiModelProperty("产权年限")
    private String projectPropertyage;

    @ApiModelProperty("得房率")
    private String projectGetroomrate;

    @ApiModelProperty("物业费")
    private String projectWuyemoney;

    @ApiModelProperty("装修状况")
    private String projectRenovation;

    @ApiModelProperty("绿化率")
    private String projectGreenrate;

    @ApiModelProperty("售楼地址")
    private String sellerAddress;

    @ApiModelProperty("容积率")
    private String projectRate;

    @ApiModelProperty("第一次开盘日期")
    private Date firstOpendate;

    @ApiModelProperty("最近一次开盘")
    private Date lastOpendate;

    @ApiModelProperty("企业系")
    private String groupName;

    @ApiModelProperty("住宅入网套数")
    private Integer onlineHousetotalcount;

    @ApiModelProperty("住宅入网面积")
    private BigDecimal onlineHousetotalarea;

    @ApiModelProperty("环线")
    private String ringregion;

    @ApiModelProperty("经度")
    private Double lat;

    @ApiModelProperty("纬度")
    private Double lng;

    @ApiModelProperty("物业管理公司")
    private String propertymanagementcompanies;

    @ApiModelProperty("")
    private Integer isWebdisplay;

    @ApiModelProperty("")
    private String projectGdid;

    @ApiModelProperty("")
    private Integer isoperate;

    @ApiModelProperty("地块编号")
    private String landId;

    @ApiModelProperty("板块1")
    private String projectregion1;

    @ApiModelProperty("板块1")
    private String projectregiont;

    @ApiModelProperty("项目开发类型 A:开发商独立开发-默认  B:股权合作开发  C:分标段开发-分幢开发")
    private String projectDType;

    @ApiModelProperty("项目编号")
    private String projectIdold;

    @ApiModelProperty("预订面积")
    private BigDecimal bookedTotalarea;

    @ApiModelProperty("项目简介")
    private String projectInfo;

    public String getProjectId() {
        return projectId;
    }

    public void setProjectId(String projectId) {
        this.projectId = projectId == null ? null : projectId.trim();
    }

    public String getProject365id() {
        return project365id;
    }

    public void setProject365id(String project365id) {
        this.project365id = project365id == null ? null : project365id.trim();
    }

    public String getPrjid() {
        return prjid;
    }

    public void setPrjid(String prjid) {
        this.prjid = prjid == null ? null : prjid.trim();
    }

    public String getProjectName() {
        return projectName;
    }

    public void setProjectName(String projectName) {
        this.projectName = projectName == null ? null : projectName.trim();
    }

    public String getGeneralizeName() {
        return generalizeName;
    }

    public void setGeneralizeName(String generalizeName) {
        this.generalizeName = generalizeName == null ? null : generalizeName.trim();
    }

    public String getDeveloper() {
        return developer;
    }

    public void setDeveloper(String developer) {
        this.developer = developer == null ? null : developer.trim();
    }

    public String getDeveloperurl() {
        return developerurl;
    }

    public void setDeveloperurl(String developerurl) {
        this.developerurl = developerurl == null ? null : developerurl.trim();
    }

    public Date getOpenDate() {
        return openDate;
    }

    public void setOpenDate(Date openDate) {
        this.openDate = openDate;
    }

    public String getProjectLandname() {
        return projectLandname;
    }

    public void setProjectLandname(String projectLandname) {
        this.projectLandname = projectLandname == null ? null : projectLandname.trim();
    }

    public String getAgent() {
        return agent;
    }

    public void setAgent(String agent) {
        this.agent = agent == null ? null : agent.trim();
    }

    public String getAgenturl() {
        return agenturl;
    }

    public void setAgenturl(String agenturl) {
        this.agenturl = agenturl == null ? null : agenturl.trim();
    }

    public String getProjectPlanningpermit() {
        return projectPlanningpermit;
    }

    public void setProjectPlanningpermit(String projectPlanningpermit) {
        this.projectPlanningpermit = projectPlanningpermit == null ? null : projectPlanningpermit.trim();
    }

    public String getDistrict() {
        return district;
    }

    public void setDistrict(String district) {
        this.district = district == null ? null : district.trim();
    }

    public String getProjectregionFc() {
        return projectregionFc;
    }

    public void setProjectregionFc(String projectregionFc) {
        this.projectregionFc = projectregionFc == null ? null : projectregionFc.trim();
    }

    public String getProjectregion() {
        return projectregion;
    }

    public void setProjectregion(String projectregion) {
        this.projectregion = projectregion == null ? null : projectregion.trim();
    }

    public String getTownregion() {
        return townregion;
    }

    public void setTownregion(String townregion) {
        this.townregion = townregion == null ? null : townregion.trim();
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location == null ? null : location.trim();
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

    public Integer getAvailableCarportcount() {
        return availableCarportcount;
    }

    public void setAvailableCarportcount(Integer availableCarportcount) {
        this.availableCarportcount = availableCarportcount;
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

    public BigDecimal getSoldHouseavgprice() {
        return soldHouseavgprice;
    }

    public void setSoldHouseavgprice(BigDecimal soldHouseavgprice) {
        this.soldHouseavgprice = soldHouseavgprice;
    }

    public BigDecimal getSoldOfficeavgprice() {
        return soldOfficeavgprice;
    }

    public void setSoldOfficeavgprice(BigDecimal soldOfficeavgprice) {
        this.soldOfficeavgprice = soldOfficeavgprice;
    }

    public BigDecimal getSoldBusinessavgprice() {
        return soldBusinessavgprice;
    }

    public void setSoldBusinessavgprice(BigDecimal soldBusinessavgprice) {
        this.soldBusinessavgprice = soldBusinessavgprice;
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

    public String getBuildingUrl() {
        return buildingUrl;
    }

    public void setBuildingUrl(String buildingUrl) {
        this.buildingUrl = buildingUrl == null ? null : buildingUrl.trim();
    }

    public Date getInsertdate() {
        return insertdate;
    }

    public void setInsertdate(Date insertdate) {
        this.insertdate = insertdate;
    }

    public Integer getIsupdate() {
        return isupdate;
    }

    public void setIsupdate(Integer isupdate) {
        this.isupdate = isupdate;
    }

    public Integer getBookedtoday() {
        return bookedtoday;
    }

    public void setBookedtoday(Integer bookedtoday) {
        this.bookedtoday = bookedtoday;
    }

    public Integer getSoldtoday() {
        return soldtoday;
    }

    public void setSoldtoday(Integer soldtoday) {
        this.soldtoday = soldtoday;
    }

    public BigDecimal getMonthHouseavgprice() {
        return monthHouseavgprice;
    }

    public void setMonthHouseavgprice(BigDecimal monthHouseavgprice) {
        this.monthHouseavgprice = monthHouseavgprice;
    }

    public BigDecimal getMonthOfficeavgprice() {
        return monthOfficeavgprice;
    }

    public void setMonthOfficeavgprice(BigDecimal monthOfficeavgprice) {
        this.monthOfficeavgprice = monthOfficeavgprice;
    }

    public BigDecimal getMonthBusinessavgprice() {
        return monthBusinessavgprice;
    }

    public void setMonthBusinessavgprice(BigDecimal monthBusinessavgprice) {
        this.monthBusinessavgprice = monthBusinessavgprice;
    }

    public Integer getSoldHousetotalcount() {
        return soldHousetotalcount;
    }

    public void setSoldHousetotalcount(Integer soldHousetotalcount) {
        this.soldHousetotalcount = soldHousetotalcount;
    }

    public BigDecimal getSoldHousetotalarea() {
        return soldHousetotalarea;
    }

    public void setSoldHousetotalarea(BigDecimal soldHousetotalarea) {
        this.soldHousetotalarea = soldHousetotalarea;
    }

    public Integer getSoldBusinesstotalcount() {
        return soldBusinesstotalcount;
    }

    public void setSoldBusinesstotalcount(Integer soldBusinesstotalcount) {
        this.soldBusinesstotalcount = soldBusinesstotalcount;
    }

    public BigDecimal getSoldBusinesstotalarea() {
        return soldBusinesstotalarea;
    }

    public void setSoldBusinesstotalarea(BigDecimal soldBusinesstotalarea) {
        this.soldBusinesstotalarea = soldBusinesstotalarea;
    }

    public Integer getSoldOfficetotalcount() {
        return soldOfficetotalcount;
    }

    public void setSoldOfficetotalcount(Integer soldOfficetotalcount) {
        this.soldOfficetotalcount = soldOfficetotalcount;
    }

    public BigDecimal getSoldOfficetotalarea() {
        return soldOfficetotalarea;
    }

    public void setSoldOfficetotalarea(BigDecimal soldOfficetotalarea) {
        this.soldOfficetotalarea = soldOfficetotalarea;
    }

    public Integer getSoldOthertotalcount() {
        return soldOthertotalcount;
    }

    public void setSoldOthertotalcount(Integer soldOthertotalcount) {
        this.soldOthertotalcount = soldOthertotalcount;
    }

    public BigDecimal getSoldOthertotalarea() {
        return soldOthertotalarea;
    }

    public void setSoldOthertotalarea(BigDecimal soldOthertotalarea) {
        this.soldOthertotalarea = soldOthertotalarea;
    }

    public String getProjectUsage() {
        return projectUsage;
    }

    public void setProjectUsage(String projectUsage) {
        this.projectUsage = projectUsage == null ? null : projectUsage.trim();
    }

    public String getSellerPhone() {
        return sellerPhone;
    }

    public void setSellerPhone(String sellerPhone) {
        this.sellerPhone = sellerPhone == null ? null : sellerPhone.trim();
    }

    public String getProjectMainroomhx() {
        return projectMainroomhx;
    }

    public void setProjectMainroomhx(String projectMainroomhx) {
        this.projectMainroomhx = projectMainroomhx == null ? null : projectMainroomhx.trim();
    }

    public String getProjectReferprice() {
        return projectReferprice;
    }

    public void setProjectReferprice(String projectReferprice) {
        this.projectReferprice = projectReferprice == null ? null : projectReferprice.trim();
    }

    public String getProjectTese() {
        return projectTese;
    }

    public void setProjectTese(String projectTese) {
        this.projectTese = projectTese == null ? null : projectTese.trim();
    }

    public String getProjectPropertyage() {
        return projectPropertyage;
    }

    public void setProjectPropertyage(String projectPropertyage) {
        this.projectPropertyage = projectPropertyage == null ? null : projectPropertyage.trim();
    }

    public String getProjectGetroomrate() {
        return projectGetroomrate;
    }

    public void setProjectGetroomrate(String projectGetroomrate) {
        this.projectGetroomrate = projectGetroomrate == null ? null : projectGetroomrate.trim();
    }

    public String getProjectWuyemoney() {
        return projectWuyemoney;
    }

    public void setProjectWuyemoney(String projectWuyemoney) {
        this.projectWuyemoney = projectWuyemoney == null ? null : projectWuyemoney.trim();
    }

    public String getProjectRenovation() {
        return projectRenovation;
    }

    public void setProjectRenovation(String projectRenovation) {
        this.projectRenovation = projectRenovation == null ? null : projectRenovation.trim();
    }

    public String getProjectGreenrate() {
        return projectGreenrate;
    }

    public void setProjectGreenrate(String projectGreenrate) {
        this.projectGreenrate = projectGreenrate == null ? null : projectGreenrate.trim();
    }

    public String getSellerAddress() {
        return sellerAddress;
    }

    public void setSellerAddress(String sellerAddress) {
        this.sellerAddress = sellerAddress == null ? null : sellerAddress.trim();
    }

    public String getProjectRate() {
        return projectRate;
    }

    public void setProjectRate(String projectRate) {
        this.projectRate = projectRate == null ? null : projectRate.trim();
    }

    public Date getFirstOpendate() {
        return firstOpendate;
    }

    public void setFirstOpendate(Date firstOpendate) {
        this.firstOpendate = firstOpendate;
    }

    public Date getLastOpendate() {
        return lastOpendate;
    }

    public void setLastOpendate(Date lastOpendate) {
        this.lastOpendate = lastOpendate;
    }

    public String getGroupName() {
        return groupName;
    }

    public void setGroupName(String groupName) {
        this.groupName = groupName == null ? null : groupName.trim();
    }

    public Integer getOnlineHousetotalcount() {
        return onlineHousetotalcount;
    }

    public void setOnlineHousetotalcount(Integer onlineHousetotalcount) {
        this.onlineHousetotalcount = onlineHousetotalcount;
    }

    public BigDecimal getOnlineHousetotalarea() {
        return onlineHousetotalarea;
    }

    public void setOnlineHousetotalarea(BigDecimal onlineHousetotalarea) {
        this.onlineHousetotalarea = onlineHousetotalarea;
    }

    public String getRingregion() {
        return ringregion;
    }

    public void setRingregion(String ringregion) {
        this.ringregion = ringregion == null ? null : ringregion.trim();
    }

    public Double getLat() {
        return lat;
    }

    public void setLat(Double lat) {
        this.lat = lat;
    }

    public Double getLng() {
        return lng;
    }

    public void setLng(Double lng) {
        this.lng = lng;
    }

    public String getPropertymanagementcompanies() {
        return propertymanagementcompanies;
    }

    public void setPropertymanagementcompanies(String propertymanagementcompanies) {
        this.propertymanagementcompanies = propertymanagementcompanies == null ? null : propertymanagementcompanies.trim();
    }

    public Integer getIsWebdisplay() {
        return isWebdisplay;
    }

    public void setIsWebdisplay(Integer isWebdisplay) {
        this.isWebdisplay = isWebdisplay;
    }

    public String getProjectGdid() {
        return projectGdid;
    }

    public void setProjectGdid(String projectGdid) {
        this.projectGdid = projectGdid == null ? null : projectGdid.trim();
    }

    public Integer getIsoperate() {
        return isoperate;
    }

    public void setIsoperate(Integer isoperate) {
        this.isoperate = isoperate;
    }

    public String getLandId() {
        return landId;
    }

    public void setLandId(String landId) {
        this.landId = landId == null ? null : landId.trim();
    }

    public String getProjectregion1() {
        return projectregion1;
    }

    public void setProjectregion1(String projectregion1) {
        this.projectregion1 = projectregion1 == null ? null : projectregion1.trim();
    }

    public String getProjectregiont() {
        return projectregiont;
    }

    public void setProjectregiont(String projectregiont) {
        this.projectregiont = projectregiont == null ? null : projectregiont.trim();
    }

    public String getProjectDType() {
        return projectDType;
    }

    public void setProjectDType(String projectDType) {
        this.projectDType = projectDType == null ? null : projectDType.trim();
    }

    public String getProjectIdold() {
        return projectIdold;
    }

    public void setProjectIdold(String projectIdold) {
        this.projectIdold = projectIdold == null ? null : projectIdold.trim();
    }

    public BigDecimal getBookedTotalarea() {
        return bookedTotalarea;
    }

    public void setBookedTotalarea(BigDecimal bookedTotalarea) {
        this.bookedTotalarea = bookedTotalarea;
    }

    public String getProjectInfo() {
        return projectInfo;
    }

    public void setProjectInfo(String projectInfo) {
        this.projectInfo = projectInfo == null ? null : projectInfo.trim();
    }
}