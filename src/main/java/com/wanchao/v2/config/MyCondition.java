package com.wanchao.v2.config;

import org.springframework.context.annotation.Condition;
import org.springframework.context.annotation.ConditionContext;
import org.springframework.core.env.Environment;
import org.springframework.core.type.AnnotatedTypeMetadata;

public class MyCondition implements Condition {
    /**
     * @param conditionContext 获取到当前的上下文
     * @param annotatedTypeMetadata 获取当前注解的信息
     * @return
     */
    public boolean matches(ConditionContext conditionContext, AnnotatedTypeMetadata annotatedTypeMetadata) {
        //1,获取当前的环境
        Environment environment = conditionContext.getEnvironment();
        String osName=environment.getProperty("os.name");
        if(osName.equals("Windows 10")){
            return true;//能注册对象
        }
        return false;//不能注册对象
    }
}
