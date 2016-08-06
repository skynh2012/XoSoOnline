package com.duyanh.niit.ketquaonline.network;

import com.duyanh.niit.ketquaonline.app.KetQuaMienBacApplication;
import com.duyanh.niit.ketquaonline.model.KetQuaMienBac;
import com.duyanh.niit.ketquaonline.util.LogUtil;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;

import java.util.ArrayList;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

/**
 * Created by Administrator on 06/08/2016.
 */
public class KetQuaMienBacAPIs {
    public static ArrayList<KetQuaMienBac> getXSMB() {
        final ArrayList<KetQuaMienBac> ketQuaMienBacs = new ArrayList<>();

        Call<JsonElement> call = KetQuaMienBacApplication.ketQuaMienBacAPIService.getXSMBElement();

        call.enqueue(new Callback<JsonElement>() {
            @Override
            public void onResponse(Call<JsonElement> call, Response<JsonElement> response) {
                JsonElement jsonElement = response.body();

                JsonObject jsonObject = jsonElement.getAsJsonObject();

                JsonArray jsonArray = jsonObject.getAsJsonArray("xoso");

                if (jsonArray != null) {
                    JsonObject object = jsonArray.getAsJsonObject();

                    KetQuaMienBac ketQuaMienBac = new KetQuaMienBac();

                    ketQuaMienBac.setGiaiDacBiet(object.get("g0").getAsString());
                    ketQuaMienBac.setGiaiNhat(object.get("g1").getAsString());
                    ketQuaMienBac.setGiaiNhi(object.get("g2").getAsString());
                    ketQuaMienBac.setGiaiBa(object.get("g3").getAsString());
                    ketQuaMienBac.setGiaiTu(object.get("g4").getAsString());
                    ketQuaMienBac.setGiaiNam(object.get("g5").getAsString());
                    ketQuaMienBac.setGiaiSau(object.get("g6").getAsString());
                    ketQuaMienBac.setGiaiBay(object.get("g7").getAsString());

                    ketQuaMienBacs.add(ketQuaMienBac);
                }
            }

            @Override
            public void onFailure(Call<JsonElement> call, Throwable t) {
                LogUtil.logE("error", "Lỗi get");
            }
        });
        return ketQuaMienBacs;
    }
}
