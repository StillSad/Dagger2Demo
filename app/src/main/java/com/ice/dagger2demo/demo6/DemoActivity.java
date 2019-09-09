package com.ice.dagger2demo.demo6;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;

import com.ice.dagger2demo.R;


/**
 * 6、Component依赖Component，使用dependence
 */
public class DemoActivity extends AppCompatActivity {

    private FragmentManager fragmentManager;
    private DemoFragment demoFragment;
    private DemoActivityComponent demoActivityComponent;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_demo6);
        demoActivityComponent = DaggerDemoActivityComponent.create();

        demoFragment = new DemoFragment();
        fragmentManager = getSupportFragmentManager();
        FragmentTransaction ft = fragmentManager.beginTransaction();
        ft.add(R.id.frameLayout,demoFragment);
        ft.show(demoFragment);
        ft.commit();

    }

    public DemoActivityComponent getDemoActivityComponent() {
        return demoActivityComponent;
    }
}
