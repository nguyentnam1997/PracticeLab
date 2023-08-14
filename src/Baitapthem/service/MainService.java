package Baitapthem.service;

import Baitapthem.entities.BienLai;
import Baitapthem.entities.KhachHang;

import java.util.ArrayList;
import java.util.Scanner;

public class MainService {
    public void runMain(Scanner scanner, KhachHangService khachHangService, BienLaiService bienLaiService, ArrayList<KhachHang> listKhachHang, ArrayList<BienLai> listBienLai) {
        System.out.println("Mời nhập số hộ dân:");
        int n = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < n; i++) {
            System.out.println("------ Chủ hộ " + (i + 1) + "------");
            KhachHang khachHang = khachHangService.createKhachHang(scanner);
            listBienLai.add(bienLaiService.createBienLai(scanner, khachHang, listKhachHang));
        }
        for (BienLai bienLai :listBienLai) {
            bienLaiService.showBienLai(bienLai, khachHangService);
        }
    }
}
