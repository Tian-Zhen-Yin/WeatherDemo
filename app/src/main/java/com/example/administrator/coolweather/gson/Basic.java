package com.example.administrator.coolweather.gson;

import com.google.gson.annotations.SerializedName;

public class Basic {
    /**
     * 使用@SerializedName注解的方式让JSON字段和Java字段建立映射关系
     */
    @SerializedName("location")
    public String cityName;

    @SerializedName("cid")
    public String weatherId;

    public Update update;

    public class Update
    {
        @SerializedName("loc")
        public String updateTime;
    }
}
