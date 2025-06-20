package com.project.demo.entity;

import java.sql.Date;
import java.sql.Timestamp;
import com.project.demo.entity.base.BaseEntity;
import java.io.Serializable;
import lombok.*;
import javax.persistence.*;


/**
 *部门主管：(DepartmentHead)表实体类
 *
 */
@Setter
@Getter
@Entity(name = "DepartmentHead")
public class DepartmentHead implements Serializable {

    //DepartmentHead编号
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "department_head_id")
    private Integer department_head_id;
   // 主管姓名
   @Basic
    private String name_of_supervisor;
   // 部门名称
   @Basic
    private String department_name;
    // 审核状态
    @Basic
    private String examine_state;
    // 用户编号
    @Id
    @Column(name = "user_id")
    private Integer userId;

    // 更新时间
    @Basic
    private Timestamp update_time;

    // 创建时间
    @Basic
    private Timestamp create_time;

}
