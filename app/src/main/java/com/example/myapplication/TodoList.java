package com.example.myapplication;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class TodoList extends AppCompatActivity {

    ListView listNumbers;
    TodoAdapter adapter;
    List<Todo> todos;
    String[] entries = {"First", "Second", "third"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_todo_list);

        listNumbers = findViewById(R.id.list);
        todos = new ArrayList<Todo>();
        todos.add(new Todo("1", "description 1"));
        todos.add(new Todo("2", "description 2"));
        todos.add(new Todo("3", "description 3"));
        todos.add(new Todo("4", "description 4"));
        todos.add(new Todo("5", "description 5"));
        todos.add(new Todo("6", "description 6"));
        todos.add(new Todo("7", "description 7"));
        todos.add(new Todo("8", "description 8"));
        todos.add(new Todo("9", "description 9"));
        todos.add(new Todo("10", "description 10"));
        todos.add(new Todo("11", "description 11"));
        todos.add(new Todo("12", "description 12"));
        todos.add(new Todo("13", "description 13"));
        todos.add(new Todo("14", "description 14"));
        todos.add(new Todo("15", "description 15"));
        todos.add(new Todo("16", "description 16"));
        todos.add(new Todo("17", "description 17"));
        todos.add(new Todo("18", "description 18"));
        todos.add(new Todo("19", "description 19"));
        todos.add(new Todo("20", "description 20"));


//        entries = getResources().getStringArray(android.R.array.phoneTypes);
        adapter = new TodoAdapter(this, R.layout.row, todos);
        listNumbers.setAdapter(adapter);

        listNumbers.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                String move = todos.get(position).toString();
                String move1 = todos.get(position).getDescription().toString();
//                int move2 = todos.get(position).getIconIndex();
                TextView textname = (TextView) findViewById(R.id.rowTitle);
                TextView textdes = (TextView) findViewById(R.id.rowDes);
                Intent I = new Intent(view.getContext(), MainActivity2.class);
                I.putExtra("key1", move);
                I.putExtra("key2", move1);
                startActivity(I);
                Toast.makeText(TodoList.this, parent.getAdapter().getItem(position).toString(), Toast.LENGTH_SHORT).show();
            }

        });


        listNumbers.setOnItemLongClickListener(new AdapterView
                .OnItemLongClickListener() {
            @Override
            public boolean onItemLongClick(AdapterView<?> parent, View view, int position, long id) {

//                createDialog(view);
                AlertDialog.Builder adb = new AlertDialog.Builder(TodoList.this);
                //adb.setView(Main.this);
                adb.setTitle("Delete Item");
                adb.setIcon(android.R.drawable.ic_dialog_alert);
                adb.setMessage("Are you sure you want to delete this item?");
                adb.setPositiveButton("Delete", new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int which) {
                        todos.remove(parent.getAdapter().getItem(position));
                        adapter.notifyDataSetChanged();
                        Toast.makeText(getApplicationContext(), "Delete", Toast.LENGTH_LONG).show();
                    } });

                AlertDialog alertDialog = adb.create();
                alertDialog.show();

                return true;
            }
        });

    }
//    public void createDialog(View view){
//
//        AlertDialog.Builder adb = new AlertDialog.Builder(this);
//        //adb.setView(Main.this);
//        adb.setTitle("Delete Item");
//        adb.setIcon(android.R.drawable.ic_dialog_alert);
//        adb.setMessage("Are you sure you want to delete this item?");
//        adb.setPositiveButton("Delete", new DialogInterface.OnClickListener() {
//            public void onClick(DialogInterface dialog, int which) {
//                todos.remove(0);
//
//                adapter.notifyDataSetChanged();
//
////                Toast.makeText(MainActivity.this, "Removed Fruit", Toast.LENGTH_SHORT).show();
//                Toast.makeText(getApplicationContext(), "Delete", Toast.LENGTH_LONG).show();
//
//            } });
//
////        adb.setNegativeButton("Cancel", new DialogInterface.OnClickListener() {
////            public void onClick(DialogInterface dialog, int which) {
////                Toast.makeText(getApplicationContext(), "cancel", Toast.LENGTH_LONG).show();
////                //finish();
////            } });
//
//        AlertDialog alertDialog = adb.create();
//        alertDialog.show();
//
//    }
}