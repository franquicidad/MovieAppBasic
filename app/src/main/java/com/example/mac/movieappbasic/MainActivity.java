package com.example.mac.movieappbasic;

import android.content.AsyncTaskLoader;
import android.content.Context;
import android.content.Intent;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.support.v4.app.LoaderManager;
import android.support.v4.content.Loader;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.GridView;
import android.widget.Toast;

import com.example.mac.movieappbasic.Model.Movie;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity implements LoaderManager.LoaderCallbacks<ArrayList<Movie>>{

    private static final String BASE_URL="https://api.themoviedb.org/3/movie/popular?api_key=";
    private static final String MERGED_BASE_URL= (BASE_URL+ R.string.movie_api_key);
    private static final String TOP_MOVIE ="https://api.themoviedb.org/3/movie/top_rated?api_key=";
    private static final String MERGED_TOP_MOVIE= (TOP_MOVIE+R.string.movie_api_key);

    private static final int NUM_LIST_ITEMS=100;
    private static final int MOVIE_LOADER_ID = 1;
    private MovieAdapter mMovieAdapter;
    private RecyclerView mMovieList;
    GridLayoutManager gridLayoutManager;
    GridView gridView;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mMovieList=findViewById(R.id.rv_movies);
        gridView=findViewById(R.id.gridview_layout);

        gridLayoutManager = new GridLayoutManager(this,2);
        mMovieList.setLayoutManager(gridLayoutManager);
        mMovieList.setHasFixedSize(true);


        LoaderManager loaderManager=getSupportLoaderManager();

        loaderManager.initLoader(MOVIE_LOADER_ID,null,MainActivity.this);


//
//        mMovieAdapter=new MovieAdapter(NUM_LIST_ITEMS, new MovieAdapter.GridItemClickListener() {
//            @Override
//            public void onGridItemClick(int clickedItemIndex) {
//
//                Intent intentMovieDetail=new Intent(getBaseContext(), MovieDetail.class);
//
//                String title=mMovieAdapter.getItemId(clickedItemIndex).
//
//            }
//        })

    }


    @Override
    public Loader<ArrayList<Movie>> onCreateLoader(int id, Bundle args) {

        String api_key= String.valueOf(R.string.movie_api_key);
        return new MovieAsynctaskLoader(this, BASE_URL+api_key );
    }

    @Override
    public void onLoadFinished(Loader<ArrayList<Movie>> loader, ArrayList<Movie> data) {

    }

    @Override
    public void onLoaderReset(Loader<ArrayList<Movie>> loader) {

    }


}
