package com.example.administrator.coolweather.db;

import org.litepal.crud.DataSupport;

public class City extends DataSupport {
    int id;
    String cityName;
    int cityCode;
    int provinceId;

    public int getId()
    {
        return id;
    }
    public void setId(int id)
    {
        this.id=id;
    }
    public String getCityName()
    {
        return cityName;
    }
    public void setCityName(String cityName)
    {
        this.cityName=cityName;
    }
    public int getCityCode()
    {
        return cityCode;
    }
    public void setCityCode(int cityCode)
    {
        this.cityCode=cityCode;
    }
    public int getProvinceId()
    {
        return provinceId;
    }
    public void setProvinceId(int provinceId)
    {
        this.provinceId=provinceId;
    }

}
