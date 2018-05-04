package com.ml.diamond.utils;

import lombok.Data;

import java.util.List;

@Data
public class DataGrid<T> {

    private long total;

    private List<T> rows;
    

}
