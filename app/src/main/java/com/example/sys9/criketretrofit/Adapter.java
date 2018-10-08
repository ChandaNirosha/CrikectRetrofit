package com.example.sys9.criketretrofit;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.List;

public class Adapter extends BaseAdapter {
    Context context;
    List<Batsman> batsmanList;
    List<Bowlers>bowlersList;


    public Adapter(Context applicationContext, List<Batsman> batsman, List<Bowlers> bowlers) {
        this.context=applicationContext;
        this.batsmanList=batsman;
        this.bowlersList=bowlers;
    }

    @Override
    public int getCount() {
        return batsmanList.size();
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View view, ViewGroup viewGroup) {
        View cview = LayoutInflater.from(context).inflate(R.layout.list, viewGroup, false);
        TextView name = cview.findViewById(R.id.name);
        name.setText(batsmanList.get(position).getName());

        TextView name2 = cview.findViewById(R.id.average);
        name2.setText(batsmanList.get(position).getAverage());

        TextView name3 = cview.findViewById(R.id.age);
        name3.setText(batsmanList.get(position).getAge());

        TextView name4 = cview.findViewById(R.id.inns);
        name4.setText(batsmanList.get(position).getInns());

        TextView name5 = cview.findViewById(R.id.name1);
        name5.setText(bowlersList.get(position).getName());

        TextView name6 = cview.findViewById(R.id.average1);
        name6.setText(bowlersList.get(position).getAverage());

        TextView name7 = cview.findViewById(R.id.age1);
        name7.setText(bowlersList.get(position).getAge());

        TextView name8 = cview.findViewById(R.id.inns1);
        name8.setText(bowlersList.get(position).getInns());


        view = cview;


        return view;
    }
}




