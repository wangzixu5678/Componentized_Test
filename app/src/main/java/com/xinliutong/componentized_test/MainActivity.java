package com.xinliutong.componentized_test;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.alibaba.android.arouter.launcher.ARouter;
import com.xinliutong.common.ARouteConStant;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ARouter.getInstance().inject(this);
    }



    public void btnGo1(View view) {
        ARouter.getInstance().build(ARouteConStant.APP_MAIN4).navigation();
    }

    public void btnGo2(View view) {
        ARouter.getInstance().build("/modulea/main2activity").navigation();
    }

    public void btnGo3(View view) {
        ARouter.getInstance().build("/moduleb/main3activity").navigation();
    }

    public void btnGo4(View view) {
        ARouter.getInstance().build("/common/main5activity").navigation();
    }


}
