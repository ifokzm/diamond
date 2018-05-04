package com.ml.diamond.service;

import com.ml.diamond.entity.Rooms;

public interface RoomsService extends BaseService<Rooms> {

    Rooms getById(String roomId);

    Rooms getById2(String roomId);

}
