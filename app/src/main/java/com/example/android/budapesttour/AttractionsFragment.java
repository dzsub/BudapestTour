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
public class AttractionsFragment extends Fragment {


    public AttractionsFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
       View rootView = inflater.inflate(R.layout.content_list, container, false);

        ArrayList<Content> contents = new ArrayList<Content>();
        contents.add(new Content("Szechenyi Bath",R.drawable.szechenyi_bath));
        contents.add(new Content("Buda Castle Hill",R.drawable.buda_castle));
        contents.add(new Content("Central Market Hall",R.drawable.central_market_hall));
        contents.add(new Content("House of Terror Museum",R.drawable.house_of_terror));
        contents.add(new Content("Opera House",R.drawable.opera_house));
        contents.add(new Content("Hungarian Parliament",R.drawable.hungarian_parliament));
        contents.add(new Content("St Stephen’s Basilica",R.drawable.st_stephens_basilica));
        contents.add(new Content("Heroes’ Square",R.drawable.heroes_squer));
        contents.add(new Content("Great Synagogue",R.drawable.great_synagogue));
        contents.add(new Content("Margaret Island",R.drawable.margaret_island));

        ContentAdapter adapter = new ContentAdapter(getActivity(), contents, R.color.text_container_bg_for_attractions);

        ListView listView = (ListView) rootView.findViewById(R.id.list);

        listView.setAdapter(adapter);

       return rootView;
    }

}
