package com.example.mac.movieappbasic;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.mac.movieappbasic.Model.Movie;
import com.squareup.picasso.Picasso;

/**
 * Created by mac on 8/02/18.
 */

public class MovieDetail extends AppCompatActivity{

    ImageView imageDetail;
    TextView titleDetail;
    TextView releaseDate;
    TextView ratingDetail;
    TextView overview;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.movie_details_layout);

        Intent intent=getIntent();

        Movie movie=getIntent().getExtras().getParcelable("movie");

        String movieName=intent.getParcelableExtra("movieName");
        String poster=intent.getParcelableExtra("poster_path");
        String voteAverage=intent.getParcelableExtra("voteAverage");
        String overview=intent.getParcelableExtra("overview");
        String releaseDate=intent.getParcelableExtra("releaseDate");
        String posterPath=movie.getPoster_path();


        imageDetail=findViewById(R.id.imageMovie_detail_activity);

        Picasso.with(this).load(posterPath).into(imageDetail);

        titleDetail =findViewById(R.id.text_movie_name);
        titleDetail.setText(movieName);

    }
}
