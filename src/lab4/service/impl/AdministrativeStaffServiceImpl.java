package lab4.service.impl;

import lab4.entities.AdministrativeStaff;
import lab4.service.IOptionService;

import java.util.ArrayList;
import java.util.Scanner;

public class AdministrativeStaffServiceImpl implements IOptionService<AdministrativeStaff> {
    @Override
    public void insert(Scanner scanner, ArrayList<AdministrativeStaff> administrativeStaffs) {
        System.out.println("Input staff's name:");
        String name = scanner.nextLine();
        System.out.println("Input basic salary:");
        Double salary = Double.parseDouble(scanner.nextLine());
        administrativeStaffs.add(new AdministrativeStaff(name, salary));
    }

    @Override
    public void update() {

    }

    @Override
    public void delete() {

    }
}
