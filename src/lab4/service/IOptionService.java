package lab4.service;

import java.util.ArrayList;
import java.util.Scanner;

public interface IOptionService<T> {
    double calculateSalary(T t);
    void insert(Scanner scanner, T t, ArrayList<T> list);
    void update();
    void delete();
}
