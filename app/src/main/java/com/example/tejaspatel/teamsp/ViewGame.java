package com.example.tejaspatel.teamsp;

/**
 * Created by Tejas Patel on 25-Jul-17.
 */

import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.ListView;

import java.util.ArrayList;

public class ViewGame extends Fragment{

    public ListView listView;
    public ArrayList<ListInfo> listInfo;
    ListInfoAdapter listInfoAdapter;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.view1, container, false);

        listView=(ListView)rootView.findViewById(R.id.list_view);
        listInfo=new ArrayList<ListInfo>();

        listInfo.add(new ListInfo("img","TEJAS","CRICKET"));
        listInfo.add(new ListInfo("img","TEJAS","CRICKET"));
        listInfo.add(new ListInfo("img","TEJAS","CRICKET"));
        listInfo.add(new ListInfo("img","TEJAS","CRICKET"));
        listInfo.add(new ListInfo("img","TEJAS","CRICKET"));
        listInfo.add(new ListInfo("img","TEJAS","CRICKET"));
        listInfo.add(new ListInfo("img","TEJAS","CRICKET"));
        listInfo.add(new ListInfo("img","TEJAS","CRICKET"));

        listInfoAdapter=new ListInfoAdapter(rootView.getContext(),listInfo);

        listView.setAdapter(listInfoAdapter);

        return rootView;
    }
}
