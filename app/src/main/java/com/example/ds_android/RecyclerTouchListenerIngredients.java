package com.example.ds_android;

import android.content.Context;
import android.view.GestureDetector;
import android.view.MotionEvent;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class RecyclerTouchListenerIngredients implements RecyclerView.OnItemTouchListener{

    private GestureDetector gestureDetector;
    private RecyclerViewClickListenerIngredients clickListener;

    public RecyclerTouchListenerIngredients(Context context, RecyclerView recyclerView, GestureDetector gestureDetector, RecyclerViewClickListenerIngredients clickListener) {
        this.clickListener = (RecyclerViewClickListenerIngredients) clickListener;
        gestureDetector = new GestureDetector(context, new GestureDetector.SimpleOnGestureListener(){
            @Override
            public boolean onSingleTapUp(MotionEvent e) {
                return true;
            }
        });

    }

    @Override
    public boolean onInterceptTouchEvent(@NonNull RecyclerView rv, @NonNull MotionEvent e) {
        
        return false;
    }

    @Override
    public void onTouchEvent(@NonNull RecyclerView rv, @NonNull MotionEvent e) {

    }

    @Override
    public void onRequestDisallowInterceptTouchEvent(boolean disallowIntercept) {

    }
}
