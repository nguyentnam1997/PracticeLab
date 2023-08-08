package lab1.service;

import lab1.entities.Student;

import java.util.Scanner;

public class StudentService {
    public Student inputStudent(Scanner scanner) {
        System.out.println("Mời nhập tên sinh viên:");
        String name = scanner.nextLine();
        System.out.println("Mời nhập địa chỉ sinh viên:");
        String address = scanner.nextLine();
        return new Student(name, address);
    }

}
