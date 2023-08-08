package lab3.service;

import lab3.entities.Worker;

import java.util.ArrayList;
import java.util.Scanner;

public class WorkerService {
    public Worker createWorker(Scanner scanner) {
        System.out.println("------- Add Worker ---------");
        System.out.println("Enter Name:");
        String name = scanner.nextLine();
        System.out.println("Enter Age:");
        int age = Integer.parseInt(scanner.nextLine());
        System.out.println("Enter Salary:");
        double salary = Double.parseDouble(scanner.nextLine());
        System.out.println("Enter Work location:");
        String workPlace = scanner.nextLine();
        return new Worker(name, age, salary, workPlace);
    }

    public void upSalary(Scanner scanner, ArrayList<Worker> workers) {
        System.out.println("------- Up Salary -------");
        System.out.println("Enter code:");
        String checkId = scanner.nextLine();
        for (Worker worker:workers) {
            if (worker.getId().contains(checkId)) {
                System.out.println("Enter salary want to change:");
                double changeSalary = Double.parseDouble(scanner.nextLine());
                worker.setSalary(worker.getSalary() + changeSalary);
            }
        }
    }

    public void changeSalary(Scanner scanner, ArrayList<Worker> workers) {
        System.out.println("------- Up/Down Salary -------");
        System.out.println("Enter code:");
        String checkId = scanner.nextLine();
        for (Worker worker:workers) {
            if (worker.getId().contains(checkId)) {
                System.out.println("Enter salary want to change:");
                double changeSalary = Double.parseDouble(scanner.nextLine());
                worker.setSalary(worker.getSalary() + changeSalary);
            }
        }
    }
}
