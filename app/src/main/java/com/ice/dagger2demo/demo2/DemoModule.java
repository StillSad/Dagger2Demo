package com.ice.dagger2demo.demo2;

import dagger.Module;
import dagger.Provides;

//第一步：用@module标注DemoActivityModule
@Module
public class DemoModule {

    //第二步：用@Provides标注方法的返回值就是我们需要inject的类型
    @Provides
    DemoBean getDemoBean() {
        return new DemoBean();
    }
}
