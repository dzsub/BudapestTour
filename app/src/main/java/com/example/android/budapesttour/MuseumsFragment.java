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
        contents.add(new Content("Budapest History Museum", "1014 Budapest, Szent György tér 2."));
        contents.add(new Content("Holocaust Memorial Center", "1094 Budapest, Páva utca 39."));
        contents.add(new Content("House of Terror Museum", "1062 Budapest, Andrássy út 60."));
        contents.add(new Content("Hungarian National Museum","1088 Budapest, Múzeum körút 14-16."));
        contents.add(new Content("Hungarian Natural History Museum", "1083 Budapest, Ludovika tér 2-6."));
        contents.add(new Content("Kiscelli Museum","1037 Budapest, Kiscelli utca 108."));
        contents.add(new Content("Ludwig Museum", "1095 Budapest, Komor Marcell utca 1."));
        contents.add(new Content("Museum of Applied Arts","1091 Budapest, Üllői út 33-37."));
        contents.add(new Content("Museum of Ethography","1055 Budapest, Kossuth tér 12."));
        contents.add(new Content("Museum of Fine Arts","1146 Budapest, Dózsa György út 41."));

        ContentAdapter adapter = new ContentAdapter(getActivity(), contents, R.color.text_container_background);

        ListView listView = (ListView) rootView.findViewById(R.id.list);

        listView.setAdapter(adapter);

        return rootView;
    }

}
