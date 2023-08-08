package lab2;

import lab2.entities.Student;
import lab2.service.StudentService;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Student> students = new ArrayList<>();
        StudentService studentService = new StudentService();

        System.out.println("Nhập số lượng student:");
        int n = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < n; i++) {
            students.add(studentService.createStudent(scanner));
        }
        System.out.println(students);

        //Tính điểm TB
        for (Student s:students ) {
            System.out.println(s.classify());
            System.out.println(s.toString(studentService));
        }

        //Tính % xếp hạng
        studentService.percentScore(students);

    }
}
