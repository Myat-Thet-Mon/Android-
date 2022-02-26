package com.myatthet.staggeredgridlayout;

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
 * Adapter used to show an asymmetric grid of products, with 2 items in the first column, and 1
 * item in the second column, and so on.
 */
public class StaggeredProductCardRecyclerViewAdapter extends RecyclerView.Adapter<StaggeredProductCardViewHolder> {

    private List<StudentListEntry> studentList;
    private ImageRequester imageRequester;

    public StaggeredProductCardRecyclerViewAdapter(List<StudentListEntry> productList) {
        this.studentList = productList;
        imageRequester = ImageRequester.getInstance();
    }

    @Override
    public int getItemViewType(int position) {
        return position % 3;
    }

    @NonNull
    @Override
    public StaggeredProductCardViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        int layoutId = R.layout.staggered_product_card_first;
        if (viewType == 1) {
            layoutId = R.layout.staggered_product_card_second;
        } else if (viewType == 2) {
            layoutId = R.layout.staggered_product_card_third;
        }

        View layoutView = LayoutInflater.from(parent.getContext()).inflate(layoutId, parent, false);
        return new StaggeredProductCardViewHolder(layoutView);
    }

    @Override
    public void onBindViewHolder(@NonNull StaggeredProductCardViewHolder holder, int position) {
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
