package com.sunql.ndkfrist;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        JniLoader jniLoader=new JniLoader();
        String string=  jniLoader.stringFromJNI();
        TextView textView=findViewById(R.id.textview);
        if (!TextUtils.isEmpty(string)){
            textView.setText(string);
        }else {
            textView.setText("获取null");
        }
    }
}
