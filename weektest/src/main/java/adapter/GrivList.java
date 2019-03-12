package adapter;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.Toast;

import com.baway.weektest.R;
import com.nostra13.universalimageloader.core.DisplayImageOptions;
import com.nostra13.universalimageloader.core.ImageLoader;

import java.util.List;

import bean.Bean;

public class GrivList extends BaseAdapter {
    ImageLoader imageLoader;
    List<Bean.Date> dateList;
    Context context;
    public GrivList(Context context, List<Bean.Date> dateList){
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

        ImageView img = new ImageView(context);

        DisplayImageOptions options = new DisplayImageOptions.Builder()
                .showImageOnLoading(R.mipmap.ic_launcher)
                .build();

        Toast.makeText(context,dateList.size()+"",Toast.LENGTH_SHORT).show();

        //imageLoader.displayImage(dateList.get(i).url,img,options);

        return img;
    }
}
