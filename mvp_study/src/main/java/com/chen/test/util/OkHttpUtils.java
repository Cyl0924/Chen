package com.chen.test.util;

import android.os.Handler;
import android.os.Message;
import android.util.Log;

import java.io.IOException;
import java.util.Map;

import okhttp3.Call;
import okhttp3.Callback;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;

public class OkHttpUtils {

    public static OkHttpUtils OkHttpUtils;
    OkHttpClient okHttpClient;
    //构造方法私有化
    private OkHttpUtils(){
        okHttpClient = new OkHttpClient();

    }

    //单例模式 保证程序中只有一个请求在运行  加上线程锁
    public static synchronized OkHttpUtils getData(){

            OkHttpUtils = new OkHttpUtils();

        return OkHttpUtils;
    }

    //get 请求方法封装类
    public void doGet(String path, Map<String,String> map, final Handler han){
        //get 方法有参数进行请求的方法  if判断的是是否为有参请求
/*
        if (map != null && map.size()>0){
            String str = "";
            StringBuilder sb = new StringBuilder();
            for (String key : map.keySet()){
                String parmarKey = key;
                String value = map.get(parmarKey);
                //进行元素追加和拼接参数
                sb.append(parmarKey)
                        .append("=")
                        .append(value)
                        .append("&");
            }
            str = sb.toString();
            int i = str.lastIndexOf("&");
            str = str.substring(0,i);
            path = path+"?"+str;
        }
*/

        //构建这模式 进行构建 builde进行设置方法 和 请求地址
        Request request = new Request.Builder()
                .get()
                .url(path)
                .build();

        Call call = new OkHttpClient().newCall(request);
        //使用Okhttp 进行异步请求
        call.enqueue(new Callback() {
            @Override
            public void onFailure(Call call, IOException e) {
                //请求失败的方法
            }

            @Override
            public void onResponse(Call call, Response response) throws IOException {
                //请求成功的方法
                String json = response.body().string();
                Log.e("tag",json);
                Message message = new Message();
                message.obj = json;
                han.sendMessage(message);
            }
        });


    }


}
