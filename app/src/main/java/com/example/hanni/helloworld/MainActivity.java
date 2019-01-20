package com.example.hanni.helloworld;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CompoundButton;
import android.widget.Switch;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //对应过程
        Button btn1 = findViewById(R.id.btn1);
        final TextView tv1 = findViewById(R.id.tv1);
        Switch switch1 = findViewById(R.id.switch1);
        final TextView tv2 = findViewById(R.id.tv2);


        //操作
        btn1.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                tv1.setText("Hello world!!!!");
        }
        });

        switch1.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {

            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                            tv2.setText("开启");
                        }
                else {
                            tv2.setText("关闭");
                }
            }
        });

    }
}
