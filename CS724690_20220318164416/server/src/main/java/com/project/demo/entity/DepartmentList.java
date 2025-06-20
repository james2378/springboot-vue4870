package com.project.demo.entity;

import java.sql.Date;
import java.sql.Timestamp;
import com.project.demo.entity.base.BaseEntity;
import java.io.Serializable;
import lombok.*;
import javax.persistence.*;


/**
 *部门列表：(DepartmentList)表实体类
 *
 */
@Setter
@Getter
@Entity(name = "DepartmentList")
public class DepartmentList implements Serializable {

    //DepartmentList编号
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "department_list_id")
    private Integer department_list_id;
   // 部门名称
   @Basic
    private String department_name;
   // 部门封面
   @Basic
    private String department_cover;
   // 部门位置
   @Basic
    private String department_location;
   // 负责范围
   @Basic
    private String scope_of_responsibility;
   // 部门主管
   @Basic
    private Integer department_head;
   // 备注
   @Basic
    private String remarks;
    // 点击数
    @Basic
    private Integer hits;

    // 更新时间
    @Basic
    private Timestamp update_time;

    // 创建时间
    @Basic
    private Timestamp create_time;

}
