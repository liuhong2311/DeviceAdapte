package cn.edu.xyc.deviceadapte;

import android.content.Intent;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.LinearLayout;

import cn.edu.xyc.deviceadapte.fragments.BlankFragment;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = MainActivity.class.getSimpleName();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //当默认横竖屏切换  当前activity会销毁
        //会重新创建activity实例  再一次调用 oncreate
        //setcontentview就会重新加载布局
        //android系统就会根据手机的状态和参数定位到程序特定资源目录  例如：layout-land
        //中同名的xml文件来加载
        setContentView(R.layout.activity_main);
        //如果oncreate中的bundle参数中bundle有值  代表
        //activity被系统重新创建  会把activity内部
        //fragmentmanager管理的fragment，自动重新创建一遍
        //一次通常不需要再创建fragment了
        FragmentManager manager = getSupportFragmentManager();
        if(savedInstanceState==null){
            Log.d(TAG, "第一次创建");

            FragmentTransaction transaction = manager.beginTransaction();

            Fragment fragment = new BlankFragment();

            //支持横竖屏切换的时候；Fragment对象需要从
            //FragmentManager中查找fragment对象
            transaction.replace(R.id.menu_list,fragment, "Tag");

            transaction.commit();
        }else {
            Log.d(TAG, "第二次创建");
        }
        //需要获取指定的fragment

        Fragment menuFragment = manager.findFragmentByTag("Tag");

        //可以在特定布局中加入一些id  查找id就可以判断加载的是哪一个xml文件
        LinearLayout detail_container = (LinearLayout) findViewById(R.id.detail_container);



        if (detail_container != null) {
            // TODO: 处理横屏情况
        }else{
            // TODO: 处理竖屏情况
        }
    }

    @Override
    protected void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
    }

}
