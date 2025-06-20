package com.project.demo.entity;

import java.sql.Date;
import java.sql.Timestamp;
import com.project.demo.entity.base.BaseEntity;
import java.io.Serializable;
import lombok.*;
import javax.persistence.*;


/**
 *人员列表：(PersonnelList)表实体类
 *
 */
@Setter
@Getter
@Entity(name = "PersonnelList")
public class PersonnelList implements Serializable {

    //PersonnelList编号
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "personnel_list_id")
    private Integer personnel_list_id;
   // 员工姓名
   @Basic
    private Integer employee_name;
   // 员工部门
   @Basic
    private String employee_department;
   // 员工职位
   @Basic
    private String employee_position;
   // 员工电话
   @Basic
    private String employee_telephone;
   // 员工性别
   @Basic
    private String employee_gender;
   // 员工年龄
   @Basic
    private String employee_age;
   // 员工照片
   @Basic
    private String employee_photos;
   // 备注
   @Basic
    private String remarks;
   // 员工详情
   @Basic
    private String employee_details;
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
