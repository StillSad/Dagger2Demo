package com.ice.dagger2demo.demo4;

import dagger.Component;

@Component(modules = DemoModule.class)
public interface DemoComponent {
    void injectTo(DemoActivity demoActivity);

    @Component.Builder
    interface Builder {
        Builder module(DemoModule demoModule);

        DemoComponent build();
    }
}
