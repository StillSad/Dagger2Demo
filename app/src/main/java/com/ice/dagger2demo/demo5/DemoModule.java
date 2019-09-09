package com.ice.dagger2demo.demo5;

import dagger.Module;
import dagger.Provides;

@Module
public class DemoModule {

    @Provides
    DemoBase providesDemoBase(int money) {
        DemoBase demoBase = new DemoBase();
        demoBase.setMoney(money);
        return demoBase;
    }


    @Provides
    DemoBean getDemoBean(DemoBase demoBase) {
        return new DemoBean(demoBase);
    }
}
