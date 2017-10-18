package com.teacher.app;

import android.os.Bundle;

import com.teacher.app.Base.Activity.BaseActivity;
import com.teacher.app.databinding.ActivityMainBinding;

public class MainActivity extends BaseActivity<ActivityMainBinding> {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        bindingView.tv1.setText("123");
    }
}
