package com.project.demo.entity;

import java.sql.Date;
import java.sql.Timestamp;
import com.project.demo.entity.base.BaseEntity;
import java.io.Serializable;
import lombok.*;
import javax.persistence.*;


/**
 *总经理：(GeneralManager)表实体类
 *
 */
@Setter
@Getter
@Entity(name = "GeneralManager")
public class GeneralManager implements Serializable {

    //GeneralManager编号
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "general_manager_id")
    private Integer general_manager_id;
   // 经理姓名
   @Basic
    private String name_of_manager;
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
