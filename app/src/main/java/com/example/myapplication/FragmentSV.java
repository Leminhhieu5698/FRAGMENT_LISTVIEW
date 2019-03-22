package com.example.myapplication;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.ListFragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;

public class FragmentSV extends ListFragment {

    ListView lst;
    ArrayList<SinhVien> arraySV;
    SvAdapter adapter;

    TruyenSV truyenSV;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        truyenSV = (TruyenSV) getActivity();
        arraySV = new ArrayList<>();
        adapter = new SvAdapter(getActivity(), R.layout.row_student, arraySV );
        setListAdapter(adapter);

        AddAraay();

        return (View) inflater.inflate(R.layout.list_sv, container, false);
    }

    @Override
    public void onListItemClick(ListView l, View v, int position, long id) {
        super.onListItemClick(l, v, position, id);
        truyenSV.truyendata(arraySV.get(position) );
    }

    public void AddAraay(){
        arraySV.add(new SinhVien("Le Minh Hieu", "20", "Go Vap"));
        arraySV.add(new SinhVien("Lam Tan Hao", "29", "Go Vap"));
        arraySV.add(new SinhVien("Nguyen Vu Thanh Dien", "20", "Binh Thanh"));
        arraySV.add(new SinhVien("Nguyen Tan Hoang", "40", "Binh Thanh"));
    }
}
