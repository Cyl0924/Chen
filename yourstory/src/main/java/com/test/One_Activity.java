package com.test;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.view.View;
import android.widget.TextView;

public class One_Activity extends Activity {

    private int Time = 10;
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
        setContentView(R.layout.activity_main1);

        viewById = findViewById(R.id.tv);
        Message message = handler.obtainMessage(1);
        handler.sendMessageDelayed(message, 2000);

    }


    private void getHome(){

        Intent intent = new Intent(One_Activity.this,MainActivity.class);
        startActivity(intent);

    }

}
