package cn.edu.xyc.deviceadapte;

import android.app.Activity;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.widget.TextView;

public class ScreenActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_screen);

        //获取屏幕的尺寸信息
        DisplayMetrics metrics = getResources().getDisplayMetrics();
        int widthPixels = metrics.widthPixels;

        int heightPixels = metrics.heightPixels;

        TextView textInfo = (TextView) findViewById(R.id.screen_info);
        StringBuilder sb = new StringBuilder();
        sb.append("屏幕的宽度:").append(widthPixels).append("\n屏幕高度:").append(heightPixels).toString();
        sb.append("\n屏幕密度:").append(metrics.densityDpi);
        textInfo.setText(sb.toString());
//        getWindowManager().getDefaultDisplay();
    }
}
