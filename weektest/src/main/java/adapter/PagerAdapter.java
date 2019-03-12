package adapter;

import android.content.Context;
import android.support.annotation.NonNull;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.baway.weektest.R;
import com.nostra13.universalimageloader.core.DisplayImageOptions;
import com.nostra13.universalimageloader.core.ImageLoader;

import java.util.List;

import bean.Bean;

public class PagerAdapter extends android.support.v4.view.PagerAdapter {

    List<Bean.Date> dateList;
    Context context;
    public PagerAdapter(Context context, List<Bean.Date> dateList){
        this.context = context;
        this.dateList = dateList;
    }

    @NonNull
    @Override
    public Object instantiateItem(@NonNull ViewGroup container, int position) {

        View view = View.inflate(context, R.layout.view_item,null);
        ImageView viewById = view.findViewById(R.id.im);

        DisplayImageOptions options = new DisplayImageOptions.Builder().build();

        ImageLoader.getInstance().displayImage(dateList.get(position%dateList.size()).url,viewById,options);

        container.addView(view);

        return view;
    }

    @Override
    public void destroyItem(@NonNull ViewGroup container, int position, @NonNull Object object) {
        container.removeView((View)object);
    }

    @Override
    public int getCount() {
        return Integer.MAX_VALUE;
    }

    @Override
    public boolean isViewFromObject(@NonNull View view, @NonNull Object o) {
        return view == o;
    }
}
