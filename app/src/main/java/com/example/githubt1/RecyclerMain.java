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

    /*private void setRecyclerView(){
        mainBinding.recyclerView.setHasFixedSize(true);

        adapter=new Myadapter(mItems);
        mainBinding.recyclerView.setAdapter(adapter);
        mainBinding.recyclerView.setLayoutManager(new LinearLayoutManager(this));
        DividerItemDecoration dividerItemDecoration=
                new DividerItemDecoration(getApplicationContext(),new LinearLayoutManager(this).getOrientation());
        mainBinding.recyclerView.addItemDecoration(dividerItemDecoration);

        mainBinding.recyclerView.addOnItemTouchListener(
                new RecyclerItemClickListener(getApplicationContext(), mainBinding.recyclerView, new RecyclerItemClickListener.OnItemClickListener() {
                    @Override
                    public void onItemClick(View view, int position) {
                        Toast.makeText(getApplicationContext(),position+"번 째 아이템 클릭",Toast.LENGTH_SHORT).show();

                    }
                    @Override
                    public void onLongItemClick(View view, int position) {
                        Toast.makeText(getApplicationContext(),position+"번 째 아이템 롱 클릭",Toast.LENGTH_SHORT).show();
                    }
                }));
        setData();
    }

    private void setRefresh(){
        mainBinding.swipeRefreshLo.setOnRefreshListener(this);
        mainBinding.swipeRefreshLo.setColorSchemeColors(getResources().getIntArray(R.array.google_colors));
    }


    @Override
    public void onRefresh() {
        mainBinding.recyclerView.postDelayed(new Runnable() {
            @Override
            public void run() {
                Snackbar.make(mainBinding.recyclerView,"Refresh Success",Snackbar.LENGTH_SHORT).show();
                mainBinding.swipeRefreshLo.setRefreshing(false);
            }
        },500);
    }

    private void setData(){
        mItems.clear();
        // RecyclerView 에 들어갈 데이터를 추가합니다.
        for(String name : names){
            mItems.add(new RecyclerItem(name));
            mItems.add(new RecyclerItem(name));
        }
        adapter.notifyDataSetChanged();
    }*/

