package Baitapthem.service;

import Baitapthem.entities.KhachHang;

import java.util.Scanner;

public class KhachHangService {
    public KhachHang createKhachHang(Scanner scanner) {
        System.out.println("Nhập tên chủ hộ:");
        String name = scanner.nextLine();
        System.out.println("Nhập số nhà:");
        String addressNumber = scanner.nextLine();
        do {
            try {
                System.out.println("Nhập mã số công tơ:");
                int meterNumber = Integer.parseInt(scanner.nextLine());
                if (meterNumber <= 0) {
                    System.out.println("Mã số không hợp lệ, mời nhập lại!");
                    continue;
                }
                return new KhachHang(name, addressNumber, meterNumber);
            }
            catch (Exception e) {
                System.out.println("Mã số không hợp lệ, mời nhập lại!");
            }
        }
        while (true);
    }

    public void showKhachHang(KhachHang khachHang) {
        System.out.println("-------- Thông tin của chủ hộ " + khachHang.getName() + " ---------");
        System.out.println("Số nhà: " + khachHang.getAddressNumber());
        System.out.println("Mã số công tơ: " + khachHang.getMeterNumberCode());
    }
}
