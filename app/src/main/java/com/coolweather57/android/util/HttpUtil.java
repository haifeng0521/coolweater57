package com.coolweather57.android.util;

import okhttp3.OkHttpClient;
import okhttp3.Request;

/**
 * Created by LiPeng0520 on 2018/3/7.
 */

public class HttpUtil {

    public static void sendOkhttpRequest(String address, okhttp3.Callback callback) {
        OkHttpClient httpClient = new OkHttpClient();
        Request request = new Request.Builder().url(address).build();
        httpClient.newCall(request).enqueue(callback);
    }
}
