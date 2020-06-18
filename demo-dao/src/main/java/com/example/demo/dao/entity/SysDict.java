package com.example.demo.dao.entity;

import java.util.Date;
import lombok.Data;

/**
    * 字典表-支持树形结构
    */
@Data
public class SysDict {
    /**
    * 编号
    */
    private Integer id;

    /**
    * 数据值
    */
    private String value;

    /**
    * 标签名
    */
    private String label;

    /**
    * 类型
    */
    private String type;

    /**
    * app id
    */
    private String appId;

    /**
    * 产品包名
    */
    private String packageName;

    /**
    * 描述
    */
    private String description;

    /**
    * 父级编号
    */
    private Integer parentId;

    /**
    * 级别 1一级 2二级 以此类推
    */
    private Integer level;

    /**
    * 状态标记 0禁用 1启用
    */
    private Integer status;

    /**
    * 排序（升序）
    */
    private Integer sort;

    /**
    * 创建者
    */
    private String createBy;

    /**
    * 创建时间
    */
    private Date createTime;

    /**
    * 更新者
    */
    private String updateBy;

    /**
    * 更新时间
    */
    private Date updateTime;

    /**
    * 备注信息
    */
    private String remarks;

    /**
    * 删除标记 0:未删除,1已删除
    */
    private Integer deleted;
}