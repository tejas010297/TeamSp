package com.example.tejaspatel.teamsp;

import android.content.Context;
import android.support.annotation.LayoutRes;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.List;

/**
 * Created by Tejas Patel on 26-Jul-17.
 */

public class PostAdapter extends ArrayAdapter<PostInfo> {

    public PostAdapter( Context context, List<PostInfo> list) {
        super(context, 0,list);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

        View view=convertView;
        if(view == null){
            view= LayoutInflater.from(getContext()).inflate(R.layout.view_layout,parent,false);
        }

        PostInfo postInfo=getItem(position);


        TextView add=(TextView)view.findViewById(R.id.txt_user);
        add.setText(postInfo.uname);



        return view;
    }
}
