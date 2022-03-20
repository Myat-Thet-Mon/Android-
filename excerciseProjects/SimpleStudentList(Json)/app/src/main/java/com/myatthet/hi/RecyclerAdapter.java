package com.myatthet.hi;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class RecyclerAdapter extends RecyclerView.Adapter<ItemHolder> {
    private List<Student> studentList;

    public RecyclerAdapter(List<Student> studentList){
        this.studentList=studentList;
    }

    @NonNull
    @Override
    public ItemHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item,parent,false);
        return new ItemHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ItemHolder holder, int position) {
            Student student = studentList.get(position);
            holder.name.setText(student.name);
            holder.dateOfBirth.setText(student.dateOfBirth);
            holder.address.setText(student.address);
            holder.phNo.setText(student.phNo);
        }


    @Override
    public int getItemCount() {
        return studentList.size();
    }
}
