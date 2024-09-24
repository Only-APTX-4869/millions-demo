package com.zhouyu.test;

import org.springframework.stereotype.Service;

@Service
public class DemoAnnotationService {

//    @Action(name = "注解式拦截的add操作")
//    public void add(){}

    @Action(name = "注解式拦截的add1操作")
    public void add1(){}
}
