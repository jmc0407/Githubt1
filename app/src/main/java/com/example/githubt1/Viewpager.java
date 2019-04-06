package com.example.githubt1;

import android.content.Intent;
import android.support.v4.app.FragmentStatePagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Viewpager extends AppCompatActivity {

    ViewPager vp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_viewpager);
        vp = (ViewPager)findViewById(R.id.vp);

        Intent intent =new Intent(this.getIntent());

        Button btn_first = (Button) findViewById(R.id.btn_first);
        Button btn_second = (Button) findViewById(R.id.btn_second);
        Button btn_third = (Button) findViewById(R.id.btn_third);
        vp.setAdapter(new pagerAdapter(getSupportFragmentManager()));
        vp.setCurrentItem(0);
        btn_first.setOnClickListener(movePageListener);
        btn_first.setTag(0);
        btn_second.setOnClickListener(movePageListener);
        btn_second.setTag(1);
        btn_third.setOnClickListener(movePageListener);
        btn_third.setTag(2);
    }

    View.OnClickListener movePageListener = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            int tag = (int) v.getTag();
            vp.setCurrentItem(tag);
        }
    };

    private class pagerAdapter extends FragmentStatePagerAdapter {
        public pagerAdapter(android.support.v4.app.FragmentManager fm) {
            super(fm);
        }

        @Override
        public android.support.v4.app.Fragment getItem(int position) {
            switch (position)
            {
                case 0:
                    return new Viewpager1Fragment();
                case 1:
                    return new Viewpager2Fragment();
                case 2:
                    return new Viewpager3Fragment();
                default:
                    return null;
            }
        }
        @Override
        public int getCount()
        {
        return 3;
        }
    }
}
