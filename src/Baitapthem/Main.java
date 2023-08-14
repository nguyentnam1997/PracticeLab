package Baitapthem;

import Baitapthem.entities.BienLai;
import Baitapthem.entities.KhachHang;
import Baitapthem.service.BienLaiService;
import Baitapthem.service.KhachHangService;
import Baitapthem.service.MainService;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<BienLai> listBienLai = new ArrayList<>();
        ArrayList<KhachHang> listKhachHang = new ArrayList<>();
        BienLaiService bienLaiService = new BienLaiService();
        KhachHangService khachHangService = new KhachHangService();
        MainService mainService = new MainService();
        mainService.runMain(scanner, khachHangService, bienLaiService, listKhachHang, listBienLai);
    }
}
