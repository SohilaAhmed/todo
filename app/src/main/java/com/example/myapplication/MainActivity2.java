package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {

    TextView text5;
    TextView text6;
    Button button;
    ImageView icon;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        text5 = (TextView)findViewById(R.id.textView5);
        text6 = (TextView)findViewById(R.id.textView6);
        button = (Button)findViewById(R.id.button);
        icon = (ImageView)findViewById(R.id.imageView2);

        Bundle b5 = getIntent().getExtras();
        String s5 =  b5.getString("key1");
        text5.setText(s5);

        Bundle b6 = getIntent().getExtras();
        String s6 =  b6.getString("key2");
        text6.setText(s6);

//        ph = getIntent().getStringExtra("key3");
        icon.setImageResource(getIntent().getIntExtra("key3", 0));
    }
    public void button(View view) {
//        Intent i2 = new Intent(this, MainActivity.class);
//        startActivity(i2);
        finish();
    }
}