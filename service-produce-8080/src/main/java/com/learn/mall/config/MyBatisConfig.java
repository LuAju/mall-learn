package com.learn.mall.config;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@MapperScan("com.learn.mall.mapper")
public class MyBatisConfig {
}