package lab4.service.impl;

import lab4.entities.Manager;
import lab4.entities.MarketingStaff;
import lab4.service.IOptionService;

import java.util.ArrayList;
import java.util.Scanner;

public class ManagerServiceImpl implements IOptionService<Manager> {
    public double calculateSalary(MarketingStaff marketingStaff) {
        return marketingStaff.getBasicSalary() + marketingStaff.getSales() * (marketingStaff.getCommissionRate() / 100);
    }

    @Override
    public double calculateSalary(Manager manager) {
        return 0;
    }

    @Override
    public void insert(Scanner scanner, Manager manager, ArrayList<Manager> managers) {
        System.out.println("Input staff's name:");
        String name = scanner.nextLine();
        System.out.println("Input basic salary:");
        double basicSalary = Double.parseDouble(scanner.nextLine());
        System.out.println("Input sales:");
        Double sales = Double.parseDouble(scanner.nextLine());
        System.out.println("Input commission rate:");
        Double commissionRate = Double.parseDouble(scanner.nextLine());
        //managers.add(new Manager(name, basicSalary, sales, commissionRate, calculateSalary(marketingStaff)));
    }

    @Override
    public void update() {

    }

    @Override
    public void delete() {

    }
}
