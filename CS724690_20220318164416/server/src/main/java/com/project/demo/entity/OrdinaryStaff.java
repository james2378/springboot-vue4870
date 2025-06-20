package com.project.demo.entity;

import java.sql.Date;
import java.sql.Timestamp;
import com.project.demo.entity.base.BaseEntity;
import java.io.Serializable;
import lombok.*;
import javax.persistence.*;


/**
 *普通员工：(OrdinaryStaff)表实体类
 *
 */
@Setter
@Getter
@Entity(name = "OrdinaryStaff")
public class OrdinaryStaff implements Serializable {

    //OrdinaryStaff编号
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ordinary_staff_id")
    private Integer ordinary_staff_id;
   // 员工工号
   @Basic
    private String employee_job_number;
   // 员工姓名
   @Basic
    private String employee_name;
   // 员工性别
   @Basic
    private String employee_gender;
   // 员工电话
   @Basic
    private String employee_telephone;
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
