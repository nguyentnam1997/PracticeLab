package lab3.view;

import lab3.entities.History;
import lab3.entities.Worker;

import java.util.ArrayList;
import java.util.Scanner;

public class Show {
    public void showMenu() {
        System.out.println("======= Worker Management =======");
        System.out.println("1. Add worker");
        System.out.println("2. Up salary");
        System.out.println("3. Down salary");
        System.out.println("4. Display Information salary");
        System.out.println("5. Exit");
    }

    public int selectMenu(Scanner scanner) {
        do {
            System.out.println("Please choose: ");
            try {
                return Integer.parseInt(scanner.nextLine());
            } catch (Exception e) {
                System.out.println("Try again!");
            }
        }
        while (true);

    }

    public String inputId(Scanner scanner) {
            System.out.println("Enter code:");
            return scanner.nextLine();
    }

    public String showInfoWorker(Worker worker) {
        return  worker.getId() +"    " + worker.getName() + "          " + worker.getAge() + "       " + worker.getSalary();
    }
    public void showInfoSalary(ArrayList<History> histories) {
        System.out.println("--------- Display Information Salary ----------");
        System.out.println("Code    Name          Age       Salary       Status         Date");
        for (History h: histories) {
            System.out.println(showInfoWorker(h.getWorker()) + "       "+ h.getStatus() +"         " + h.getUpdated());
        }
    }
}
