package com.double7.bootstart.common.redis;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

import java.io.Serializable;

/**
 * redis配置类
 *
 * @author zcc ON 2018/3/19
 **/
@Configuration
@PropertySource("classpath:application.yml")
@ConfigurationProperties(prefix = "spring.redis")
@EnableCaching//开启注解
public class RedisConfig implements Serializable{
    private Logger logger = LoggerFactory.getLogger(this.getClass());

    @Value("${host}")
    private String host;

    @Value("${port}")
    private int port;

    @Value("${timeout}")
    private int timeout;

    @Value("${password}")
    private String password;

    @Value("${database}")
    private int database;

    @Value("${max-idle}")
    private int maxIdle;

    @Value("${min-idle}")
    private int minIdle;


}