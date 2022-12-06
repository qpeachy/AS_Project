package com.example.ds_android;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.ds_android.Model.Forecast;
import com.example.ds_android.Model.Ingredients;

import java.util.ArrayList;

public class RecyclerViewAdapteForecasts extends RecyclerView.Adapter<RecyclerViewAdapteForecasts.RecyclerViewHolder> {

    private ArrayList<Forecast> dateModelList;

    public RecyclerViewAdapteForecasts(ArrayList<Forecast> dateModelList) {
        this.dateModelList = dateModelList;
    }

    @NonNull
    @Override
    public RecyclerViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        RecyclerViewHolder viewHolder;
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.ingredient_recyclerview_list_item, parent, false);
        viewHolder = new RecyclerViewHolder(view);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerViewHolder holder, int position) {
        holder.tvDate.setText(dateModelList.get(position).getDatetime());
        holder.tvTemps.setText(String.valueOf(dateModelList.get(position).getMain().getTemp()));

    }

    public long getItemId(int position){
        return super.getItemId(position);
    }

    @Override
    public int getItemCount() {
        return dateModelList.size();
    }

    public class RecyclerViewHolder extends RecyclerView.ViewHolder {
        TextView tvDate;
        TextView tvTemps;

        public RecyclerViewHolder(@NonNull View itemView) {
            super(itemView);
            this.tvDate = tvDate;
            this.tvTemps = tvTemps;
        }
    }
}
