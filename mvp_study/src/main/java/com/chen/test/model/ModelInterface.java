package com.chen.test.model;

import java.util.Map;

public interface ModelInterface {

    public void toRequest (String path, Map<String,String> map, MyModelImplementation.MyCallBack myCallBack);

}
