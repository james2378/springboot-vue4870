package com.project.demo.entity;

import java.sql.Date;
import java.sql.Timestamp;
import com.project.demo.entity.base.BaseEntity;
import java.io.Serializable;
import lombok.*;
import javax.persistence.*;


/**
 *待办任务：(ToDoTasks)表实体类
 *
 */
@Setter
@Getter
@Entity(name = "ToDoTasks")
public class ToDoTasks implements Serializable {

    //ToDoTasks编号
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "to_do_tasks_id")
    private Integer to_do_tasks_id;
   // 员工姓名
   @Basic
    private Integer employee_name;
   // 员工部门
   @Basic
    private String employee_department;
   // 上级主管
   @Basic
    private String superior_supervisor;
   // 任务分配
   @Basic
    private String task_allocation_;
   // 工作批示
   @Basic
    private String work_instructions;
   // 发布日期
   @Basic
    private Timestamp release_date;
   // 备注
   @Basic
    private String remarks;

    // 更新时间
    @Basic
    private Timestamp update_time;

    // 创建时间
    @Basic
    private Timestamp create_time;

}
