package lab5.service;

import lab5.entities.Pet;
import lab5.entities.Type;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class PetService {
    public void match(ArrayList<Pet> pets, Scanner scanner) {
        System.out.println("Mời nhập thông tin pet: ");
        System.out.println("Nhập tên:");
        String name = scanner.nextLine();
        System.out.println("Nhập giống loài:");
        String species = scanner.nextLine();
        System.out.println("Nhập tuổi:");
        int age = Integer.parseInt(scanner.nextLine());
        System.out.println("Giới tính là gì?");
        boolean sex = scanner.nextBoolean();
        System.out.println("Nhập mô tả pet:");
        String description = scanner.nextLine();
        System.out.println("Pet của bạn là chó hay mèo? (1. Chó / 2. Mèo)");
        int type = Integer.parseInt(scanner.nextLine());

        Pet pet = new Pet("D1", "Bắc cực", 2, false, "des1", Type.DOG);
        do {
            Random random = new Random();
            int index = random.nextInt(pets.size());
            Pet petDisplay = pets.get(index);
            if (petDisplay.isSex() == pet.isSex() && petDisplay.getType() == pet.getType()) {
                System.out.println(petDisplay);
                break;
            }
        } while (true);

    }
}
