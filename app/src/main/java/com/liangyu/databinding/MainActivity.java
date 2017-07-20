package com.liangyu.databinding;

import android.databinding.DataBindingUtil;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.liangyu.databinding.databinding.ActivityMainBinding;


public class MainActivity extends AppCompatActivity {
    Person person = new Person("xinsi",25);
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        ActivityMainBinding bind = DataBindingUtil.setContentView(this,R.layout.activity_main);


        //bind.setVariable(com.liangyu.databinding.BR,person);
    }
}
