package com.minjiao;

import org.mybatis.spring.annotation.MapperScan;
import org.mybatis.spring.annotation.MapperScans;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author Administrator
 * @date 2021/12/23 20:18
 * @description:
 */
@SpringBootApplication
@MapperScan(basePackages ="com.minjiao.dao")
public class MinJiaoApp {
    public static void main(String[] args) {
        SpringApplication.run(MinJiaoApp.class,args);
    }
}
