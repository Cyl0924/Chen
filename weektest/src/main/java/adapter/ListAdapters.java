package adapter;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.baway.weektest.R;
import com.nostra13.universalimageloader.core.DisplayImageOptions;
import com.nostra13.universalimageloader.core.ImageLoader;

import java.util.List;

import bean.Bean;

public class ListAdapters extends BaseAdapter {

    List<Bean.Date> dateList;
    Context context;
    public ListAdapters(Context context, List<Bean.Date> dateList){
        this.context = context;
        this.dateList = dateList;
    }

    @Override
    public int getCount() {
        return dateList.size();
    }

    @Override
    public Object getItem(int i) {
        return null;
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {


        View views = View.inflate(context, R.layout.list_itms,null);
        ImageView lv_img = views.findViewById(R.id.lv_img);

        DisplayImageOptions options = new DisplayImageOptions.Builder()
                .showImageOnLoading(R.mipmap.ic_launcher)
                .build();
        ImageLoader.getInstance().displayImage(dateList.get(i).url,lv_img,options);

        return views;
    }
}
