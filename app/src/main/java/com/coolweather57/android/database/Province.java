package com.coolweather57.android.database;

/**
 * Created by LiPeng0520 on 2018/3/7.
 */

public class Province {

    private int id;

    private String provinceName;

    private int provinceCode;

    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setProvinceName(String province) {
        this.provinceName = province;
    }

    public String getProvinceName() {
        return provinceName;
    }

    public void setProvinceCode(int provinceCode) {
        this.provinceCode = provinceCode;
    }

    public int getProvinceCode() {
        return provinceCode;
    }
}
