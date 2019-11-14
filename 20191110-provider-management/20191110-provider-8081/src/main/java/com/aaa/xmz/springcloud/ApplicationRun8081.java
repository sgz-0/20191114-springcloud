package com.aaa.xmz.springcloud;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @ClassName ApplicationRun8081
 * @Description
 * @Author sgz
 * @Date 2019/11/10 18:00
 * @Version 1.0
 **/
@SpringBootApplication
@MapperScan("com.aaa.xmz.springcloud.mapper")
@EnableDiscoveryClient
public class ApplicationRun8081 {
    public static void main(String[] args) {
        SpringApplication.run(ApplicationRun8081.class,args);
    }
}
