package com.ice.dagger2demo.demo5;

public class DemoBean {

    private DemoBase demoBase;

    public DemoBase getDemoBase() {
        return demoBase;
    }

    public DemoBean(DemoBase demoBase) {
        this.demoBase = demoBase;
    }
}
