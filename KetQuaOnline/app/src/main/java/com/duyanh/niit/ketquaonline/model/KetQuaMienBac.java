package com.duyanh.niit.ketquaonline.model;

import java.util.ArrayList;

/**
 * Created by Administrator on 03/08/2016.
 */
public class KetQuaMienBac {
    private String GiaiDacBiet;
    private String GiaiNhat;

    public KetQuaMienBac() {
    }

    private String GiaiNhi;
    private String GiaiBa;
    private String GiaiTu;
    private String GiaiNam;
    private String GiaiSau;
    private String GiaiBay;

    public KetQuaMienBac(String giaiDacBiet, String giaiNhat, String giaiNhi, String giaiBa, String giaiTu, String giaiNam, String giaiSau, String giaiBay) {
        GiaiDacBiet = giaiDacBiet;
        GiaiNhat = giaiNhat;
        GiaiNhi = giaiNhi;
        GiaiBa = giaiBa;
        GiaiTu = giaiTu;
        GiaiNam = giaiNam;
        GiaiSau = giaiSau;
        GiaiBay = giaiBay;
    }

    public String getGiaiDacBiet() {
        return GiaiDacBiet;
    }

    public void setGiaiDacBiet(String giaiDacBiet) {
        GiaiDacBiet = giaiDacBiet;
    }

    public String getGiaiNhat() {
        return GiaiNhat;
    }

    public void setGiaiNhat(String giaiNhat) {
        GiaiNhat = giaiNhat;
    }

    public String getGiaiNhi() {
        return GiaiNhi;
    }

    public void setGiaiNhi(String giaiNhi) {
        GiaiNhi = giaiNhi;
    }

    public String getGiaiBa() {
        return GiaiBa;
    }

    public void setGiaiBa(String giaiBa) {
        GiaiBa = giaiBa;
    }

    public String getGiaiTu() {
        return GiaiTu;
    }

    public void setGiaiTu(String giaiTu) {
        GiaiTu = giaiTu;
    }

    public String getGiaiNam() {
        return GiaiNam;
    }

    public void setGiaiNam(String giaiNam) {
        GiaiNam = giaiNam;
    }

    public String getGiaiSau() {
        return GiaiSau;
    }

    public void setGiaiSau(String giaiSau) {
        GiaiSau = giaiSau;
    }

    public String getGiaiBay() {
        return GiaiBay;
    }

    public void setGiaiBay(String giaiBay) {
        GiaiBay = giaiBay;
    }
}
