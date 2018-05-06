package com.ml.diamond.mapper;

import com.ml.diamond.entity.Rooms;

import java.util.List;

public interface RoomsMapper {
    int deleteByPrimaryKey(String roomId);

    int insert(Rooms record);

    int insertSelective(Rooms record);

    Rooms selectByPrimaryKey(String roomId);

    int updateByPrimaryKeySelective(Rooms record);

    int updateByPrimaryKey(Rooms record);

    int getCount(Rooms record);

    List<Rooms> getPage(Rooms record);
}