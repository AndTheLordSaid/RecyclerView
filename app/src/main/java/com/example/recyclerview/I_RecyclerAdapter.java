package com.example.recyclerview;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class I_RecyclerAdapter extends RecyclerView.Adapter<I_RecyclerAdapter.MyViewHolder> {
    ArrayList<ItemModel> itemModels;
    Context context;
    private final RecyclerViewInterface recyclerViewInterface;

    public I_RecyclerAdapter(Context context, ArrayList<ItemModel> itemModels, RecyclerViewInterface recyclerViewInterface) {
        this.context = context;
        this.itemModels = itemModels;
        this.recyclerViewInterface = recyclerViewInterface;
    }

    @NonNull
    @Override
    public I_RecyclerAdapter.MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        LayoutInflater inflater = LayoutInflater.from(context);
        View view = inflater.inflate(R.layout.recycler_view_row, parent, false);
        return new I_RecyclerAdapter.MyViewHolder(view,recyclerViewInterface);
    }

    @Override
    public void onBindViewHolder(@NonNull I_RecyclerAdapter.MyViewHolder holder, int position) {
        holder.tvHeading.setText(itemModels.get(position).getTitle());
        holder.tvDescription.setText(itemModels.get(position).getDescription());
        holder.tvLingo.setText(itemModels.get(position).getLingo());
        holder.imageView.setImageResource(itemModels.get(position).getImage());
    }

    @Override
    public int getItemCount() {
        return itemModels.size();
    }

    public static class MyViewHolder extends RecyclerView.ViewHolder{

        ImageView imageView;
        TextView tvHeading, tvDescription, tvLingo;

        public MyViewHolder(@NonNull View itemView, RecyclerViewInterface recyclerViewInterface) {
            super(itemView);

            imageView = itemView.findViewById(R.id.imageView);
            tvHeading = itemView.findViewById(R.id.textHeading);
            tvDescription = itemView.findViewById(R.id.textDescription);
            tvLingo = itemView.findViewById(R.id.textSlang);

            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if (recyclerViewInterface != null) {
                        int position = getAdapterPosition();
                        if (position != RecyclerView.NO_POSITION) {
                            recyclerViewInterface.onItemClicked(position);
                        }
                    }
                }
            });
        }
    }
}
