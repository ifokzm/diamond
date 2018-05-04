package com.ml.diamond.service.impl;

import com.ml.diamond.config.DS;
import com.ml.diamond.config.DataSourceType;
import com.ml.diamond.entity.Buildings;
import com.ml.diamond.mapper.BuildingsMapper;
import com.ml.diamond.service.BuildingsService;
import com.ml.diamond.utils.DataGrid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BuildingsServiceImpl implements BuildingsService {

    @Autowired
    BuildingsMapper buildingsMapper;

    @Override
    @DS(DataSourceType.Slave)
    public DataGrid<Buildings> getPage(Buildings buildings) {
        DataGrid<Buildings> dg = new DataGrid<Buildings>();

        dg.setTotal(buildingsMapper.getCount(buildings));
        dg.setRows(buildingsMapper.getPage(buildings));

        return dg;
    }

    @Override
    @DS(DataSourceType.Slave)
    public List<Buildings> getAllList(Buildings object) {
        return null;
    }
}
