package com.ml.diamond.service;

import com.ml.diamond.utils.DataGrid;

public interface UserService<T> {
    /**
     * @param object
     * @return
     */
    DataGrid<T> getPage(T object);

}
