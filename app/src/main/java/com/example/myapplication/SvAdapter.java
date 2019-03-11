package com.example.myapplication;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.List;

public class SvAdapter extends BaseAdapter {
    private Context context;
    private int layout;
    private List<SinhVien> sinhVienList;

    public SvAdapter (Context context, int layout, List<SinhVien> sinhVienList){
        this.context = context;
        this.layout = layout;
        this.sinhVienList = sinhVienList;


    }

    @Override
    public int getCount() {
        return sinhVienList.size();
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    public  class ViewHolder{
        TextView txtTen;
    }
    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {

        ViewHolder holder;
        if(view == null ){
            holder = new ViewHolder();
            LayoutInflater inflater = (LayoutInflater) context.getSystemService(context.LAYOUT_INFLATER_SERVICE);
            view = inflater.inflate(layout, null);
            holder.txtTen = (TextView) view.findViewById(R.id.txtten);
            view.setTag(holder);
        }
        else {
            holder = (ViewHolder) view.getTag();
        }

        SinhVien sinhVien = sinhVienList.get(i);
        holder.txtTen.setText(sinhVien.getHoTen());
        return view;
    }
}
