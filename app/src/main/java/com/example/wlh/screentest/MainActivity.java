package com.example.wlh.screentest;

import android.content.Context;
import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.view.WindowManager;
import android.widget.TextView;
import com.example.wlh.screenutils.ScreenUtils;


public class MainActivity extends AppCompatActivity {
    private TextView text;
    private WindowManager wm;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        text = findViewById(R.id.text);
        wm = (WindowManager)getApplicationContext().getSystemService(Context.WINDOW_SERVICE);
        Context mContext = MainActivity.this;
        text.setText("当前屏幕宽度是： " + ScreenUtils.getScreenWidth(mContext) + ", 高度是： " + ScreenUtils.getScreenHeight(mContext) + ",密度是 " + ScreenUtils.getScreenDensity(mContext));
        //text.setText("当前屏幕宽度是： " + getScreenWidth() + ", 高度是： " + getScreenHeight() + ",密度是 " + getScreenDensity());
        //text.setTextColor(0xccff0000); //默认通透的 00
        text.setTextColor(Color.BLUE);

    }

    private int getScreenWidth() {
        DisplayMetrics dm = new DisplayMetrics();
        wm.getDefaultDisplay().getMetrics(dm);
        //getWindowManager().getDefaultDisplay().getMetrics(dm);
        return dm.widthPixels;
    }

    private int getScreenHeight() {
        DisplayMetrics dm = new DisplayMetrics();
        //wm.getDefaultDisplay().getMetrics(dm);
        getWindowManager().getDefaultDisplay().getMetrics(dm);
        return dm.heightPixels;
    }

    private float getScreenDensity() {
        DisplayMetrics dm = new DisplayMetrics();
        //wm.getDefaultDisplay().getMetrics(dm);
        getWindowManager().getDefaultDisplay().getMetrics(dm);
        return dm.density;
    }

}
