package com.example.saiful.mynavigationdrawer;

import android.nfc.Tag;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

public class  PageFragment extends Fragment{

    static final  String TAG = PageFragment.class.getSimpleName();

    public static final String EXTRAS = "extras";

    public PageFragment(){

    }
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState){
        return inflater.inflate(R.layout.fragment_page, container, false);
    }
    @Override
    public void onViewCreated(@NonNull View view,@NonNull Bundle savedInstanceState){
        super.onViewCreated(view, savedInstanceState);
        TextView textView = view.findViewById(R.id.tv_fragment);

        if(getArguments() != null){
            String page = getArguments().getString(EXTRAS);
            textView.setText(page);

            Log.e(TAG, "onCreateView: halaman fragment" + page);
        }

    }

}