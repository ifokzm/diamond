package com.ml.diamond.controller;

import com.ml.diamond.entity.SysCity;
import com.ml.diamond.service.SysCityService;
import com.ml.diamond.utils.DataGrid;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Api(value = "城市管理", description = "城市管理")
@RestController
@RequestMapping("/api/city")
@Slf4j
public class CityController {

    @Autowired
    SysCityService service;

    @ApiOperation("获取城市列表")
    @GetMapping(value = "/getPage", produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public DataGrid<SysCity> getPage(SysCity city) {
        return service.getPage(city);
    }

}
