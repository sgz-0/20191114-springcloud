package com.aaa.xmz.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @ClassName ApplicationRun6082
 * @Description
 * @Author sgz
 * @Date 2019/11/11 20:59
 * @Version 1.0
 **/
@SpringBootApplication
@EnableDiscoveryClient
public class ApplicationRun6082 {
    public static void main(String[] args) {
        SpringApplication.run(ApplicationRun6082.class,args);
    }
}

 