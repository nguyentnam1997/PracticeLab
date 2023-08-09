package lab3;

import lab3.entities.History;
import lab3.entities.Worker;
import lab3.service.WorkerService;
import lab3.view.Show;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Worker> workers = new ArrayList<>();
        ArrayList<History> histories = new ArrayList<>();
        WorkerService workerService = new WorkerService();
        Show show = new Show();
        String checkId;
        do {
            show.showMenu();
            int choose = show.selectMenu(scanner);
            switch (choose) {
                case 1:
                    Worker worker = workerService.createWorker(scanner);
                    workers.add(worker);
                    break;
                case 2:
                    System.out.println("------- Up Salary -------");
                    for (Worker w : workers) {
                        checkId = show.inputId(scanner);
                        if (w.getId().contains(checkId)) {
                            workerService.upSalary(scanner, w);
                            histories.add(new History(w, "UP"));
                            break;
                        } else System.out.println("Invalid code, try again!");

                    }
                    break;
                case 3:
                    System.out.println("------- Down Salary -------");
                    checkId = show.inputId(scanner);
                    for (Worker w : workers) {
                        if (w.getId().contains(checkId)) {
                            workerService.downSalary(scanner, w);
                            histories.add(new History(w, "DOWN"));
                            break;
                        } else System.out.println("Invalid code, try again!");
                    }
                    break;
                case 4:
                    show.showInfoSalary(histories);
                    break;
            }
            System.out.println("Do you want to continue? (Y/N)?");
            String question = scanner.nextLine();
            if (question.equalsIgnoreCase("y")) continue;
            else break;
        }
        while (true);


    }
}
