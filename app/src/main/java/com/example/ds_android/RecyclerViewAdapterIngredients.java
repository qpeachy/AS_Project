package com.example.ds_android;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.ds_android.Model.Ingredient;

import java.util.ArrayList;

public class RecyclerViewAdapterIngredients extends RecyclerView.Adapter<RecyclerViewAdapterIngredients.RecyclerViewHolder> {

    private ArrayList<Ingredient> dateModelList;

    public RecyclerViewAdapterIngredients(ArrayList<Ingredient> dateModelList) {
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
        holder.tvNom.setText(dateModelList.get(position).getNom());
        holder.tvIndice.setText(dateModelList.get(position).getIndice());

    }

    public long getItemId(int position){
        return super.getItemId(position);
    }

    @Override
    public int getItemCount() {
        return dateModelList.size();
    }

    public class RecyclerViewHolder extends RecyclerView.ViewHolder {
        TextView tvNom;
        TextView tvIndice;

        public RecyclerViewHolder(@NonNull View itemView) {
            super(itemView);
            this.tvNom = itemView.findViewById(R.id.tvNom);
            this.tvIndice = itemView.findViewById(R.id.tvIndice);
        }
    }
}
