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
        contents.add(new Content("Sofitel Budapest Casino", "Budapest, Széchenyi tér 2, 1051"));
        contents.add(new Content("Tropicana Casino", "Budapest, Vigadó u. 2, 1051"));
        contents.add(new Content("Atrium Eurocenter Casino", "Budapest, Bécsi út 154, 1037"));
        contents.add(new Content("Atlantis Casino","Budapest, Nagy Lajos király útja, 1142"));
        contents.add(new Content("Corvin Sétány Casino", "Budapest, Corvin sétány 4., 1082"));

        ContentAdapter adapter = new ContentAdapter(getActivity(), contents, R.color.text_container_background);

        ListView listView = (ListView) rootView.findViewById(R.id.list);

        listView.setAdapter(adapter);

        return rootView;
    }

}
