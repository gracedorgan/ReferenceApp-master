package com.gmd.referenceapplication;

import android.os.Bundle;
import android.support.v7.widget.Toolbar;

public class MainActivity extends SearchViewActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Toolbar myToolbar = (Toolbar) findViewById(R.id.my_toolbar);
        setSupportActionBar(myToolbar);
    }
    
}
