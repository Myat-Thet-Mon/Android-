package com.example.studentlist_dao;

import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class StudentHolder extends RecyclerView.ViewHolder {
    public TextView name;
    public TextView dob;
    public TextView address;
    public TextView phNo;


    public StudentHolder(@NonNull View itemView) {
        super(itemView);
        name=itemView.findViewById(R.id.name);
        dob=itemView.findViewById(R.id.dateOfBirth);
        address=itemView.findViewById(R.id.address);
        phNo=itemView.findViewById(R.id.phNo);
    }
}
