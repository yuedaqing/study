package com.yue.ume;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;

/**
 * @author Yue
 */
@SpringBootApplication
//@ServletComponentScan(basePackages = "com.yue.ume.filter")
@MapperScan("com.yue.ume.mapper")
public class UmeApplication {

    public static void main(String[] args) {
        SpringApplication.run(UmeApplication.class, args);
    }
}