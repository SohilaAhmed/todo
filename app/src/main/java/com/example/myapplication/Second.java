package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Second extends AppCompatActivity {

    TextView text1;
    TextView text2;
    Button back;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        text1 = (TextView)findViewById(R.id.result);
        text2 = (TextView)findViewById(R.id.result2);
        back = (Button)findViewById(R.id.back);

        Bundle b1 = getIntent().getExtras();
        String s1 =  b1.getString("user");
        text1.setText(s1);

        Bundle b2 = getIntent().getExtras();
        String s2 =  b2.getString("user2");
        text2.setText(s2);

    }


    public void back(View view) {
//        Intent i2 = new Intent(this, MainActivity.class);
//        startActivity(i2);
        finish();
    }
}