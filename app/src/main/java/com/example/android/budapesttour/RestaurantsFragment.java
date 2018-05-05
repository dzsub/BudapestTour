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
public class RestaurantsFragment extends Fragment {


    public RestaurantsFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.content_list, container, false);

        ArrayList<Content> contents = new ArrayList<Content>();
        contents.add(new Content(getString(R.string.Costes_Restaurant), getString(R.string._4Raday_street_H_1092)));
        contents.add(new Content(getString(R.string.Onyx), getString(R.string.Vörösmarty_tér_7_8_1051_Budapest)));
        contents.add(new Content(getString(R.string.Spinoza), getString(R.string.Dob_u_15_1074_Budapest)));
        contents.add(new Content(getString(R.string.Corso_Restaurant),getString(R.string.Apáczai_Csere_János_utca_12_14_1052_Budapest)));
        contents.add(new Content(getString(R.string.Nobu), getString(R.string.Erzsébet_tér_7_8_1051_Budapest)));
        contents.add(new Content(getString(R.string.Rezkakas_Bistro),getString(R.string.V_Kerulet_Sas_u_3_Budapest)));
        contents.add(new Content(getString(R.string.Remiz), getString(R.string.Budakeszi_út_5_1021_Budapest)));
        contents.add(new Content(getString(R.string.Spoon),getString(R.string.Vigadó_tér_3_Kikötõ_1052_Budapest)));
        contents.add(new Content(getString(R.string.Peppers),getString(R.string.Apáczai_Csere_János_utca_4_1052_Budapest)));
        contents.add(new Content(getString(R.string.Bokonyha_Winekitchen),getString(R.string.V_kerulet_Sas_u_3_1051_Hungary)));

        ContentAdapter adapter = new ContentAdapter(getActivity(), contents, R.color.text_container_background);

        ListView listView = (ListView) rootView.findViewById(R.id.list);

        listView.setAdapter(adapter);

        return rootView;
    }

}
