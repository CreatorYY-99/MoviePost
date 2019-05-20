package com.example.moviepost;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

public class MovieListAdapter extends RecyclerView.Adapter<MovieListAdapter.MovieViewHolder>{
    /**
     * 创建一行具体的行，在这里是指电影行对应的ViewHolder类对象
     * @param parent
     * @param viewType
     * @return
     */
    @NonNull
    @Override
    public MovieViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        //找到电影行对应的xml,并将其“反析”出来（inflate）
        View container=LayoutInflater.from(parent.getContext()).inflate(
                R.layout.movie_view,parent,false);
        //写一个点击事件
       /* this.MovieViewHolder;
        return new MovieViewHolder(container);
    }*/

    /**
     * 填充每一行的内容，此时暂时硬编码，让所有行内容相同
     * @param holder
     * @param position
     */
    @Override
    public void onBindViewHolder(@NonNull MovieViewHolder holder, int position) {
        String name = MovieLab.get().getMovie(position);
        holder.bind(name);
    }

    /**
     * 表示行数。
     * @return MovieLab.get().getSize
     */
    @Override
    public int getItemCount() {
        return MovieLab.get().getSize();
    }

    //内部类，应该与电影行布局XML对应
    public class MovieViewHolder extends RecyclerView.ViewHolder{
        private TextView movieName;
        public MovieViewHolder(View container){
            super(container);
            movieName=container.findViewById(R.id.movieName);
        }

        /**
         * 把传入的值显示到对应控件上
         * @param movieName
         */
        public void bind(String movieName){
            this.movieName.setText(movieName);
        }
    }
}