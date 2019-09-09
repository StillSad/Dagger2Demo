package com.ice.dagger2demo.demo6;

import dagger.Module;
import dagger.Provides;

@Module
public class DemoActivityModule {

    @Provides
    DemoBean providesDemoBean() {
        return new DemoBean();
    }
}
