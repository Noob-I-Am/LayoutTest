package com.example.max.layouttest;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.content.Intent;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        (findViewById(R.id.button)).setOnClickListener(new View.OnClickListener() {
            public void onClick(View arg0) {
                Intent intent=new Intent();
                intent.setClass(MainActivity.this, Linear.class);
                MainActivity.this.startActivity(intent);
            }

        });
        ( findViewById(R.id.button2)).setOnClickListener(new View.OnClickListener() {
            public void onClick(View arg0) {
                Intent intent=new Intent();
                intent.setClass(MainActivity.this, Relative.class);
                MainActivity.this.startActivity(intent);
            }

        });

        ( findViewById(R.id.button3)).setOnClickListener(new View.OnClickListener() {
            public void onClick(View arg0) {
                Intent intent=new Intent();
                intent.setClass(MainActivity.this, Table.class);
                MainActivity.this.startActivity(intent);
            }

        });

    }
}
