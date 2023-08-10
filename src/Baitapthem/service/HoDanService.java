package Baitapthem.service;

import Baitapthem.entities.HoDan;

import java.sql.SQLOutput;
import java.util.Scanner;

public class HoDanService {
    public HoDan createHoDan(Scanner scanner) {
        System.out.println("Nhập tên chủ hộ:");
        String name = scanner.nextLine();
        System.out.println("Nhập số nhà:");
        int addressNumber = Integer.parseInt(scanner.nextLine());
        System.out.println("Nhập mã số công tơ:");
        int meterNumber = Integer.parseInt(scanner.nextLine());
        return new HoDan(name, addressNumber, meterNumber);
    }
}
