package com.example.myapplication;
import android.content.Intent;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity implements TruyenSV{


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


    }

    @Override
    public void truyendata(SinhVien sinhVien) {
        FragmentInfo fragmentInfo;
        fragmentInfo = (FragmentInfo)getFragmentManager ().findFragmentById (R.id.fragment3);
        if(fragmentInfo != null && fragmentInfo.isInLayout ()){
            fragmentInfo.Setinfo (sinhVien);
        }
        else {
            Intent intent = new Intent (MainActivity.this, StudentInfomation.class);
            intent.putExtra ("ttsv", sinhVien);
            startActivity (intent);
        }


    }
}
