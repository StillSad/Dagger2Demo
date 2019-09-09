package com.ice.dagger2demo.demo6;

import dagger.Component;

@Component(dependencies = DemoActivityComponent.class)
public interface DemoFragmentComponent {
    void inject(DemoFragment demoFragment);
}
