package com.androbos.dosen;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.HashMap;

/**
 * Created by tommy on 7/15/15.
 */
public class CustomListViewAdapter extends BaseAdapter {
    private Context mContext;
    private ArrayList<HashMap<String, String>> dosen;
    private ArrayList<HashMap<String, Integer>> fotoDosen;
    private static LayoutInflater inflater = null;

    public CustomListViewAdapter(Context context, ArrayList<HashMap<String, String>> data, ArrayList<HashMap<String, Integer>> foto){
        mContext = context;
        dosen = data;
        fotoDosen = foto;
        inflater = (LayoutInflater)context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
    }



    @Override
    public int getCount() {
       return dosen.size();
    }

    @Override
    public Object getItem(int position) {
        return position;
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View view = convertView;
        if (convertView == null){
            view = inflater.inflate(R.layout.row,null);
            TextView namaDosen = (TextView)view.findViewById(R.id.aName);
            TextView nip = (TextView)view.findViewById(R.id.aNIP);
            ImageView foto = (ImageView)view.findViewById(R.id.aImage);
        //    ImageView call = (ImageView)view.findViewById(R.id.aCall);
          //  ImageView sms = (ImageView)view.findViewById(R.id.aSMS);
           // TextView pages = (TextView)view.findViewById(R.id.pages);
           // ImageView image = (ImageView)view.findViewById(R.id.image);

            HashMap<String, String> mDosen = new HashMap<>();
            mDosen = dosen.get(position);

            namaDosen.setText(mDosen.get("namaDosen"));
            nip.setText(mDosen.get("nip"));
            //call.setImageDrawable(mContext.getResources().getDrawable(R.drawable.ic_call_black_24dp));
           // sms.setImageDrawable(mContext.getResources().getDrawable(R.drawable.ic_textsms_black_24dp));
          //  pages.setText(mBook.get("pages"));
            // image.setImageDrawable(mContext.getResources().getDrawable(R.mipmap.ic_launcher));
            HashMap<String,Integer> mFotoDosen = new HashMap<>();
            mFotoDosen = fotoDosen.get(position);
            foto.setImageResource(mFotoDosen.get("foto"));
        }


        return view;
    }
}
