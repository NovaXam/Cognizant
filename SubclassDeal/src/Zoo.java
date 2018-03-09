import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class Zoo {
    private static Zoo zoo = null;
    private ArrayList<AnimalLab> animals;

    private Zoo() {
        this.animals = new ArrayList<>();
    };

    public static Zoo getZoo() {
        if (zoo == null) {
            return new Zoo();
        }
        return zoo;
    };

    public ArrayList<AnimalLab> getAnimals(){
        return animals;
    };

    public void addNewAnimals(AnimalLab animal) {

        if (!this.animals.contains(animal)) {
            this.animals.add(animal);
        };
    };

    public void removeAnimal(AnimalLab animal) {
        this.animals.remove(animal);
    };

    public void showMamalInstance() {
        for (AnimalLab animal : this.getAnimals()) {
            if (animal instanceof Mammal) {
                System.out.println(animal.toString());
            };
        };
    };

    public void showReptileInstance() {
        for (AnimalLab animal : this.getAnimals()) {
            if (animal instanceof Reptile) {
                System.out.println(animal.toString());
            };
        };
    };
}