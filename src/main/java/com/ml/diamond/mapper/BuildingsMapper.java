package com.ml.diamond.mapper;

import com.ml.diamond.entity.Buildings;
import com.ml.diamond.entity.Trans;

import java.util.List;

public interface BuildingsMapper {

    int getCount(Buildings record);

    List<Buildings> getPage(Buildings record);

}