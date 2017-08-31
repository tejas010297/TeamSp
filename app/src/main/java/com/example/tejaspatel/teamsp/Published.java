package com.example.tejaspatel.teamsp;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

/**
 * Created by Tejas Patel on 25-Jul-17.
 */

public class Published extends Fragment {

    public ListView publishView;
    ArrayList<PostInfo> posts;
    PostAdapter postAdapter;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.published, container, false);

        publishView=(ListView)rootView.findViewById(R.id.postView);

        posts = new ArrayList<PostInfo>();

        posts.add(new PostInfo("Volleyball","TEJAS "));
        posts.add(new PostInfo("Volleyball","TEJAS "));
        posts.add(new PostInfo("Volleyball","TEJAS "));
        posts.add(new PostInfo("Volleyball","TEJAS "));
        posts.add(new PostInfo("Volleyball","TEJAS "));
        posts.add(new PostInfo("Volleyball","TEJAS "));


        postAdapter=new PostAdapter(rootView.getContext(),posts);
        publishView.setAdapter(postAdapter);

        return rootView;
    }
}
