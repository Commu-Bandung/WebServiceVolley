package com.firman.webservicevolley.Holder;

import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.firman.webservicevolley.R;

/**
 * Created by Firman on 4/7/2017.
 */

public class MainHolder extends RecyclerView.ViewHolder {

    private ImageView img_avatar;
    public TextView txt_name, txt_office;
    public CardView cardview_item;


    public MainHolder(View itemView) {
        super(itemView);
        img_avatar = (ImageView) itemView.findViewById(R.id.img_avatar);
        txt_name = (TextView) itemView.findViewById(R.id.txt_name);
        txt_office = (TextView) itemView.findViewById(R.id.txt_office);
        cardview_item = (CardView) itemView.findViewById(R.id.cardview_item);
    }
}
