package com.ice.dagger2demo.demo4;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

import com.ice.dagger2demo.R;

import javax.inject.Inject;

/**
 * 4、使用@Component.Builder（需先了解 3、通过Module传参）
 */
public class DemoActivity extends AppCompatActivity {

    @Inject
    DemoBean demoBean;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_demo4);

        DaggerDemoComponent.builder()
                .module(new DemoModule(100))
                .build()
                .injectTo(this);
        TextView tvValue = findViewById(R.id.tv_value);
        tvValue.setText(String.format("demoBean money:%s,hashCode:%d",demoBean.getDemoBase().getMoney(),demoBean.hashCode()));
    }
}
