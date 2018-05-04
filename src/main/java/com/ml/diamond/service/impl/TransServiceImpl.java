package com.ml.diamond.service.impl;

import com.ml.diamond.config.DS;
import com.ml.diamond.config.DataSourceType;
import com.ml.diamond.entity.Trans;
import com.ml.diamond.mapper.TransMapper;
import com.ml.diamond.service.TransService;
import com.ml.diamond.utils.DataGrid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TransServiceImpl implements TransService {

    @Autowired
    TransMapper transMapper;

    @Override
    @DS(DataSourceType.Slave)
    public DataGrid<Trans> getPage(Trans trans) {
        DataGrid<Trans> dg = new DataGrid<>();

        dg.setTotal(transMapper.getCount(trans));
        dg.setRows(transMapper.getPage(trans));

        return dg;
    }

    @Override
    @DS(DataSourceType.Slave)
    public List<Trans> getAllList(Trans object) {
        return null;
    }
}
