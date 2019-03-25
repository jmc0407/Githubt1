package com.example.githubt1;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

public class MyRecyclerAdapter extends RecyclerView.Adapter <MyRecyclerAdapter.ViewHolder> {

    private List<RecyclerItem> albumList;
    private int itemLayout;

    public MyRecyclerAdapter(List<RecyclerItem> items, int itemLayout) {
        this.albumList = items;
        this.itemLayout = itemLayout;

    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup viewGroup, int viewType) {
        View view = LayoutInflater.from(viewGroup.getContext()).inflate(itemLayout, viewGroup, false);
        return new ViewHolder(view);
    }

    public static class ViewHolder extends RecyclerView.ViewHolder {

        public ImageView img;
        public TextView textTitle;

        public ViewHolder(View itemView) {
            super(itemView);

            img = (ImageView) itemView.findViewById(R.id.img);
            textTitle = (TextView) itemView.findViewById(R.id.textTitle);
        }
    }

    @Override
    public void onBindViewHolder(ViewHolder viewHolder, int position) {
        RecyclerItem item = albumList.get(position);
        viewHolder.textTitle.setText(item.getTitle());
        viewHolder.img.setBackgroundResource(item.getImage());
        viewHolder.itemView.setTag(item);
    }

    @Override
    public int getItemCount() {
        return albumList.size();
    }

    /*public static class ViewHolder extends RecyclerView.ViewHolder {

        public ImageView img;
        public TextView textTitle;

        public ViewHolder(View itemView) {
            super(itemView);

            img = (ImageView) itemView.findViewById(R.id.img);
            textTitle = (TextView) itemView.findViewById(R.id.textTitle);
        }
    }*/
}
