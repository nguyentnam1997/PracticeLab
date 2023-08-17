package lab4.service;

import java.util.ArrayList;
import java.util.Scanner;

public interface IOptionService<T> {
    void insert(Scanner scanner, ArrayList<T> list);
    void update();
    void delete();
}
