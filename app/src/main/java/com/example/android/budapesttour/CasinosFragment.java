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
public class CasinosFragment extends Fragment {


    public CasinosFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.content_list, container, false);

        ArrayList<Content> contents = new ArrayList<Content>();
        contents.add(new Content(getString(R.string.Sofitel_Budapest_Casino), getString(R.string.Budapest_Széchenyi_tér_2_1051)));
        contents.add(new Content(getString(R.string.Tropicana_Casino), getString(R.string.Budapest_Vigadó_u_2_1051)));
        contents.add(new Content(getString(R.string.Atrium_Eurocenter_Casino), getString(R.string.Budapest_Bécsi_út_154_1037)));
        contents.add(new Content(getString(R.string.Atlantis_Casino),getString(R.string.Budapest_Nagy_Lajos_király_útja_1142)));
        contents.add(new Content(getString(R.string.Corvin_Sétány_Casino), getString(R.string.Budapest_Corvin_sétány_4__1082)));

        ContentAdapter adapter = new ContentAdapter(getActivity(), contents, R.color.text_container_background);

        ListView listView = (ListView) rootView.findViewById(R.id.list);

        listView.setAdapter(adapter);

        return rootView;
    }

}
