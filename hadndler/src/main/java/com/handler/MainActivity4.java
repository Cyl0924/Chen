package com.handler;

import android.content.Intent;
import android.os.Handler;
import android.os.Message;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity4 extends AppCompatActivity {

    private int Time = 5;
    Handler handler = new Handler(){
        @Override
        public void handleMessage(Message msg) {

            switch (msg.what){
                case 1:
                    viewById.setText("进入主页面剩余"+Time+"秒");
                    if (Time>0){
                        Time--;
                        Message message = handler.obtainMessage(1);
                        handler.sendMessageDelayed(message, 1000);
                    }else{
                        getHome();
                    }
                    break;
            }
            super.handleMessage(msg);
        }
    };
    private TextView viewById;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main4);

        viewById = findViewById(R.id.tv);
        Message message = handler.obtainMessage(1);
        handler.sendMessageDelayed(message, 2000);

    }

    private void getHome(){

        Intent intent = new Intent(MainActivity4.this,Two_Activity.class);
        startActivity(intent);

    }

}
