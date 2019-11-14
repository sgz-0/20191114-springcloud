package com.aaa.xmz.ribbon;

import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.RandomRule;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @ClassName RibbonRuleMine
 * @Description
 * @Author sgz
 * @Date 2019/11/11 21:08
 * @Version 1.0
 **/
@Configuration
public class RibbonRuleMine {
    @Bean
    public IRule randomRule(){
        return  new RandomRule();
    }
}

 