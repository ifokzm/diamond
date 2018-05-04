package com.ml.diamond.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;
import java.util.Map;


@Mapper
public interface TestMapper {


    @Select("select * from conf_web.config")
    public List<Map<String, String>> query();


    @Select("select * from conf.clr")
    public List<Map<String, String>> query2();


}
