package com.xinliutong.modulea;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.alibaba.android.arouter.facade.Postcard;
import com.alibaba.android.arouter.facade.annotation.Route;
import com.alibaba.android.arouter.facade.callback.NavigationCallback;
import com.alibaba.android.arouter.launcher.ARouter;
import com.xinliutong.common.TestBean;

import java.util.ArrayList;

@Route(path = "/modulea/main2activity")
public class Main2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        ARouter.getInstance().inject(this);
        findViewById(R.id.btnGo).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                doJump();
            }
        });
    }

    private void doJump() {
        ArrayList<TestBean> list = new ArrayList<>();
        list .add(new TestBean("超级玛丽",22));
        ARouter.getInstance().build("/moduleb/main3activity")
                .withString("str","abc")
                .withObject("object",new TestBean("笨猪",18))
                .withObject("list",list)
                .navigation(this, new NavigationCallback() {
                    @Override
                    public void onFound(Postcard postcard) {

                    }

                    @Override
                    public void onLost(Postcard postcard) {

                    }

                    @Override
                    public void onArrival(Postcard postcard) {

                    }

                    @Override
                    public void onInterrupt(Postcard postcard) {

                    }
                });
    }
}
