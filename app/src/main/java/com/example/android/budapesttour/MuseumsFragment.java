package com.example.android.budapesttour;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 */
public class MuseumsFragment extends Fragment {


    public MuseumsFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.content_list, container, false);

        ArrayList<Content> contents = new ArrayList<Content>();
        contents.add(new Content(getString(R.string.Budapest_History_Museum), getString(R.string._1014_Budapest_Szent_György_tér_2)));
        contents.add(new Content(getString(R.string.Holocaust_Memorial_Center), getString(R.string._1094_Budapest_Páva_utca_39_)));
        contents.add(new Content(getString(R.string.House_of_Terror_Museum), getString(R.string._1062_Budapest_Andrássy_út_60_)));
        contents.add(new Content(getString(R.string.Hungarian_National_Museum),getString(R.string._1088_Budapest_Múzeum_körút_14_16_)));
        contents.add(new Content(getString(R.string.Hungarian_Natural_History_Museum), getString(R.string._1083_Budapest_Ludovika_tér_2_6_)));
        contents.add(new Content(getString(R.string.Kiscelli_Museum),getString(R.string._1037_Budapest_Kiscelli_utca_108_)));
        contents.add(new Content(getString(R.string.Ludwig_Museum), getString(R.string._1095_Budapest_Komor_Marcell_utca_1_)));
        contents.add(new Content(getString(R.string.Museum_of_Applied_Arts),getString(R.string._1091_Budapest_Üllői_út_33_37_)));
        contents.add(new Content(getString(R.string.Museum_of_Ethography),getString(R.string._1055_Budapest_Kossuth_tér_12_)));
        contents.add(new Content(getString(R.string.Museum_of_Fine_Arts),getString(R.string._1146_Budapest_Dózsa_György_út_41_)));

        ContentAdapter adapter = new ContentAdapter(getActivity(), contents, R.color.text_container_background);

        ListView listView = (ListView) rootView.findViewById(R.id.list);

        listView.setAdapter(adapter);

        return rootView;
    }

}
