package com.ice.dagger2demo.demo1;

import dagger.Component;

@Component
public interface DemoActivityComponent {
    //第二步：使用注解Component,表示要将依赖注入到DemoActivity里
    void injectTo(DemoActivity demoActivity);
}
