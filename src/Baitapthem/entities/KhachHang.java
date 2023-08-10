package Baitapthem.entities;

import java.util.ArrayList;

public class KhachHang {
    private ArrayList<HoDan> listHoDan;
    private ArrayList<BienLai> listBienLai;


    public KhachHang(ArrayList<HoDan> listHoDan, ArrayList<BienLai> listBienLai) {
        this.listHoDan = listHoDan;
        this.listBienLai = listBienLai;
    }

    public ArrayList<HoDan> getListHoDan() {
        return listHoDan;
    }

    public void setListHoDan(ArrayList<HoDan> listHoDan) {
        this.listHoDan = listHoDan;
    }

    public ArrayList<BienLai> getListBienLai() {
        return listBienLai;
    }

    public void setListBienLai(ArrayList<BienLai> listBienLai) {
        this.listBienLai = listBienLai;
    }
}
