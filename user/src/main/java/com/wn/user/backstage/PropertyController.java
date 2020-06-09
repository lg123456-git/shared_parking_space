package com.wn.user.backstage;

import com.alibaba.druid.sql.visitor.functions.If;
import com.wn.common.entry.MyRsp;
import com.wn.user.pojo.Property;
import com.wn.user.service.PropertyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.ws.rs.POST;

/**
 * @BelongsProject: four
 * @BelongsPackage: com.wn.user.web
 * @Author: 段彪
 * @CreateTime: 2020-06-09 15:58
 * @Description:物业方
 */
@RestController
public class PropertyController {

    @Autowired
    PropertyService propertyService;

    //物业方注册
    @RequestMapping("property_register")
    public MyRsp register(Property property){
        System.out.println(property);
        Integer integers = propertyService.selectByName(property.getPropertyName());
        if(integers>0){//已经存在
            return MyRsp.error();
        }else{
            Integer integer = propertyService.PropertyInsert(property);
            if (integer>0){//注册成功
                return MyRsp.success1(0,"注册成功");
            }else{
                return MyRsp.success1(0,"注册失败");
            }
        }

    }

}
