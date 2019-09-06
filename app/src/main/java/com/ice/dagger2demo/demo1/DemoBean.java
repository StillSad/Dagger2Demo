package com.ice.dagger2demo.demo1;

import javax.inject.Inject;

public class DemoBean {
    //第一步：用Inject标注，告诉dagger2可以实例化这个类,如：DemoBean
    @Inject
    public DemoBean(){}
}
