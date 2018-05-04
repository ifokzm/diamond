package com.ml.diamond.service;

import com.ml.diamond.entity.BaseEntity;
import com.ml.diamond.utils.DataGrid;

import java.util.List;

public interface BaseService<T extends BaseEntity> {

    /**
     * @param object
     * @return
     */
    DataGrid<T> getPage(T object);

    List<T> getAllList(T object);

}

