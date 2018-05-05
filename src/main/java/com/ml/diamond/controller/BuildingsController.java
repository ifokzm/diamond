package com.ml.diamond.controller;

import com.ml.diamond.entity.Buildings;
import com.ml.diamond.service.BuildingsService;
import com.ml.diamond.utils.DataGrid;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Api(value = "幢信息接口", description = "幢信息接口")
@RestController
@RequestMapping("/api/buildings")
@Slf4j
public class BuildingsController {

    @Autowired
    BuildingsService service;

    @ApiOperation("获取幢列表")
    @GetMapping(value = "/getPage", produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public DataGrid<Buildings> getPage(Buildings buildings) {
        return service.getPage(buildings);
    }


}
