package com.learn.mall.config;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@MapperScan({"com.learn.mall.mapper","com.learn.mall.dao"})
public class MyBatisConfig {
}