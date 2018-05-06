package com.ml.diamond.service.impl;

import com.ml.diamond.config.DataSourceType;
import com.ml.diamond.config.DS;
import com.ml.diamond.entity.Rooms;
import com.ml.diamond.mapper.RoomsMapper;
import com.ml.diamond.service.RoomsService;
import com.ml.diamond.utils.DataGrid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RoomsServiceImpl implements RoomsService {

    @Autowired
    RoomsMapper roomsMapper;

    @Override
    @DS(DataSourceType.Slave)
    public Rooms getById(String roomId) {
        return roomsMapper.selectByPrimaryKey(roomId);
    }

    @Override
    @DS(DataSourceType.Slave)
    public Rooms getById2(String roomId) {
        return roomsMapper.selectByPrimaryKey(roomId);
    }

    @Override
    @DS(DataSourceType.Slave)
    public DataGrid<Rooms> getPage(Rooms rooms) {
        DataGrid<Rooms> dg = new DataGrid<Rooms>();

        dg.setTotal(roomsMapper.getCount(rooms));
        dg.setRows(roomsMapper.getPage(rooms));

        return dg;
    }

    @Override
    public List<Rooms> getAllList(Rooms object) {
        return null;
    }
}
