package com.ice.dagger2demo.demo2;

import dagger.Component;

//第三步：编写Component接口使用@Component标注这个接口，并使用modules=的方法链接上第一步中编写的Module类；
@Component(modules = DemoModule.class)
public interface DemoComponent {
    //第四步：使用注解Component,表示要将依赖注入到DemoActivity里
    void injectTo(DemoActivity demoActivity);
}
