package com.aaa.xmz.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;



/**
 * @ClassName ApplicationRun7083
 * @Description
 * @Author sgz
 * @Date 2019/11/11 20:08
 * @Version 1.0
 **/
@SpringBootApplication
@EnableEurekaServer
public class ApplicationRun7083 {
    public static void main(String[] args) {
        SpringApplication.run(ApplicationRun7083.class,args);
    }
}

 