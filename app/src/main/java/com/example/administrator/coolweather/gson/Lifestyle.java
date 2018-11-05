package com.example.administrator.coolweather.gson;

import com.google.gson.annotations.SerializedName;

public class Lifestyle {

    //舒适指数
    @SerializedName("comf")
    public Comfort comfort;

    //洗车指数
    @SerializedName("cw")
    public CarWash carWash;

    //运动指数
    @SerializedName("sport")
    public  Sport sport;

    public class Comfort{

        @SerializedName("txt")
        public String info;
    }

    public class CarWash{

        @SerializedName("txt")
        public String info;
    }

    public class Sport{

        @SerializedName("txt")
        public String info;
    }
}
