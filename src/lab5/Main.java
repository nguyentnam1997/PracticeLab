package lab5;

import lab5.entities.Pet;
import lab5.entities.Type;
import lab5.service.PetService;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Pet pet1 = new Pet("Dog1", "spe1", 2, true, "des1", Type.DOG);
        Pet pet2 = new Pet("Dog2", "spe1", 1, false, "des1", Type.DOG);
        Pet pet6 = new Pet("Dog3", "spe1", 3, true, "des1", Type.DOG);

        Pet pet3 = new Pet("Cat1", "spe1", 2, true, "des1", Type.CAT);
        Pet pet5 = new Pet("Cat5", "spe5", 5, true, "des1", Type.CAT);
        Pet pet4 = new Pet("Cat4", "spe2", 1, true, "des1", Type.CAT);

        ArrayList<Pet> pets = new ArrayList<>(Arrays.asList(pet1, pet2, pet3, pet4, pet5, pet6));
        PetService petService = new PetService();
        //petService.match(pets);
    }
}
