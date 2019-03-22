package com.example.myapplication;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

public class FragmentInfo extends Fragment {

    TextView txtT,txtA,txtN;
    View view;
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.fragment_info, container, false);
        Anhxa ();
        return view;
    }
    public void Setinfo(SinhVien sv){
        txtT.setText (sv.getHoTen ());
        txtT.setText ("Tên: " + sv.getHoTen ());

        txtA.setText (sv.getTuoi ());
        txtA.setText ("Tuổi: " + sv.getTuoi ());

        txtN.setText (sv.getDiaChi ());
        txtN.setText ("Địa chỉ: " + sv.getDiaChi ());
    }
    private void Anhxa(){
        txtT = (TextView) view.findViewById (R.id.txtTen);
        txtA = (TextView) view.findViewById (R.id.txtTuoi);
        txtN = (TextView) view.findViewById (R.id.txtD);


    }
}
