package com.xinliutong.moduleb;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

import com.alibaba.android.arouter.facade.annotation.Autowired;
import com.alibaba.android.arouter.facade.annotation.Route;
import com.alibaba.android.arouter.launcher.ARouter;
import com.xinliutong.common.TestBean;

import java.util.List;

@Route(path = "/moduleb/main3activity")
public class Main3Activity extends AppCompatActivity {

    @Autowired(name = "str")
    String mString;
    @Autowired(name = "object")
    TestBean mTestBean;
    @Autowired(name = "list")
    List<TestBean> mList;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
        ARouter.getInstance().inject(this);
        ((TextView) findViewById(R.id.tv_result)).setText(mString  + mTestBean.getName() +mList.get(0).getName());
    }
}
