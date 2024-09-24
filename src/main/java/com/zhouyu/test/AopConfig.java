package com.zhouyu.test;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration
@ComponentScan("com.zhouyu.test")
@EnableAspectJAutoProxy //1 使用注解开启spring对AspectJ的支持
public class AopConfig {
}
