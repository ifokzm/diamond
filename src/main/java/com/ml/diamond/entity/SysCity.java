package com.ml.diamond.entity;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;

import java.util.Date;

@Data
public class SysCity extends BaseEntity {

    private String cityCode;

    private String cityName;

    private String cityDbnameRela;

    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private Date createTime;

}