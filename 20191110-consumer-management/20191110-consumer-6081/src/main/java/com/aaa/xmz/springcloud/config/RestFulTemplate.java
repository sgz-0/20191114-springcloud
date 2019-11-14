package com.aaa.xmz.springcloud.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 * @ClassName RestFulTemplate
 * @Description
 * @Author sgz
 * @Date 2019/11/10 18:09
 * @Version 1.0
 **/
@Configuration
public class RestFulTemplate {
    @Bean
    public RestTemplate restTemplate(){
        return new RestTemplate();
    }

}
