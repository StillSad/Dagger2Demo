package com.ice.dagger2demo.demo3;

import dagger.Module;
import dagger.Provides;

@Module
public class DemoModule {

    private int money;

    public DemoModule(int money) {
        this.money = money;
    }

    //在这里的module如果没有providesSoul()方法的话，还有一种情况只要在Soul的构造方法有@Inject也是可行的。
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
