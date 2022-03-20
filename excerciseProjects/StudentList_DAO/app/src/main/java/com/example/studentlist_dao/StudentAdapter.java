package com.example.studentlist_dao;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class StudentAdapter extends RecyclerView.Adapter<StudentHolder> {
    List<StudentEntity> studentList;

    @NonNull
    @Override
    public StudentHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.recyclerview_item,parent,false);
        return new StudentHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull StudentHolder holder, int position) {
        StudentEntity student=studentList.get(position);
        holder.name.setText(student.getName());
        holder.dob.setText(student.getDateOfBirth());
        holder.address.setText(student.getAddress());
        holder.phNo.setText(student.getPhNo());
    }


    @Override
    public int getItemCount() {
        return studentList.size();
    }

    public void setWords(List<StudentEntity> studentEntityList){
        this.studentList = studentEntityList;
        notifyDataSetChanged();
    }
}
