package com.ice.dagger2demo.demo6;

import dagger.Component;

@Component(modules = DemoActivityModule.class)
public interface DemoActivityComponent {
   DemoBean provideDemoBean();
}
