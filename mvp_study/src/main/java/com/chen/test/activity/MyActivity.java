package com.chen.test.activity;

import android.app.Activity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;

import com.chen.test.R;
import com.chen.test.adapter.RecAdapter;
import com.chen.test.bean.JavaBean;
import com.chen.test.presenter.PersenterImplementation;
import com.chen.test.presenter.PresenterInterface;
import com.chen.test.view.ViewInterface;

import java.util.ArrayList;
import java.util.List;

public class MyActivity extends Activity implements ViewInterface {

    private RecyclerView rcv;
    List<JavaBean.sss> mlist = new ArrayList<>();
    PresenterInterface presenterInterface;
    private RecAdapter recAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        init();

    }

    private void init() {
        rcv = findViewById(R.id.RecyclerView_id);
        LinearLayoutManager layoutManager = new LinearLayoutManager(this);
        //设置管理器显示方式
        layoutManager.setOrientation(LinearLayoutManager.VERTICAL);
        //衔接recyclerView
        rcv.setLayoutManager(layoutManager);
        presenterInterface = new PersenterImplementation(this);
        presenterInterface.toModel();
        recAdapter = new RecAdapter(mlist,this);
        rcv.setAdapter(recAdapter);
    }

    @Override
    public void refreshDisplay(List<JavaBean.sss> list) {
        this.mlist.addAll(list);
        recAdapter.notifyDataSetChanged();
    }
}
