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
        contents.add(new Content("Costes Restaurant", "4 Raday street, H-1092"));
        contents.add(new Content("Onyx", "Vörösmarty tér 7-8, 1051 Budapest"));
        contents.add(new Content("Spinoza", "Dob u. 15, 1074 Budapest"));
        contents.add(new Content("Corso Restaurant","Apáczai Csere János utca 12-14, 1052 Budapest"));
        contents.add(new Content("Nobu", "Erzsébet tér 7-8, 1051 Budapest"));
        contents.add(new Content("Rezkakas Bistro","V. Kerulet, Sas u. 3, Budapest"));
        contents.add(new Content("Remiz", "Budakeszi út 5, 1021 Budapest"));
        contents.add(new Content("Spoon","Vigadó tér 3. Kikötõ, 1052 Budapest"));
        contents.add(new Content("Peppers","Apáczai Csere János utca 4, 1052 Budapest"));
        contents.add(new Content("Bokonyha Winekitchen","V. kerulet Sas u. 3, 1051 Hungary"));

        ContentAdapter adapter = new ContentAdapter(getActivity(), contents, R.color.text_container_background);

        ListView listView = (ListView) rootView.findViewById(R.id.list);

        listView.setAdapter(adapter);

        return rootView;
    }

}
