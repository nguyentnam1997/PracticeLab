package Baitapthem.service;

import Baitapthem.entities.BienLai;
import Baitapthem.entities.KhachHang;

import java.util.ArrayList;
import java.util.Scanner;

public class BienLaiService {
    public BienLai createBienLai(Scanner scanner, KhachHang khachHang, ArrayList<KhachHang> listKhachHang) {
            System.out.println("Mời nhập thông tin biên lai của hộ " + khachHang.getName() + ":");
            do {
                try {
                    System.out.println("Chỉ số cũ:");
                    int oldMeterNumber = Integer.parseInt(scanner.nextLine());
                    if (oldMeterNumber < 0) {
                        System.out.println("Chỉ số không được < 0, mời nhập lại!");
                        continue;
                    }
                    do {
                        try {
                            System.out.println("Chỉ số mới:");
                            int newMeterNumber = Integer.parseInt(scanner.nextLine());
                            if (newMeterNumber < oldMeterNumber) {
                                System.out.println("Chỉ số mới phải lớn hơn hoặc bằng chỉ số cũ, mời nhập lại!");
                                continue;
                            }
                            return new BienLai(khachHang, oldMeterNumber, newMeterNumber);

                        }
                        catch (Exception e) {
                            System.out.println("Giá trị nhập vào không hợp lệ, mời nhập lại!");
                        }
                    }
                    while (true);
                }
                catch (Exception e) {
                    System.out.println("Giá trị nhập vào không hợp lệ, mời nhập lại!");
                }
            }
            while (true);
    }

    public void showBienLai(BienLai bienLai, KhachHangService khachHangService) {
        khachHangService.showKhachHang(bienLai.getKhachHang());
        System.out.println("Chỉ số cũ: " + bienLai.getOldMeterNumber());
        System.out.println("Chỉ số mới: " + bienLai.getNewMeterNumber());
        System.out.println("Tiền điện phải trả: " + bienLai.getCash());
    }

}
