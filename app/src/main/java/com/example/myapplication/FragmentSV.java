package com.example.myapplication;

import android.os.Bundle;
import android.support.v4.app.ListFragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;

public class FragmentSV extends ListFragment {


    ArrayList<SinhVien> arraySV;
    SvAdapter adapter;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        arraySV = new ArrayList<>();
        AddAraay();
        adapter = new SvAdapter(getActivity(), R.layout.row_student, arraySV );
        setListAdapter(adapter);

        return (View) inflater.inflate(R.layout.list_sv, container, false);
    }
    public void AddAraay(){
        arraySV.add(new SinhVien("Le Minh Hieu", "20", "Go Vap"));
        arraySV.add(new SinhVien("Lam Tan Hao", "21", "Go Vap"));

        arraySV.add(new SinhVien("Nguyen Tan Hoang", "20", "Binh Thanh"));
    }
}
