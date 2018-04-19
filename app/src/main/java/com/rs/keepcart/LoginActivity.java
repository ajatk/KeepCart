package com.rs.keepcart;

import android.content.Context;
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.rs.keepcart.adapter.LoginViewPagerAdapter;

public class LoginActivity extends AppCompatActivity {
    private ViewPager viewPager;
    LoginViewPagerAdapter pAdapter;
    TabLayout tabLayout;
    Context context;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);



    }
}
