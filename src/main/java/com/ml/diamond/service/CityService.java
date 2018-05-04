package com.ml.diamond.service;

import com.ml.diamond.utils.DataGrid;

public interface CityService<T> {

    /**
     * @param object
     * @return
     */
    DataGrid<T> getPage(T object);
}
