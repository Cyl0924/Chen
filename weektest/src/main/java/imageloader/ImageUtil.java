package imageloader;

import android.app.Application;

import com.nostra13.universalimageloader.core.ImageLoader;
import com.nostra13.universalimageloader.core.ImageLoaderConfiguration;

public class ImageUtil extends Application {
    @Override
    public void onCreate() {
        super.onCreate();


        ImageLoaderConfiguration configuration = new ImageLoaderConfiguration.Builder(ImageUtil.this)
                .threadPoolSize(6)
                .build();

        ImageLoader.getInstance().init(configuration);

    }
}
