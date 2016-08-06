package com.duyanh.niit.ketquaonline.network;

import com.google.gson.JsonElement;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.Query;

/**
 * Created by Administrator on 06/08/2016.
 */
public interface KetQuaMienBacAPIService {

    @GET("/get_xsmb_details.php")
    Call<JsonElement> getXSMBElement();

    @POST("/get_xsmb_details.php")
    Call<JsonElement> getXSMN(@Query("tinh") String tinh, @Query("ngay") String ngay);
}
