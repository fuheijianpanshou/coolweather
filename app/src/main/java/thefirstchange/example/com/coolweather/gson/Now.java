package thefirstchange.example.com.coolweather.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by 11401 on 2018/3/24.
 */

public class Now {
    @SerializedName("tmp")
    public String temperature;
    @SerializedName("cond")
    public More more;
    public class More{
        @SerializedName("txt")
        public String info;
    }
}