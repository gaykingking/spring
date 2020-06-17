package com.wanchao.v2.config;

import com.wanchao.v1.entity.Win7Entity;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Conditional;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MyConfig {
    @Bean
    @Conditional(MyCondition.class)
    public Win7Entity win7Entity(){
        return new Win7Entity();
    }
}
