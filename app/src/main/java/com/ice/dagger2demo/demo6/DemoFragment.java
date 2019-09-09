package com.ice.dagger2demo.demo6;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.ice.dagger2demo.R;

import javax.inject.Inject;

public class DemoFragment extends Fragment {


    @Inject
    DemoBean demoBean;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        return inflater.inflate(R.layout.fragment_demo6,null);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        DemoActivityComponent demoActivityComponent = ((DemoActivity)getActivity()).getDemoActivityComponent();

        DaggerDemoFragmentComponent.builder()
                .demoActivityComponent(demoActivityComponent)
                .build()
                .inject(this);

        TextView tvValue = view.findViewById(R.id.tv_value);
        tvValue.setText(String.format("hashCode:%d",demoBean.hashCode()));


    }


}
