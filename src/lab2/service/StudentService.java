package lab2.service;

import lab2.entities.Student;

import java.util.ArrayList;
import java.util.Scanner;

public class StudentService {
    public Student createStudent(Scanner scanner) {
        System.out.println("Nhập tên sinh viên:");
        String name = scanner.nextLine();
        do {
            System.out.println("Nhập điểm Toán:");
            double scoreMath = Double.parseDouble(scanner.nextLine());
            if (scoreMath < 0 || scoreMath > 10) {
                System.out.println("Điểm không hợp lệ, mời nhập lại");
                continue;
            }
            do {
                System.out.println("Nhập điểm Lý:");
                double scorePhysic = Double.parseDouble(scanner.nextLine());
                if (scorePhysic < 0 || scorePhysic > 10) {
                    System.out.println("Điểm không hợp lệ, mời nhập lại");
                    continue;
                }
                do {
                    System.out.println("Nhập điểm Hoá:");
                    double scoreChemistry = Double.parseDouble(scanner.nextLine());
                    if (scoreChemistry < 0 || scoreChemistry > 10) {
                        System.out.println("Điểm không hợp lệ, mời nhập lại");
                        continue;
                    }
                    return new Student(name, scoreMath, scorePhysic, scoreChemistry);
                }
                while (true);
            }
            while (true);
        }
        while (true);
    }

    public void percentScore(ArrayList<Student> students) {
        int countA = 0, countB = 0, countC = 0;
        for (Student s:students ) {
            if (s.classify().equalsIgnoreCase("A")) countA++;
            else if (s.classify().equalsIgnoreCase("B")) countB++;
            else countC++;
        }
        System.out.println("A: " + (countA*100/students.size()));
        System.out.println("B: " + (countB*100/students.size()));
        System.out.println("C: " + (countC*100/students.size()));
    }

}
