package com.firman.webservicevolley.Adapter;

import android.content.Context;
import android.content.Intent;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.firman.webservicevolley.DetailActivity;
import com.firman.webservicevolley.Holder.MainHolder;
import com.firman.webservicevolley.ItemObject;
import com.firman.webservicevolley.R;

import java.util.List;

/**
 * Created by Firman on 4/7/2017.
 */

public class MainAdapter extends RecyclerView.Adapter<MainHolder> {

    public List<ItemObject.ObjectBelajar.Results> resultsList;
    public Context context;

    public MainAdapter(Context context, List<ItemObject.ObjectBelajar.Results> resultsList) {
        this.context = context;
        this.resultsList = resultsList;
    }

    @Override
    public MainHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.layout_item, null);
        MainHolder mainHolder = new MainHolder(view);
        return mainHolder;
    }

    @Override
    public void onBindViewHolder(MainHolder holder, final int position) {
        holder.txt_name.setText(resultsList.get(position).name);
        holder.txt_office.setText(resultsList.get(position).office);
        holder.cardview_item.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(context, DetailActivity.class);
                i.putExtra("id", resultsList.get(position).id);
                i.putExtra("name", resultsList.get(position).name);
                i.putExtra("office", resultsList.get(position).office);
                i.putExtra("email", resultsList.get(position).email);
                view.getContext().startActivity(i);
            }
        });
    }

    @Override
    public int getItemCount() {
        return this.resultsList.size();
    }
}
