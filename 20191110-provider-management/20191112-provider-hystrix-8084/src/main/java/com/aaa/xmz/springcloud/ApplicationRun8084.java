package com.aaa.xmz.springcloud;

import org.apache.ibatis.annotations.Mapper;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @ClassName ApplicationRun8084
 * @Description
 * @Author sgz
 * @Date 2019/11/12 14:52
 * @Version 1.0
 **/
@SpringBootApplication
@MapperScan("com.aaa.xmz.springcloud.mapper")
@EnableDiscoveryClient
@EnableCircuitBreaker
public class ApplicationRun8084 {
    public static void main(String[] args) {
        SpringApplication.run(ApplicationRun8084.class,args);
    }
}

 