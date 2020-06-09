package com.wn.user.pojo;

import lombok.Data;

import java.util.Date;

/**
 * @BelongsProject: four
 * @BelongsPackage: com.wn.user.pojo
 * @Author: 段彪
 * @CreateTime: 2020-06-09 15:28
 * @Description:
 */
@Data
public class Property {

    private Integer id;
    private String propertyName;
    private String password;
    private String tel;
    private Date createTime;
    private Date updateTime;
}
