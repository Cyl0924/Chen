package com.baway.weektest;

import android.os.AsyncTask;
import android.os.Handler;
import android.os.Message;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.GridView;
import android.widget.ListView;

import com.google.gson.Gson;

import java.util.List;

import adapter.GrivList;
import adapter.ListAdapter;
import adapter.ListAdapters;
import adapter.PagerAdapter;
import bean.Bean;
import util.HttpUtil;

public class MainActivity extends AppCompatActivity {

    private ViewPager ban;
    private GridView gv;
    private ListView lv;
    private String path = "http://gank.io/api/data/%E7%A6%8F%E5%88%A9/10/1";


    Handler handler = new Handler(){
        @Override
        public void handleMessage(Message msg) {
            msg();
        }
    };



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        InitData();



        ban = findViewById(R.id.ban);
        gv = findViewById(R.id.gv);
        lv = findViewById(R.id.lv);
        msg();
    }

    private void msg() {

        int currentItem =  ban.getCurrentItem();
        currentItem++;
        ban.setCurrentItem(currentItem);
        handler.sendEmptyMessageDelayed(0,1000);

    }

    private void InitData() {

        new AsyncTask<String,Void,String>(){
            @Override
            protected String doInBackground(String... strings) {

                String s = HttpUtil.getData(path);

                return s;
            }

            @Override
            protected void onPostExecute(String s) {
                super.onPostExecute(s);

                Gson gson = new Gson();
                Bean bean = gson.fromJson(s, Bean.class);
               List<Bean.Date> dateList = bean.results;

                ListAdapters adapters = new ListAdapters(MainActivity.this,dateList);
                ListAdapter listAdapter = new ListAdapter(MainActivity.this,dateList);
                PagerAdapter pagerAdapter = new PagerAdapter(MainActivity.this,dateList);
               gv.setAdapter(adapters);
               lv.setAdapter(listAdapter);
               ban.setAdapter(pagerAdapter);
            }
        }.execute();

    }


}
