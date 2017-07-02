package com.acadgild.siddharth.fragassign104;

import android.graphics.Color;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
Button b1,b2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        b1 = (Button) findViewById(R.id.audio);
        b2 = (Button) findViewById(R.id.video);
        FragmentManager fma = getSupportFragmentManager();
        FragmentTransaction fta = fma.beginTransaction();
        fta.add(R.id.f1,new FragA());
        fta.commit();
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                FragmentManager fma = getSupportFragmentManager();
                FragmentTransaction fta = fma.beginTransaction();
                fta.replace(R.id.f1,new FragA());
                fta.commit();
            }
        });
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                FragmentManager fmb = getSupportFragmentManager();
                FragmentTransaction ftb = fmb.beginTransaction();
                ftb.replace(R.id.f1,new FragB());
                ftb.commit();
            }
        });
    }
}
