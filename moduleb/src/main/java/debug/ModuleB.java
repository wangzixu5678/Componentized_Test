package debug;

import android.app.Application;
import android.util.Log;

import com.xinliutong.common.App;
import com.xinliutong.common.BaseApplication;

/**
 * description :
 *
 * @author : wzx
 * email : 445826958@qq.com
 * date : 2019/9/26 09:49
 */
public class ModuleB extends BaseApplication {
    @Override
    public void onCreate() {
        super.onCreate();
        Log.d("AAA", "onCreate: 初始化组件B" );
    }
}
