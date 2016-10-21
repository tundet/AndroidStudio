package com.example.ryu.exercise1;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

/**
 * Created by RYU on 1.8.2016.
 */
public class Activity4 extends MainActivity {
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout4);

        TextView input2= (TextView)findViewById(R.id.inputView2);
        input2.setText(MainActivity.content2);
        System.out.println(input2.getText().toString() + " was input2");
    }

    @Override
    public void onBackPressed() {
        Intent intent = new Intent();
        intent.setClass(getBaseContext(), MainActivity.class);
        startActivity(intent);
    }
}
