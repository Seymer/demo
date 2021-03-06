package com.example.demo.dao.mapper;

import com.example.demo.dao.entity.SysDict;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface SysDictMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(SysDict record);

    int insertSelective(SysDict record);

    SysDict selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(SysDict record);

    int updateByPrimaryKey(SysDict record);
}