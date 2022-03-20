package com.myatthet.hi;

import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class ItemHolder extends RecyclerView.ViewHolder {
    public TextView name;
    public TextView dateOfBirth;
    public TextView address;
    public TextView phNo;

    public ItemHolder(@NonNull View itemView) {
        super(itemView);
        name=itemView.findViewById(R.id.name);
        dateOfBirth=itemView.findViewById(R.id.dateOfBirth);
        address=itemView.findViewById(R.id.address);
        phNo=itemView.findViewById(R.id.phNo);
    }
}
