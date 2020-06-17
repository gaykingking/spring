package com.wanchao;

import com.wanchao.v1.entity.Win7Entity;
import com.wanchao.v2.config.MyConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class V1Spring {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(MyConfig.class);
        Win7Entity win7Entity=(Win7Entity)applicationContext.getBean("win7Entity");
        System.out.println(win7Entity);
    }
}
