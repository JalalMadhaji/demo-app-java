package com.example.demoapp.adaptors;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.demoapp.R;
import com.example.demoapp.models.MyMenuItem;

import java.util.List;

public class MenuAdaptor extends RecyclerView.Adapter<MenuAdaptor.ViewHolder> {
    List<MyMenuItem> items;
    Context mContext;

    public MenuAdaptor(List<MyMenuItem> itemList, Context context){
        this.items = itemList;
        this.mContext = context;
    }

    @NonNull
    @Override
    public MenuAdaptor.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View root = LayoutInflater.from(mContext).inflate(R.layout.menu_list_item, parent, false);
        return new ViewHolder(root);
    }

    @Override
    public void onBindViewHolder(@NonNull MenuAdaptor.ViewHolder holder, int position) {
        final MyMenuItem item = items.get(position);
        holder.title.setText(item.getTitle());
        holder.image.setImageResource(item.getIcon());
    }

    @Override
    public int getItemCount() {
        return items.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        TextView title;
        ImageView image;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            title = itemView.findViewById(R.id.title);
            image = itemView.findViewById(R.id.icon);
        }
    }
}
