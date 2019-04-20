package com.example.githubt1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.Toast;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class ListActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list);
        Intent intent =new Intent(this.getIntent());//인텐트받기


       String[]values={"1","2","3","4","5"};
        ArrayAdapter<String>adapter=new ArrayAdapter<String>(this,
                android.R.layout.simple_list_item_1,values);
        ListView listView=(ListView)findViewById(R.id.List1);
        listView.setAdapter(adapter);
    }

}
