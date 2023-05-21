package org.example;

public class MoviesManager {
    private int limit;
    private String[] movies = new String[0];

    public MoviesManager() {
        this.limit = 10;
    }

    public MoviesManager(int limit) {
        this.limit = limit;
    }

    public void add(String movie) {
        String[] tmp = new String[movies.length + 1];
        for (int i = 0; i < movies.length; i++) {
            tmp[i] = movies[i];
        }
        tmp[tmp.length - 1] = movie;
        movies = tmp;
    }

    public String[] findAll() {
        //сборка падает если возвращать приватный массив, поэтому возвращаем его клон
        return movies.clone();
    }

    public String[] findLast() {
        int moviesNumber;
        if (movies.length < limit) {
            moviesNumber = movies.length;
        } else {
            moviesNumber = limit;
        }

        String[] tmp = new String[moviesNumber];
        for (int i = 0; i < tmp.length; i++) {
            tmp[i] = movies[movies.length - 1 - i];
        }
        return tmp;
    }
}