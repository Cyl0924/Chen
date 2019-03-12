package com.handler;

import android.app.Activity;
import android.os.Bundle;
import android.widget.Toast;

public class Two_Activity extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Toast.makeText(Two_Activity.this,"欢迎进入",Toast.LENGTH_SHORT).show();

    }
}
