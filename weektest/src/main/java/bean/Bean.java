package bean;

import java.util.List;

public class Bean {

    public Boolean error;
    public List<Date> results;

    public class  Date{
        public String _id;
        public String createdAt;
        public String desc;
        public String publishedAt;
        public String source;
        public String type;
        public String url;
        public Boolean used;
        public String who;
    }

}
