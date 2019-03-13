package com.chen.test.adapter;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.chen.test.R;
import com.chen.test.bean.JavaBean;

import org.w3c.dom.Text;

import java.util.List;

public class RecAdapter extends RecyclerView.Adapter<RecAdapter.hodle> {

    List<JavaBean.sss> mlist;
    Context context;

    public RecAdapter(List<JavaBean.sss> list,Context context){
        this.mlist = list;
        this.context = context;

    }

    @Override
    public hodle onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {

        View view = View.inflate(context, R.layout.item_adapter,null);

        return new hodle(view);
    }

    @Override
    public void onBindViewHolder(@NonNull hodle hodle, int i) {
        Log.e("tag",mlist.size()+"");
        String name = mlist.get(i).news_summary;
        String pic = mlist.get(i).pic_url;
        hodle.text_id.setText(name);
        Glide.with(context).load(pic).into(hodle.image_id);
    }


    @Override
    public int getItemCount() {
        return mlist.size();
    }

    public class hodle extends RecyclerView.ViewHolder{

        private final ImageView image_id;
        private final TextView text_id;

        public hodle(@NonNull View itemView) {
            super(itemView);
            image_id = itemView.findViewById(R.id.Image_id);
            text_id = itemView.findViewById(R.id.text_id);
        }
    }

}
