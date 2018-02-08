package com.example.mac.movieappbasic;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

public class MainActivity extends AppCompatActivity {

    private static final int NUM_LIST_ITEMS=100;
    private MovieAdapter mMovieAdapter;
    private RecyclerView mMovieList;
    LinearLayoutManager LinearLayoutManager;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mMovieList=findViewById(R.id.rv_movies);

        LinearLayoutManager = new LinearLayoutManager(this);
        LinearLayoutManager.setOrientation(LinearLayoutManager.HORIZONTAL);
        mMovieList.setLayoutManager(LinearLayoutManager);
        mMovieList.setHasFixedSize(true);

        mMovieAdapter=new MovieAdapter(NUM_LIST_ITEMS);
        mMovieList.setAdapter(mMovieAdapter);
    }
}
