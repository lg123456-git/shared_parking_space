package com.wn.user.service.impl;

import com.wn.user.mapper.PropertyMapper;
import com.wn.user.pojo.Property;
import org.apache.shiro.crypto.hash.Md5Hash;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @BelongsProject: four
 * @BelongsPackage: com.wn.user.service.impl
 * @Author: 段彪
 * @CreateTime: 2020-06-09 15:54
 * @Description:
 */
@Service
public class PropertyImpl implements com.wn.user.service.PropertyService {


    @Autowired
    PropertyMapper propertyMapper;

    //注册
    @Override
    public Integer PropertyInsert(Property property) {
        //md5加密
        Md5Hash seven = new Md5Hash(property.getPassword(), "seven", 7);
       String newPassword =seven.toString();
        property.setPassword(newPassword);
        System.out.println(property);
        Integer integer = propertyMapper.propertyInsert(property);

        return integer;
    }

    @Override
    public Integer selectByName(String propertyName) {

        Integer integer = propertyMapper.selectByName(propertyName);

        return integer;
    }
}
