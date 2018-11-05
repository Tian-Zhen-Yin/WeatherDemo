package com.example.administrator.coolweather.gson;

import com.google.gson.annotations.SerializedName;
//当前的天气状况

public class Now {

    //当前温度
    @SerializedName("tmp")
    public String temperature;

    //天气状况
    @SerializedName("cond")
    public More more;

    public class More{

        @SerializedName("txt")
        public String info;
    }
}
