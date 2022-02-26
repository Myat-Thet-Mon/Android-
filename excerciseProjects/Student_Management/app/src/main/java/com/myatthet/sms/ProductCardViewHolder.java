package com.myatthet.sms;

import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.android.volley.toolbox.NetworkImageView;
import com.myatthet.mystudentlistproject.R;

public class ProductCardViewHolder extends RecyclerView.ViewHolder {

    public NetworkImageView studentImage;
    public TextView name;
    public TextView address;
    public TextView phone;
    public TextView dateOfBirth;

    public ProductCardViewHolder(@NonNull View itemView) {
        super(itemView);
        studentImage = itemView.findViewById(R.id.student_image);
        name = itemView.findViewById(R.id.student_name);
        address = itemView.findViewById(R.id.student_address);
        phone = itemView.findViewById(R.id.student_ph);
        dateOfBirth = itemView.findViewById(R.id.student_dob);
    }
}
