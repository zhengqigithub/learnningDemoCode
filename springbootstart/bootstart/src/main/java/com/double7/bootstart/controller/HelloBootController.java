package com.double7.bootstart.controller;

import com.alibaba.fastjson.JSON;
import com.double7.bootstart.common.redis.RedisConfig;
import com.double7.bootstart.webviewvo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello/")
public class HelloBootController {

    @Autowired
    RedisConfig redisConfig;
    @ResponseBody
    @RequestMapping("sayHello")
    public String sayHello(){

        User user = new User();
        return JSON.toJSONString(user) ;
    }


}
