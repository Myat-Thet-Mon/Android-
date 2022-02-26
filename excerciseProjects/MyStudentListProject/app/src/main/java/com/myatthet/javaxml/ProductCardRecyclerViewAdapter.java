package com.myatthet.javaxml;


import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.myatthet.mystudentlistproject.R;
import com.myatthet.network.ImageRequester;
import com.myatthet.network.StudentListEntry;

import java.util.List;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

/**
 * Adapter used to show a simple grid of products.
 */
public class ProductCardRecyclerViewAdapter extends RecyclerView.Adapter<ProductCardViewHolder> {

    private List<StudentListEntry> studentList;
    private ImageRequester imageRequester;

    ProductCardRecyclerViewAdapter(List<StudentListEntry> productList) {
        this.studentList = productList;
        imageRequester = ImageRequester.getInstance();
    }

    @NonNull
    @Override
    public ProductCardViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View layoutView = LayoutInflater.from(parent.getContext()).inflate(R.layout.product_card, parent, false);
        return new ProductCardViewHolder(layoutView);
    }

    @Override
    public void onBindViewHolder(@NonNull ProductCardViewHolder holder, int position) {
        if (studentList != null && position < studentList.size()) {
            StudentListEntry student = studentList.get(position);
            holder.name.setText(student.name);
            holder.address.setText(student.address);
            holder.phone.setText(student.phone);
            holder.dateOfBirth.setText(student.dob);
            imageRequester.setImageFromUrl(holder.productImage, student.url);
        }
    }

    @Override
    public int getItemCount() {
        return studentList.size();
    }
}
