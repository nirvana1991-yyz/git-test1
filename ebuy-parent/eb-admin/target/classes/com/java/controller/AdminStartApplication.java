package com.java.controller;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * description：
 * author：丁鹏
 * date：15:12
 */
@SpringBootApplication(scanBasePackages = {"com.java.controller","com.java.service.impl"})
@MapperScan(basePackages = {"com.java.mapper"})
public class AdminStartApplication {
    public static void main(String[] args) {
        SpringApplication.run(AdminStartApplication.class);
    }
}
