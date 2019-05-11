package com.android.expandingcollapsingtoolbarapp;

import android.support.design.widget.CollapsingToolbarLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;

public class MainActivity extends AppCompatActivity {

    Toolbar toolbar;
    CollapsingToolbarLayout collapsingToolbarLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initInstanceDrawer();

    }

    private void initInstanceDrawer(){

        toolbar=findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        collapsingToolbarLayout=findViewById(R.id.collapsing_toolbar_layout);
        collapsingToolbarLayout.setTitle("Animated Toolbar");
    }
}
