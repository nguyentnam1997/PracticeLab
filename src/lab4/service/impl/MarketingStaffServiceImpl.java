package lab4.service.impl;

import lab4.entities.MarketingStaff;
import lab4.service.IOptionService;

import java.util.ArrayList;
import java.util.Scanner;

public class MarketingStaffServiceImpl implements IOptionService<MarketingStaff> {
    @Override
    public void insert(Scanner scanner, ArrayList<MarketingStaff> list) {
        System.out.println("Input staff's name:");
        String name = scanner.nextLine();
        System.out.println("Input basic salary:");
        Double salary = Double.parseDouble(scanner.nextLine());
        System.out.println("Input sales:");
        Double sales = Double.parseDouble(scanner.nextLine());
        System.out.println("Input commission rate:");
        Double commissionRate = Double.parseDouble(scanner.nextLine());
    }

    @Override
    public void update() {

    }

    @Override
    public void delete() {

    }
}
