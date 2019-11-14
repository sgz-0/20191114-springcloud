package com.aaa.xmz.springcloud.config;

import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.context.annotation.Configuration;

import java.nio.file.Path;

/**
 * @ClassName GatewayConfig
 * @Description
 * @Author sgz
 * @Date 2019/11/13 21:00
 * @Version 1.0
 **/
@Configuration
public class GatewayConfig {
    public RouteLocator routeLocator(RouteLocatorBuilder routeLocatorBuilder){
        return routeLocatorBuilder.routes().route(
                p -> p.path("/baidu").
                        filters ( f -> f.addRequestHeader("name","zha"))
                        .uri("www.baidu.com")
        ).build();
    }
}

 