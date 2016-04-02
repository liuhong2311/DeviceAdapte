package cn.edu.xyc.deviceadapte.widgets;

import android.content.Context;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;

/**
 * Created by Duang~ on 2016/3/30.
 */
public class DimensionView extends View {
    private static final String TAG = DimensionView.class.getSimpleName();

    public DimensionView(Context context) {
        super(context);
    }

    public DimensionView(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    @Override
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        int wSize = MeasureSpec.getSize(widthMeasureSpec);
        int hSize = MeasureSpec.getSize(heightMeasureSpec);
        Log.d(TAG, "w = " + wSize + "h = " + hSize);
        super.onMeasure(widthMeasureSpec, heightMeasureSpec);
    }
}
