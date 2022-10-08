package com.ocean.mpdemo1010.entity;

import com.baomidou.mybatisplus.annotation.*;
import lombok.Data;

import java.util.Date;

/**
 * @ClassName: User
 * @Description: 用户
 * @author: ocean
 * @date: 2022/10/8 10:19
 */
@Data
public class User {
    @TableId(type = IdType.ID_WORKER)//mp自带策略  生成19位值，数字类型使用这种策略，比如Long
//    @TableId(type = IdType.ID_WORKER_STR)//mp自带策略  生成19位值，字符串类型使用这种策略，比如String
    private Long id;
    private String name;
    private Integer age;
    private String email;

    //create_time
    @TableField(fill = FieldFill.INSERT)
    private Date createTime;
    //update_time
    @TableField(fill = FieldFill.INSERT_UPDATE)
    private Date updateTime;

    @Version
    @TableField(fill = FieldFill.INSERT)
    private Integer version;
}
