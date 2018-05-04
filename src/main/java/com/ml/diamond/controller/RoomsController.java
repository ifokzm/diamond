package com.ml.diamond.controller;

import com.ml.diamond.entity.Rooms;
import com.ml.diamond.service.RoomsService;
import com.ml.diamond.utils.DataGrid;
import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/rooms")
@Slf4j
public class RoomsController {

    @Autowired
    RoomsService service;

    @ApiOperation("获取房间信息")
    @GetMapping(value = "/getPage", produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public DataGrid<Rooms> getPage(Rooms rooms) {
        return service.getPage(rooms);
    }


    @ApiOperation("获取房间信息")
    @GetMapping(value = "/room", produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public Rooms getById(String roomId) {
        return service.getById(roomId);
    }

    @ApiOperation("获取房间信息")
    @GetMapping(value = "/room2", produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public Rooms getById2(String roomId) {
        return service.getById2(roomId);
    }
}
