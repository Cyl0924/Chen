package com.chen.test.model;

import android.os.Handler;
import android.os.Message;

import com.chen.test.bean.JavaBean;
import com.chen.test.util.OkHttpUtils;
import com.google.gson.Gson;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class MyModelImplementation implements ModelInterface {


    List<JavaBean> list = new ArrayList<>();
    MyCallBack myCallBack;

    //线程解析数据 传递数据到接口方法 通过接口回调获取数据
    Handler handler = new Handler(){
        @Override
        public void handleMessage(Message msg) {
            super.handleMessage(msg);
            String json = (String) msg.obj;
            Gson gson = new Gson();
            JavaBean javaBean = gson.fromJson(json, JavaBean.class);
            myCallBack.success(javaBean);
        }
    };

    @Override
    public void toRequest(String path, Map<String, String> map, MyCallBack myCallBack) {

        this.myCallBack = myCallBack;
        //调用工具类请求数据
        OkHttpUtils.getData().doGet(path,map,handler);

    }

    //创建CallBack 进行回调
    public interface MyCallBack{
        public void success(Object obj);//成功回调的方法
        public void error(String str); //失败回调的方法
    }

}
