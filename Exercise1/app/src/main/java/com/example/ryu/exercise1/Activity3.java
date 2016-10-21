package com.example.ryu.exercise1;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

/**
 * Created by RYU on 1.8.2016.
 */
public class Activity3 extends MainActivity {
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout3);

        TextView input1 = (TextView)findViewById(R.id.inputView);
        input1.setText(MainActivity.content1);
        System.out.println(input1.getText().toString() + " was input1");

        Button button3 = (Button) findViewById(R.id.button3);
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.setClass(getBaseContext(), Activity4.class);
                startActivity(intent);
            }
        });
    }

}
