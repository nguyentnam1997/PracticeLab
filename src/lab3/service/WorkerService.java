package lab3.service;

import lab3.entities.History;
import lab3.entities.Worker;

import java.util.ArrayList;
import java.util.Scanner;

public class WorkerService {
    //Tạo Worker
    public Worker createWorker(Scanner scanner) {
        System.out.println("------- Add Worker ---------");
        System.out.println("Enter Name:");
        String name = scanner.nextLine();
        do {
            System.out.println("Enter Age:");
            try {
                int age = Integer.parseInt(scanner.nextLine());
                if (age < 18) {
                    System.out.println("Invalid value, please try again!");
                    continue;
                }
                do {
                    System.out.println("Enter Salary:");
                    try {
                        double salary = Double.parseDouble(scanner.nextLine());
                        if (salary <= 0) {
                            System.out.println("Invalid value, please try again!");
                            continue;
                        }
                        System.out.println("Enter Work location:");
                        String workPlace = scanner.nextLine();
                        return new Worker(name, age, salary, workPlace);
                    }
                     catch (Exception e) {
                         System.out.println("Wrong value inputted, please try again!");
                     }
                }
                while (true);
            }
            catch (Exception e) {
                System.out.println("Wrong value inputted, please try again!");
            }
        }
        while (true);

    }
    //Tăng lương Worker
    public double upSalary(Scanner scanner, Worker worker) {
        do {
            System.out.println("Enter salary want to increase:");;
            try {
                double changeSalary = Double.parseDouble(scanner.nextLine());
                if (changeSalary < 0) {
                    System.out.println("Value cannot be negative, please try again!");
                    continue;
                }
                else {
                    worker.setSalary(worker.getSalary() + changeSalary);
                    return worker.getSalary();
                }
                //break;
            } catch (Exception e) {
                System.out.println("Wrong value inputted, please try again!");
            }
        }
        while (true);
    }
    public double downSalary(Scanner scanner, Worker worker) {
        do {
            System.out.println("Enter salary want to decrease:");;
            try {
                double changeSalary = Double.parseDouble(scanner.nextLine());
                if (changeSalary < 0) {
                    System.out.println("Value cannot be negative, please try again!");
                    continue;
                }
                else if (changeSalary > worker.getSalary()) {
                    System.out.println("The value must not be greater than the current salary, plese try again!");
                    continue;
                }
                else {
                    worker.setSalary(worker.getSalary() - changeSalary);
                    return worker.getSalary();
                }
            } catch (Exception e) {
                System.out.println("Wrong value inputted, please try again!");
            }
        }
        while (true);
    }
//    public History upSalary(Scanner scanner, Worker worker, ArrayList<Worker> workers, ArrayList<Worker> history) {
//        System.out.println("------- Up Salary -------");
//        for (Worker w:workers) {
//            System.out.println("Enter code:");
//            String checkId = scanner.nextLine();
//            if (w.getId().contains(checkId)) {
//                do {
//                    System.out.println("Enter salary want to change:");
//                    double changeSalary = Double.parseDouble(scanner.nextLine());
//                    if (changeSalary < 0) {
//                        System.out.println("Value cannot be negative, please try again!");
//                        continue;
//                    }
//                    try {
//                        w.setSalary(w.getSalary() + changeSalary);
//                        history.add(w);
//                        worker = w;
//                    } catch (Exception e) {
//                        System.out.println("Wrong value inputed, please try again!");
//                    }
//                    break;
//                }
//                while (true);
//                break;
//            }
//            else {
//                System.out.println("Invalid ID, please try again!");
//            }
//        }
//        return new History(worker, "UP");
//    }

    //Giảm lương Worker

//    public void downSalary(Scanner scanner, Worker worker, ArrayList<Worker> workers, ArrayList<Worker> history) {
//        System.out.println("------- Down Salary -------");
//        System.out.println("Enter code:");
//        String checkId = scanner.nextLine();
//        for (Worker w:workers) {
//            if (w.getId().contains(checkId)) {
//                do {
//                    System.out.println("Enter salary want to change:");
//                    double changeSalary = Double.parseDouble(scanner.nextLine());
//                    if (changeSalary < 0) {
//                        System.out.println("Value cannot be negative, please try again!");
//                        continue;
//                    }
//                    try {
//                        w.setSalary(w.getSalary() - changeSalary);
//                        history.add(w);
//                        worker = w;
//                    } catch (Exception e) {
//                        System.out.println("Wrong value inputed, please try again!");
//                    }
//                    break;
//                }
//                while (true);
//            }
//        }
//    }



}
