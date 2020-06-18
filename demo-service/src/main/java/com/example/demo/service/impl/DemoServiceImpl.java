package com.example.demo.service.impl;

import com.example.demo.dao.entity.SysDict;
import com.example.demo.dao.mapper.SysDictMapper;
import com.example.demo.service.DemoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DemoServiceImpl implements DemoService {

    private final SysDictMapper sysDictMapper;

    public DemoServiceImpl(SysDictMapper sysDictMapper) {
        this.sysDictMapper = sysDictMapper;
    }

    @Override
    public String test() {
        SysDict sysDict = sysDictMapper.selectByPrimaryKey(1);
        return sysDict.toString();
    }
}
