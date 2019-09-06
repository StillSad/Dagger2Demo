package com.ice.dagger2demo;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.ice.dagger2demo.demo1.DemoActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void demo1(View view) {
        startActivity(DemoActivity.class);
    }

    private void startActivity(Class<?> c) {
        Intent intent = new Intent(this,c);
        startActivity(intent);
    }
}
