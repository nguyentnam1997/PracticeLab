package lab3;

import lab3.entities.Worker;
import lab3.service.WorkerService;
import lab3.view.Show;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Worker> workers = new ArrayList<>();
        WorkerService workerService = new WorkerService();
        Show show = new Show();
        show.showMenu();
        int choose = show.selectMenu(scanner);
        switch (choose) {
            case 1:
                Worker worker = workerService.createWorker(scanner);
                workers.add(worker);
                break;
            case 2:
            case 3:
            case 4:
        }

    }
}
