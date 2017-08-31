package com.example.tejaspatel.teamsp;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;

/**
 * Created by Tejas Patel on 25-Jul-17.
 */


public class Pending extends Fragment {

    public ListView publishView;
    ArrayList<PendingInfo> pends;
    PendingAdapter postAdapter;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.pending, container, false);

        publishView=(ListView)rootView.findViewById(R.id.pendView);

        pends = new ArrayList<PendingInfo>();

        pends.add(new PendingInfo("cricket","TEJAS"));
        pends.add(new PendingInfo("cricket","TEJAS"));
        pends.add(new PendingInfo("cricket","TEJAS"));

        postAdapter=new PendingAdapter(rootView.getContext(),pends);
        publishView.setAdapter(postAdapter);

        return rootView;
    }
}
