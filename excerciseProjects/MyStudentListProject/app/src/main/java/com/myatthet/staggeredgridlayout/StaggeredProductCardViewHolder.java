package com.myatthet.staggeredgridlayout;

import android.view.View;
import android.widget.TextView;

import com.android.volley.toolbox.NetworkImageView;
import com.myatthet.mystudentlistproject.R;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class StaggeredProductCardViewHolder extends RecyclerView.ViewHolder {

    public NetworkImageView productImage;
    public TextView name;
    public TextView address;
    public TextView phone;
    public TextView dateOfBirth;

    StaggeredProductCardViewHolder(@NonNull View itemView) {
        super(itemView);
        productImage = itemView.findViewById(R.id.product_image);
        name = itemView.findViewById(R.id.student_name);
        address = itemView.findViewById(R.id.student_address);
        phone = itemView.findViewById(R.id.student_ph);
        dateOfBirth = itemView.findViewById(R.id.student_dob);
    }
}