package com.project.demo.entity;

import java.sql.Date;
import java.sql.Timestamp;
import com.project.demo.entity.base.BaseEntity;
import java.io.Serializable;
import lombok.*;
import javax.persistence.*;


/**
 *员工日志：(EmployeeLog)表实体类
 *
 */
@Setter
@Getter
@Entity(name = "EmployeeLog")
public class EmployeeLog implements Serializable {

    //EmployeeLog编号
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "employee_log_id")
    private Integer employee_log_id;
   // 员工姓名
   @Basic
    private Integer employee_name;
   // 日志日期
   @Basic
    private Timestamp log_date;
   // 员工部门
   @Basic
    private String employee_department;
   // 工作地址
   @Basic
    private String working_address;
   // 出勤状况
   @Basic
    private String attendance_status;
   // 工作进度
   @Basic
    private String work_progress;
   // 工作态度
   @Basic
    private String working_attitude;
   // 备注
   @Basic
    private String remarks;
   // 第二天计划
   @Basic
    private String plan_for_the_next_day;
   // 日志内容
   @Basic
    private String log_content;

    // 更新时间
    @Basic
    private Timestamp update_time;

    // 创建时间
    @Basic
    private Timestamp create_time;

}
