package Baitapthem;

import Baitapthem.entities.HoDan;
import Baitapthem.service.HoDanService;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        HoDanService hoDanService = new HoDanService();
        ArrayList<HoDan> listHoDan = new ArrayList<>();
        System.out.println("Mời nhập số hộ dân:");
        int n = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < n; i++) {
            listHoDan.add(hoDanService.createHoDan(scanner));
        }

    }
}
