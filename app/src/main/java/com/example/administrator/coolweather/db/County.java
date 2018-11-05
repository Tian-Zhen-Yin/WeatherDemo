package com.example.administrator.coolweather.db;

import org.litepal.crud.DataSupport;

public class County extends DataSupport{
    int id;
    private String countyName;//县名
    private String weatherId;
    private int cityId;

    public int getId()
    {
        return id;
    }
    public void setId(int id)
    {
        this.id=id;
    }
    public String getCountyName()
    {
        return countyName;
    }
    public void setCountyName(String countyName)
    {
       this.countyName=countyName;
    }
    public String getweatherId()
    {
        return weatherId;
    }
    public void setWeatherId(String weatherId)
    {
        this.weatherId=weatherId;
    }
    public int getCityId()
    {
        return cityId;
    }
    public void setCityIdId(int cityId)
    {
        this.cityId=cityId;
    }


}
