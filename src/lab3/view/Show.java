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
                int choose = Integer.parseInt(scanner.nextLine());
                if (choose < 0 || choose > 5) {
                    System.out.println("Invalid value");
                    continue;
                }
                else return choose;
            } catch (Exception e) {
                System.out.println("Exception!!!! Try again!");
                continue;
            }
        }
        while (true);

    }

    public String inputId(Scanner scanner) {
            System.out.println("Enter code:");
            return scanner.nextLine();
    }

    public String showInfoWorker(Worker worker) {
        return  worker.getId() + "    " +
                worker.getName() + "          " +
                worker.getAge() + "       " +
                worker.getSalary();
    }
    public void showInfoSalary(ArrayList<History> histories) {
        System.out.println("--------- Display Information Salary ----------");
        System.out.println("Code    Name          Age       Salary       Status         Date");
        for (History his: histories) {
            System.out.println(showInfoWorker(his.getWorker()) + "       " +
                    his.getStatus() +"         " + his.getUpdated());
        }
    }
     public void checkIdCode(int count) {
         if (count == 0) {
             System.out.println("Code does not exist");
         }
     }
    public String continueOrEnd(Scanner scanner) {
        System.out.println("Do you want to continue? (Y/N)?");
        return scanner.nextLine();
    }
    public void Exit() {
        System.out.println("Goodbye!!!");
        System.exit(0);
    }
}
