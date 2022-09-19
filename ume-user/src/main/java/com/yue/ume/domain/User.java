package com.yue.ume.domain;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.io.Serializable;
import java.time.LocalDateTime;

/**
 * 
 * @TableName user
 */
@TableName(value ="user")
@Data
public class User implements Serializable {
    /**
     * 用户id
     */
    @TableId
    private Long id;

    /**
     * 创建时间
     */
    private LocalDateTime createTime;

    /**
     * 创建者
     */
    private Long createBy;

    /**
     * 更新时间
     */
    private LocalDateTime updateTime;

    /**
     * 更新者
     */
    private Long updateBy;

    /**
     * 是否删除
     */
    private Integer delFlag;

    /**
     * 用户名称
     */
    private String userName;

    /**
     * 联系电话
     */
    private String phone;

    /**
     * 用户账号
     */
    private String account;

    /**
     * 用户头像
     */
    private String avatarUrl;

    /**
     * 用户性别
     */
    private String gender;

    /**
     * 用户生日
     */
    private LocalDateTime birthday;

    @TableField(exist = false)
    private static final long serialVersionUID = 1L;
}