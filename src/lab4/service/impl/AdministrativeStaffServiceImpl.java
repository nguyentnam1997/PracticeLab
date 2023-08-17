package lab4.service.impl;

import lab4.entities.AdministrativeStaff;
import lab4.service.IOptionService;

import java.util.ArrayList;
import java.util.Scanner;

public class AdministrativeStaffServiceImpl implements IOptionService<AdministrativeStaff> {
    public double calculateSalary(AdministrativeStaff administrativeStaff) {
        return administrativeStaff.getBasicSalary();
    }
    @Override
    public void insert(Scanner scanner, AdministrativeStaff administrativeStaff, ArrayList<AdministrativeStaff> administrativeStaffs) {
        System.out.println("Input staff's name:");
        String name = scanner.nextLine();
        System.out.println("Input basic salary:");
        double basicSalary = Double.parseDouble(scanner.nextLine());
        administrativeStaffs.add(new AdministrativeStaff(name, basicSalary, calculateSalary(administrativeStaff)));
    }

    @Override
    public void update() {

    }

    @Override
    public void delete() {

    }
}
