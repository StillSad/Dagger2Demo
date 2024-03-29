package com.ice.dagger2demo.demo4;

import dagger.Module;
import dagger.Provides;

@Module
public class DemoModule {

    private int money;

    public DemoModule(int money) {
        this.money = money;
    }

    @Provides
    DemoBase providesDemoBase() {
        DemoBase demoBase = new DemoBase();
        demoBase.setMoney(money);
        return demoBase;
    }


    @Provides
    DemoBean getDemoBean(DemoBase demoBase) {
        return new DemoBean(demoBase);
    }
}
