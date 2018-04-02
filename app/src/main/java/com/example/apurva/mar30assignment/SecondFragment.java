package com.example.apurva.mar30assignment;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;


public class SecondFragment extends Fragment {


    ImageView img;
    public SecondFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v= inflater.inflate(R.layout.fragment_second, container, false);
        img=v.findViewById(R.id.img);

        return v;
    }

    public void setImg(int pos){

        switch (pos){
            case 0:
                img.setBackgroundResource(R.drawable.cupcake);
                break;
            case 1:
                img.setBackgroundResource(R.drawable.donut);
                break;
            case 2:
                img.setBackgroundResource(R.drawable.eclair);
                break;
            case 3:
                img.setBackgroundResource(R.drawable.froyo);
                break;
            case 4:
                img.setBackgroundResource(R.drawable.gingerbread);
                break;
            case 5:
                img.setBackgroundResource(R.drawable.honeycomb);
                break;
            case 6:
                img.setBackgroundResource(R.drawable.ice);
                break;
            case 7:
                img.setBackgroundResource(R.drawable.jellybean);
                break;
            case 8:
                img.setBackgroundResource(R.drawable.kitkat);
                break;
            case 9:
                img.setBackgroundResource(R.drawable.lolipop);
                break;
            case 10:
                img.setBackgroundResource(R.drawable.marshmallow);
                break;
            case 11:
                img.setBackgroundResource(R.drawable.nougat);
                break;
            case 12:
                img.setBackgroundResource(R.drawable.oreo);
                break;
        }


    }

}
