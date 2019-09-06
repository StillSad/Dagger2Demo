package com.ice.dagger2demo.demo2;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

import com.ice.dagger2demo.R;

import javax.inject.Inject;

/**
 * 2、带@Module的使用
 */
public class DemoActivity extends AppCompatActivity {

    @Inject
    DemoBean demoBean;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_demo2);
        //第五步 injectTo
        //第一种
        //DaggerAstudyActivityComponent.create().injectTo(this);
        //第二种
        //DaggerAstudyActivityComponent.builder().build().injectTo(this);


        DaggerDemoComponent.create().injectTo(this);

        //DaggerDemoActivityComponent.builder().build().injectTo(this);

        TextView tvValue = findViewById(R.id.tv_value);
        tvValue.setText("demoBean hashCode:" + demoBean.hashCode());
    }
}
