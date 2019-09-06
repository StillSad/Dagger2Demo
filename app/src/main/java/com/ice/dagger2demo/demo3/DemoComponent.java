package com.ice.dagger2demo.demo3;

import dagger.Component;

@Component(modules = DemoModule.class)
public interface DemoComponent {
    void injectTo(DemoActivity demoActivity);
}
