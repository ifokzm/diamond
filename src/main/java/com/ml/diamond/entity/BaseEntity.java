package com.ml.diamond.entity;

import com.fasterxml.jackson.annotation.JsonFormat;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

@ApiModel
@Data
public class BaseEntity {
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
}
