package com.ml.diamond.service.impl;

import com.ml.diamond.config.DS;
import com.ml.diamond.config.DataSourceType;
import com.ml.diamond.entity.SysCity;
import com.ml.diamond.mapper.SysCityMapper;
import com.ml.diamond.service.SysCityService;
import com.ml.diamond.utils.DataGrid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SysCityServiceImpl implements SysCityService {
    @Autowired
    SysCityMapper sysCityMapper;

    @Override
    @DS(DataSourceType.Master)
    public DataGrid<SysCity> getPage(SysCity object) {
        DataGrid<SysCity> dg = new DataGrid<SysCity>();
        dg.setRows(sysCityMapper.getPage(object));
        dg.setTotal(sysCityMapper.getCount(object));

        return dg;
    }

    @Override
    public List<SysCity> getAllList(SysCity object) {
        return null;
    }
}
