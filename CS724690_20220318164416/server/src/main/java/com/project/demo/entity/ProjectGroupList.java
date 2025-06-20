package com.project.demo.entity;

import java.sql.Date;
import java.sql.Timestamp;
import com.project.demo.entity.base.BaseEntity;
import java.io.Serializable;
import lombok.*;
import javax.persistence.*;


/**
 *项目组列表：(ProjectGroupList)表实体类
 *
 */
@Setter
@Getter
@Entity(name = "ProjectGroupList")
public class ProjectGroupList implements Serializable {

    //ProjectGroupList编号
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "project_group_list_id")
    private Integer project_group_list_id;
   // 项目组名称
   @Basic
    private String project_team_name;
   // 项目组地址
   @Basic
    private String project_team_address;
   // 项目组封面
   @Basic
    private String project_team_cover;
   // 负责范围
   @Basic
    private String scope_of_responsibility;
   // 项目组组长
   @Basic
    private String project_team_leader;
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
