package com.xinliutong.common;

import android.content.Context;

import com.alibaba.android.arouter.facade.annotation.Route;
import com.alibaba.android.arouter.facade.service.SerializationService;
import com.google.gson.Gson;


import java.lang.reflect.Type;

/**
 * Used for json converter
 *
 * @author zhilong <a href="mailto:zhilong.lzl@alibaba-inc.com">Contact me.</a>
 * @version 1.0
 * @since 2017/4/10 下午2:10
 */
@Route(path = "/common/json")
public class JsonServiceImpl implements SerializationService {
    @Override
    public void init(Context context) {

    }

    @Override
    public <T> T json2Object(String text, Class<T> clazz) {
        return new Gson().fromJson(text,clazz);
    }

    @Override
    public String object2Json(Object instance) {
        return new Gson().toJson(instance);

    }

    @Override
    public <T> T parseObject(String input, Type clazz) {
        return new Gson().fromJson(input,clazz);
    }
}
