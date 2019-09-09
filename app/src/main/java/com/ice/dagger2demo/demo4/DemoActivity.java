package com.ice.dagger2demo.demo4;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

import com.ice.dagger2demo.R;

import javax.inject.Inject;

/**
 * 3、通过Module传参
 */
public class DemoActivity extends AppCompatActivity {

    @Inject
    DemoBean demoBean;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_demo4);

        //在Module的构造函数带有参数且参数被使用的情况下，所生产的Component类就没有create()方法了。
        DaggerDemoComponent.builder()
                .module(new DemoModule(100))
                .module(null)
                .build()
                .injectTo(this);
        TextView tvValue = findViewById(R.id.tv_value);
        tvValue.setText(String.format("demoBean money:%s,hashCode:%d",demoBean.getDemoBase().getMoney(),demoBean.hashCode()));
    }
}
