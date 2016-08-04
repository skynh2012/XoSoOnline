package com.duyanh.niit.ketquaonline.model;

import java.util.ArrayList;

/**
 * Created by Administrator on 03/08/2016.
 */
public class KetQuaTrungNam {
    private ArrayList<String> GiaiDacBiet;
    private ArrayList<String> GiaiNhat;
    private ArrayList<String> GiaiNhi;
    private ArrayList<String> GiaiBa;
    private ArrayList<String> GiaiTu;
    private ArrayList<String> GiaiNam;
    private ArrayList<String> GiaiSau;
    private ArrayList<String> GiaiBay;

    public KetQuaTrungNam(ArrayList<String> giaiDacBiet, ArrayList<String> giaiNhat, ArrayList<String> giaiNhi, ArrayList<String> giaiBa, ArrayList<String> giaiTu, ArrayList<String> giaiNam, ArrayList<String> giaiSau, ArrayList<String> giaiBay) {
        GiaiDacBiet = giaiDacBiet;
        GiaiNhat = giaiNhat;
        GiaiNhi = giaiNhi;
        GiaiBa = giaiBa;
        GiaiTu = giaiTu;
        GiaiNam = giaiNam;
        GiaiSau = giaiSau;
        GiaiBay = giaiBay;
    }

    public ArrayList<String> getGiaiDacBiet() {
        return GiaiDacBiet;
    }

    public void setGiaiDacBiet(ArrayList<String> giaiDacBiet) {
        GiaiDacBiet = giaiDacBiet;
    }

    public ArrayList<String> getGiaiNhat() {
        return GiaiNhat;
    }

    public void setGiaiNhat(ArrayList<String> giaiNhat) {
        GiaiNhat = giaiNhat;
    }

    public ArrayList<String> getGiaiNhi() {
        return GiaiNhi;
    }

    public void setGiaiNhi(ArrayList<String> giaiNhi) {
        GiaiNhi = giaiNhi;
    }

    public ArrayList<String> getGiaiBa() {
        return GiaiBa;
    }

    public void setGiaiBa(ArrayList<String> giaiBa) {
        GiaiBa = giaiBa;
    }

    public ArrayList<String> getGiaiTu() {
        return GiaiTu;
    }

    public void setGiaiTu(ArrayList<String> giaiTu) {
        GiaiTu = giaiTu;
    }

    public ArrayList<String> getGiaiNam() {
        return GiaiNam;
    }

    public void setGiaiNam(ArrayList<String> giaiNam) {
        GiaiNam = giaiNam;
    }

    public ArrayList<String> getGiaiSau() {
        return GiaiSau;
    }

    public void setGiaiSau(ArrayList<String> giaiSau) {
        GiaiSau = giaiSau;
    }

    public ArrayList<String> getGiaiBay() {
        return GiaiBay;
    }

    public void setGiaiBay(ArrayList<String> giaiBay) {
        GiaiBay = giaiBay;
    }
}
