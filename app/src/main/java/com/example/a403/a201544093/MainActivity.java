package com.example.a403.a201544093;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Layout;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Button b1;
    TextView t1;
    CheckBox cb;
    LinearLayout l1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        b1=(Button)findViewById(R.id.button);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(),
                        "안녕???",Toast.LENGTH_SHORT).show();
            }
        } );
        t1=(TextView)findViewById(R.id.textview);
        t1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText((getApplicationContext()),
                        "Hello Wolrd ?",Toast.LENGTH_SHORT).show();
            }
        });
   /*     l1=(Layout)findViewById((R.id.layout);
        l1.setBackgroundColor(Color.BLACK);*/

 /*       l1=(Layout)findViewById(R.id.layout);
        cb=(CheckBox)findViewById(R.id.checkBox);
        public void onClick(cb) {
            if (((CheckBox) cb).isChecked())
                // layout.background();
        }*/


    }
}
