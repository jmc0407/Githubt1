package com.example.githubt1;

import android.content.Intent;
import android.support.v4.widget.SwipeRefreshLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.DividerItemDecoration;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class RecyclerMain extends AppCompatActivity {

    private RecyclerView RecyclerView;
    @Override

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recycler_main);
        Intent intent =new Intent(this.getIntent());

        initLayout();
        initData();
    }
    private void initLayout(){
        RecyclerView=(RecyclerView)findViewById(R.id.recyclerView);
    }

    private void initData(){

        List<RecyclerItem> albumList = new ArrayList<RecyclerItem>();

        for (int i =0; i<20; i ++){

            RecyclerItem album = new RecyclerItem();
            album.setTitle("어느 멋진 날");
            album.setArtist("정용");
            album.setImage(R.drawable.ic_launcher_background);
            albumList.add(album);
        }

        RecyclerView.setAdapter(new MyRecyclerAdapter(albumList,R.layout.itemrecyclerview));
        RecyclerView.setLayoutManager(new LinearLayoutManager(getApplicationContext()));
        RecyclerView.setItemAnimator(new DefaultItemAnimator());

    }


}
