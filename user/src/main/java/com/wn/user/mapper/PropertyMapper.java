package com.wn.user.mapper;

import com.wn.user.pojo.Property;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @BelongsProject: four
 * @BelongsPackage: com.wn.user.mapper
 * @Author: 段彪
 * @CreateTime: 2020-06-09 16:08
 * @Description: 物业
 */
public interface PropertyMapper {

    //注册
    Integer propertyInsert(Property property);
    //查询注册名
    Integer selectByName(String propertyName);
}
