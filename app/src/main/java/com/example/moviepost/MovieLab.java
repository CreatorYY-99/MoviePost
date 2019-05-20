package com.example.moviepost;

import java.util.ArrayList;
import java.util.List;

public class MovieLab {
    private static MovieLab instance = null;
    private List<String>movies;
    private MovieLab(List<String> movies){

        this.movies = movies;
    }
    private MovieLab(){
        init();
    }
    public static MovieLab get(){
        if (null == instance){
            instance = new MovieLab();
        }
        return instance;
    }

    /**
     * 返回电影数量
     * @return
     */
    public  int getSize(){
        return movies.size();
    }

    /**
     * 返回名称
     * @param n
     * @return
     */
    public String getMovie (int n){
        return movies.get(n);
    }

    private  void init(){
        movies = new ArrayList<>();
        movies.add("钢铁侠1");
        movies.add("钢铁侠2");
        movies.add("钢铁侠3");
        movies.add("复仇者联盟1");
        movies.add("复仇者联盟2");
    }
}