package com.example.githubt1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class ListItem extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_item);
        TextView tvTitle = (TextView)findViewById(R.id.textView1);
        TextView tvArtist = (TextView)findViewById(R.id.textView2);
        ImageView iv = (ImageView)findViewById(R.id.imageView1);

        Intent intent = getIntent();
        tvTitle.setText(intent.getStringExtra("title"));
        tvArtist.setText(intent.getStringExtra("artist"));
        iv.setImageResource(intent.getIntExtra("img", 0));
    }
}


