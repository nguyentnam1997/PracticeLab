package lab3.view;

import lab3.entities.Worker;

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
}
