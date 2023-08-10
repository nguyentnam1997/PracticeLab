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
        show.runProgram(scanner, workerService, workers, histories);
    }
}
