package com.example.tejaspatel.teamsp;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.List;

/**
 * Created by Tejas Patel on 24-Jul-17.
 */

public class ListInfoAdapter extends ArrayAdapter<ListInfo> {
    public ListInfoAdapter(Context context,List<ListInfo> listInfoList){
        super(context,0,listInfoList);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        View view=convertView;

        if(view == null){
            view= LayoutInflater.from(getContext()).inflate(R.layout.layout_listview,parent,false);
        }

        ListInfo listInfo=getItem(position);

        TextView userName=(TextView)view.findViewById(R.id.txt_user);
        userName.setText(listInfo.getUserName());

        TextView gameName=(TextView)view.findViewById(R.id.txt_game);
        gameName.setText(listInfo.getGameName());

        return view;
    }
}
