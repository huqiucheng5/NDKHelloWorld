package com.hu.ndkhelloworld;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    //静态代码块加载C语言库文件
    static {
        System.loadLibrary("hello");
    }

    /*
 * 声明一个native方法
 * 这个方法在Java中是没有实现的, 没有方法体
 * 该方法需要使用C语言编写
 */
    public native String helloFromJNI();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onJni(View view) {
        ((TextView) findViewById(R.id.textView)).setText("打印：" + helloFromJNI());
    }
}
