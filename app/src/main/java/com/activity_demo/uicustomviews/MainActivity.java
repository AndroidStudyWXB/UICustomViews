package com.activity_demo.uicustomviews;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;

/**
 * Created by WXB506 on 2016/2/23.
 */
public class MainActivity extends Activity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        float xdpi = getResources().getDisplayMetrics().xdpi;
        float ydpi = getResources().getDisplayMetrics().ydpi;

        Log.d("MainActivity", "xdpi is " + xdpi);
        Log.d("MainActivity", "ydpi is " + ydpi);
    }
}
