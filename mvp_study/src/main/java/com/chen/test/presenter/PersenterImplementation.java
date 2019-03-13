package com.chen.test.presenter;

import com.chen.test.bean.JavaBean;
import com.chen.test.model.ModelInterface;
import com.chen.test.model.MyModelImplementation;
import com.chen.test.view.ViewInterface;

import java.util.List;

public class PersenterImplementation implements PresenterInterface {

    //获取Model层对象
    ModelInterface MyMode;
    //获取View层对象
    ViewInterface viewInterface;
    //本类的构造方法

    public PersenterImplementation(ViewInterface viewInterface){
        //接口对象 调用实现类
        MyMode = new MyModelImplementation();
        this.viewInterface = viewInterface;
    }

    @Override
    public void toModel() {
        MyMode.toRequest("http://api.expoon.com/AppNews/getNewsList/type/1/p/2",null, new MyModelImplementation.MyCallBack() {
            @Override
            public void success(Object obj) {

                // instanceof 是 java和php的一个二元操作符 和= >同位

                if(obj instanceof JavaBean){

                    JavaBean javaBean = (JavaBean)obj;
                    viewInterface.refreshDisplay(javaBean.data);
                }
            }

            @Override
            public void error(String str) {

            }
        });
    }
}
