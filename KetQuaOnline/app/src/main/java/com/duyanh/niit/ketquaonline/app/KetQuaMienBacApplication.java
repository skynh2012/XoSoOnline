package com.duyanh.niit.ketquaonline.app;

import android.app.Application;

import com.duyanh.niit.ketquaonline.network.KetQuaMienBacAPIService;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * Created by Administrator on 03/08/2016.
 */
public class KetQuaMienBacApplication extends Application {

    public static Retrofit zRetrofit;

    public static KetQuaMienBacAPIService ketQuaMienBacAPIService;

    public static final String BASE_API = "http://xoso888.vn/android_server";

    @Override
    public void onCreate() {
        super.onCreate();

        zRetrofit = new Retrofit.Builder()
                .baseUrl(BASE_API)
                .addConverterFactory(GsonConverterFactory.create())
                .build();
        ketQuaMienBacAPIService = zRetrofit.create(KetQuaMienBacAPIService.class);

    }
}
