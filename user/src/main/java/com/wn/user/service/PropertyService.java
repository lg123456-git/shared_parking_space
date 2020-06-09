package com.wn.user.service;

import com.wn.user.pojo.Property;

/**
 * @BelongsProject: four
 * @BelongsPackage: com.wn.user.service
 * @Author: 段彪
 * @CreateTime: 2020-06-09 15:52
 * @Description:
 */
public interface PropertyService {

    //注册
    Integer PropertyInsert(Property property);

    //查询注册名
    Integer selectByName(String propertyName);

}
