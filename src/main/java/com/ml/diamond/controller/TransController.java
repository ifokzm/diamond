package com.ml.diamond.controller;

import com.ml.diamond.entity.Trans;
import com.ml.diamond.service.TransService;
import com.ml.diamond.utils.DataGrid;
import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/trans")
@Slf4j
public class TransController {

    @Autowired
    TransService service;

    @ApiOperation("获取房间信息")
    @GetMapping(value = "/getPage", produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public DataGrid<Trans> getPage(Trans trans){
        return service.getPage(trans);
    }

}
