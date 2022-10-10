package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView tv1;
    TextView tv2;
    RadioButton rb1;
    RadioButton rb2;
    Button b;
    ImageView iv;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tv1=findViewById(R.id.tv1);
        tv2=findViewById(R.id.tv2);
        rb1=findViewById(R.id.rb1);
        rb2=findViewById(R.id.rb2);

        iv=findViewById(R.id.iv);



    }

    public void respuesta(View view) {

        if(rb1.isChecked()){
            tv2.setText("Respuesta correcta");

            iv.setImageResource(R.drawable.like);
        }else{
            tv2.setText("Respuesta incorrecta");

            iv.setImageResource(R.drawable.dislike);

        }

    }
}