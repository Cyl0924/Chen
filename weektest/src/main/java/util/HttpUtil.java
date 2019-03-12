package util;

import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;

public class HttpUtil {

    private static ByteArrayOutputStream bao;

    public static String getData(String path){

        //网络连接请求
        try {

            URL url = new URL(path);

            HttpURLConnection con = (HttpURLConnection) url.openConnection();

            //设置延迟 方法 获取请求码
            con.setConnectTimeout(5000);
            con.setRequestMethod("GET");

            int code = con.getResponseCode();

            //进行判断
            if(code == 200){

                InputStream stream = con.getInputStream();

                bao = new ByteArrayOutputStream();

                int len;

                byte[] arr = new byte[1024*10];

                while ((len = stream.read(arr)) != -1){
                    bao.write(arr,0,len);
                }

            }

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
        }

        return bao.toString();
    }

}
