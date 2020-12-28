package com.example.homework4;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class DramaAdapter extends RecyclerView.Adapter {

    ArrayList<Drama> arr;
    Context context;

    public DramaAdapter(ArrayList<Drama> arr, Context context) {
        this.arr = arr;
        this.context = context;
    }

    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.drama_list,parent,false);
        ViewHolder vh = new ViewHolder(v);
        return vh;
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, int position) {
        ((ViewHolder)holder).name.setText(arr.get(position).getName());
        ((ViewHolder)holder).rating.setText(arr.get(position).getRaiting()+"");
        ((ViewHolder)holder).genre.setText(arr.get(position).getGenre());
        ((ViewHolder)holder).year.setText(arr.get(position).getYear());
        ((ViewHolder)holder).ep.setText(arr.get(position).getEpisods());
        ((ViewHolder)holder).img.setImageResource(arr.get(position).getImg());
    }

    @Override
    public int getItemCount() {
        return arr.size();
    }

    public static class ViewHolder extends RecyclerView.ViewHolder{

        public ImageView img;
        public View view;
        public TextView name;
        public TextView rating;
        public TextView genre;
        public TextView year;
        public TextView ep;


        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            view = itemView;
            img = itemView.findViewById(R.id.dramaimg);
            name = itemView.findViewById(R.id.title);
            rating= itemView.findViewById(R.id.ratingNo);
            genre=itemView.findViewById(R.id.genereNo);
            year=itemView.findViewById(R.id.yearNo);
            ep= itemView.findViewById(R.id.epNo);
        }
    }
}
