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
        int count = 0;
        do {
            show.showMenu();
            int choose = show.selectMenu(scanner);
            switch (choose) {
                case 1 -> {
                    Worker worker = workerService.createWorker(scanner);
                    workers.add(worker);
                }
                case 2 -> {
                    System.out.println("------- Up Salary -------");
                    checkId = show.inputId(scanner);
                    count = 0;
                    for (Worker w : workers) {
                        if (w.getId().contains(checkId)) {
                            workerService.upSalary(scanner, w);
                            histories.add(new History(w, "UP"));
                            count++;
                            break;
                        }
                    }
                    show.checkIdCode(count);
                }
                case 3 -> {
                    System.out.println("------- Down Salary -------");
                    checkId = show.inputId(scanner);
                    count = 0;
                    for (Worker w : workers) {
                        if (w.getId().contains(checkId)) {
                            workerService.downSalary(scanner, w);
                            histories.add(new History(w, "DOWN"));
                            count++;
                            break;
                        }
                    }
                    show.checkIdCode(count);
                }
                case 4 -> {
                    show.showInfoSalary(histories);
                }
                case 5 -> {
                    show.Exit();
                }
            }
            String question = show.continueOrEnd(scanner);
            if (question.equalsIgnoreCase("y")) continue;
            else {
                show.Exit();
            }
        }
        while (true);
    }
}
