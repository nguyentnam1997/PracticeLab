package lab1;

import lab1.entities.Student;
import lab1.service.StudentService;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Student> students = new ArrayList<>();
        StudentService studentService = new StudentService();
        do {
            System.out.println("Số sinh viên muốn nhập:");
            int n = Integer.parseInt(scanner.nextLine());
            if (n < 0) {
                System.out.println("Không được phép âm, mời nhập lại!");
                continue;
            } else if (n == 0) {
                System.out.println("Không có sinh viên nào!");
                break;
            }
            for (int i = 0; i < n; i++) {
                students.add(studentService.inputStudent(scanner));
            }
            System.out.println("Bạn có muốn tiếp tục? (Y/N)");
            String answer = scanner.nextLine();
            if (answer.equalsIgnoreCase("y")) continue;
            System.out.println(students);
            break;
        }
        while (true);


    }
}