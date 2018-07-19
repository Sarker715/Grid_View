package com.map.gridviewdemo;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class CustomAdapter extends BaseAdapter {

    Context context;
    ArrayList<Cricketer> arrayList;

    public CustomAdapter(Context context, ArrayList<Cricketer> arrayList) {
        this.context = context;
        this.arrayList = arrayList;
    }

    @Override
    public int getCount() {
        return arrayList.size();
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View custom_View = inflater.inflate(R.layout.grid_item_layout, null);
        ImageView iv = custom_View.findViewById(R.id.Image);
        TextView tv = custom_View.findViewById(R.id.name);

        iv.setImageResource(arrayList.get(position).getImageId());
        tv.setText(arrayList.get(position).getName());


        return custom_View;
    }
}
