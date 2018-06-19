package com.ml.diamond.entity;

import com.fasterxml.jackson.annotation.JsonFormat;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import org.springframework.format.annotation.DateTimeFormat;

import java.math.BigDecimal;
import java.util.Date;

@ApiModel
@Data
public class BaseEntity implements java.io.Serializable {
    private Long id;
    /**
     * 跳转页面
     */
    private String url;

    /**
     * 分页开始数
     */
    @ApiModelProperty("页数，默认为：0")
    private int offset = 0;

    /**
     * 当前页显示数
     */
    @ApiModelProperty("每页显示条数，默认为：10")
    private int limit = 10;

    /**
     * 字段过滤
     */
    private String filter;

    /**
     * 过滤条件
     */
    private String op;

    /**
     * 查询关键字 keyword
     */
    private String search;

    /**
     * 删除状态 0正常，1删除
     */
    private Byte delFlag;

    /**
     * 创建人
     */
    private String creator;

    /**
     * 创建时间
     */
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private Date createTime = new Date();

    /**
     * 修改人
     */
    private String modifier;

    /**
     * 修改时间
     */
    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private Date modifyTime = new Date();


    /**
     * 删除人
     */
    private String deleteBy;

    /**
     * 删除时间
     */
    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private Date deleteTime = new Date();
    /**
     * 公共字段
     */

    private String Project_ID;
    private String Project_name;
    private String Group_Name; //企业系
    private String Generalize_Name; //推广名
    private String District; //区
    private String Project_D_type; //项目开发类型 A:开发商独立开发-默认  B:股权合作开发  C:分标段开发-分幢开发
    private String ProjectRegion; //板块1
    private String Location; //地址
    private String Developer; //开发商
    private Date Open_Date; //开盘日期
    private Date First_OpenDate; //第一次开盘日期
    private Date Last_OpenDate; //最近一次开盘

    private String Building_ID; //幢号
    private String Building_Name; //幢名称
    private Integer Room_TopFloor; //总层数

    private String Room_ID; //户编号
    private String Room_Name; //户名
    private String Room_Status; //销售状态
    private Long Room_BuildArea; //建筑面积
    private Long Room_ShareArea; //公摊面积
    private Long Room_InsideArea; //内部面积
    private Integer Room_Floor; //所在层
    private String Room_Structure; //建筑结构
    private BigDecimal Room_RefPrice; //参考价,可能是总价
    private BigDecimal Room_TotalPrice; //参考价,可能是总价
    private String Unit_Name; //单元号
    private String Room_Location; //位置
    private String Room_Relocation; //大类划分：商品房，商品配套，基础配套，拆迁房，经适房，工业    说明：商品配套-可以销售，基础配套-不可以销售
    private Date Trans_Date; //交易日期
    private BigDecimal Trans_avgPrice; //交易均价
    private BigDecimal Trans_TotalPrice; //交易总价
    private String Trans_FromTo; //交易可售
    private String Room_Usage; //物业类型
    private String Room_ZhuangXiu; //装修情况
    private String Room_Type; //房型

//    public int getLimit() {
//        return limit + this.offset;
//    }
//
//    public void setLimit(int limit) {
//        this.limit = limit;
//    }
//    public int getOffset() {
//        return this.offset > 0 ? (this.offset + this.limit) : this.offset;
//    }
//
//    public void setOffset(int offset) {
//        this.offset = offset;
//    }
}
