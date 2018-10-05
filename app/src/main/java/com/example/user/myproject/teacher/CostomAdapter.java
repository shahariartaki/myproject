package com.example.user.myproject.teacher;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.user.myproject.R;

public class CostomAdapter extends ArrayAdapter <String> {//This java file for Teacher Listview.
    private final Context context;
    private final String[] techerName;
    private final String [] techerposition;
    private final String [] techeredu;
    private final Integer [] logo;

    public CostomAdapter(Context context,String[] techerName,String[]techerposition,String[]techeredu,Integer[] logo ){

        super(context, R.layout.facaltymember,techerName);
        this.context=context;
        this.techerName=techerName;
        this.techerposition=techerposition;
        this.techeredu=techeredu;
        this.logo=logo;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        LayoutInflater inflater=(LayoutInflater)getContext().getSystemService(context.LAYOUT_INFLATER_SERVICE);
        View cusView =inflater.inflate(R.layout.facaltymember,null,true);
        TextView textView=(TextView)cusView.findViewById(R.id.tvfn);
        TextView textView1=(TextView)cusView.findViewById(R.id.tvfp);
        TextView textView2=(TextView)cusView.findViewById(R.id.tvfe);
        ImageView imageView=(ImageView)cusView.findViewById(R.id.imageView2);

        textView.setText(techerName[position]);
        textView1.setText(techerposition[position]);
        textView2.setText(techeredu[position]);
        imageView.setImageResource(logo[position]);

        return cusView;
    }
}
