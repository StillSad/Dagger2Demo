package com.ice.dagger2demo.demo5;

import dagger.BindsInstance;
import dagger.Component;

@Component(modules = DemoModule.class)
public interface DemoComponent {
    void injectTo(DemoActivity demoActivity);

    @Component.Builder
    interface Builder {

        @BindsInstance
        Builder initMoney(int money);

        DemoComponent build();
    }
}
