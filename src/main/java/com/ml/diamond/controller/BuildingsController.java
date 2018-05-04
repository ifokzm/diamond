package com.ml.diamond.controller;

import com.ml.diamond.entity.Buildings;
import com.ml.diamond.service.BuildingsService;
import com.ml.diamond.utils.DataGrid;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/buildings")
@Slf4j
public class BuildingsController {

    @Autowired
    BuildingsService service;


    @GetMapping(value = "/getPage", produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public DataGrid<Buildings> getPage(Buildings buildings) {
        return service.getPage(buildings);
    }


}
