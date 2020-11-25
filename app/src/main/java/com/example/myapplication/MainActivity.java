   package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.util.Calendar;

   public class MainActivity extends AppCompatActivity {
    EditText editTextName;
    EditText editTextMessage;
    Button btnClickHere;
    Button btnClickHere3;
    Button btnClickHere11;
    TextView textName;
    TextView textName2;
    TextView textName3;

    int count = 0;

    private static final String TAG = "QuizActivity";

       @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.d(TAG, "onCreate() called");
        setContentView(R.layout.activity_main);
        editTextName = (EditText)findViewById(R.id.editTextName);
        editTextMessage = (EditText)findViewById(R.id.editTextMessage);
        btnClickHere = (Button) findViewById(R.id.btnClickHere);
        btnClickHere3 = (Button) findViewById(R.id.btnClickHere3);
        btnClickHere11 = (Button) findViewById(R.id.btnClickHere11);
        textName = (TextView)findViewById(R.id.textName);
        textName2 = (TextView)findViewById(R.id.textName2);
        textName3 = (TextView)findViewById(R.id.textName3);

//        btnClickHere.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//               String Phone = editTextName.getText().toString();
//               textName.setText("Phone: " + Phone);
//               String Message = editTextMessage.getText().toString();
//               textName2.setText("Message: " + Message);
//
//
//            }
//        });
        if(savedInstanceState != null){
            count = savedInstanceState.getInt("count");
            textName3.setText("" + count);
        }

        btnClickHere3.setOnClickListener(new View.OnClickListener() {
               @Override
               public void onClick(View v) {
                   count++;
                   textName3.setText(Integer.toString(count));

               }
        });

        btnClickHere11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
                System.exit(0);
            }
        });
    }

    public void doSomeThing(View view) {
        Calendar c = Calendar.getInstance();
        int year = c.get(Calendar.YEAR);
        int month = c.get(Calendar.MONTH);

        String Phone = editTextName.getText().toString();
        String Message = editTextMessage.getText().toString();
        int y = year - Integer.parseInt(Phone);
        int m = (month - Integer.parseInt(Message)) + 1;

        Intent i1 = new Intent(this, Second.class);
        i1.putExtra("user",Integer.toString(y));
        i1.putExtra("user2",Integer.toString(m));
        startActivity(i1);
    }

    public void onSaveInstanceState(Bundle outstate){
           super.onSaveInstanceState(outstate);
           outstate.putInt("count", count);
    }

    @Override
    public void onStart() {
        super.onStart();
        Log.d(TAG, "onStart() called");
    }

    @Override
    public void onPause() {
        super.onPause();
        Log.d(TAG, "onPause() called");
    }

    @Override
    public void onResume() {
        super.onResume();
        Log.d(TAG, "onResume() called");
    }

    @Override
    public void onStop() {
        super.onStop();
        Log.d(TAG, "onStop() called");
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        Log.d(TAG, "onDestroy() called");
    }


   }