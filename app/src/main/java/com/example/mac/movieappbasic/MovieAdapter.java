package com.example.mac.movieappbasic;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.mac.movieappbasic.Model.Movie;

import java.util.ArrayList;

/**
 * Created by mac on 7/02/18.
 */

public class MovieAdapter extends RecyclerView.Adapter<MovieAdapter.NumberViewHolder> {

    private int mNumberItems;
    final private GridItemClickListener mOnClickListener;

    public interface GridItemClickListener{
        void onGridItemClick(int clickedItemIndex);
    }

    public MovieAdapter(int mNumberItems, GridItemClickListener listener) {
        this.mNumberItems = mNumberItems;
        this.mOnClickListener=listener;

    }

    @Override
    public MovieAdapter.NumberViewHolder onCreateViewHolder(ViewGroup viewGroup, int viewType) {

        Context context=viewGroup.getContext();
        int layoutDesignItem= R.layout.layout_design;
        LayoutInflater inflater=LayoutInflater.from(context);
        boolean shouldAttachToParentImmediately=false;

        View view= inflater.inflate(layoutDesignItem,viewGroup,shouldAttachToParentImmediately);
        NumberViewHolder viewHolder=new NumberViewHolder(view);

        return viewHolder;
    }

    @Override
    public void onBindViewHolder(MovieAdapter.NumberViewHolder holder, int position) {

        holder.bind(position);

    }

    @Override
    public int getItemCount() {
        return mNumberItems;
    }

    class NumberViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener{

        ImageView mainImage;
        TextView movieText;

        public NumberViewHolder(View itemView) {
            super(itemView);

            mainImage=itemView.findViewById(R.id.cardview_image);
            movieText=itemView.findViewById(R.id.movie_textView);

            itemView.setOnClickListener(this);
        }

        void bind(int listIndex){

            ArrayList<Movie> arrayListAdapter= new ArrayList<>();
            Movie movie=arrayListAdapter.get(listIndex);
            String movieName= movie.getMovieName();
            Double movieAverage=movie.getVoteAverage();
            String movieReleaseDate=movie.getReleaseDate();
            String movieOverview=movie.getOverview();



        }

        @Override
        public void onClick(View v) {
            int clickedPosition=getAdapterPosition();
            mOnClickListener.onGridItemClick(clickedPosition);
        }
    }
}
