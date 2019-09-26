package com.xinliutong.modulea;

import android.content.Context;

import com.alibaba.android.arouter.facade.annotation.Route;

/**
 * description :
 * @author : wzx
 * email : 445826958@qq.com
 * date : 2019/9/25 17:16
 */
@Route(path = "/modulea/hello", name = "测试服务")
public class HelloServiceImpl implements HelloService {
    @Override
    public String sayHi() {
        return "你好你好";
    }

    @Override
    public void init(Context context) {

    }
}
