import java.io.IOException;
import java.util.Scanner;

public class AnimalLab {

    public AnimalLab() {
    };

    public AnimalLab createAnimal(String name, String kind) {
        switch (kind.toLowerCase()) {
            case "mamal":
                return new MamalChild(name, kind, setNoise(), true);
            case "reptile":
                return new ReptileChild(name, kind, setLength(), setRegion());
            default:
                return null;
        }
    };

    public String setNoise() {
        System.out.println("Please provide a noize new mamal instance produces");
        Scanner scanner = new Scanner(System.in);
        String noize = scanner.nextLine();
        scanner.close();
        return noize;
    };

    public String setRegion() {
        System.out.println("Please provide a region where new reptile instance lives");
        Scanner scanner = new Scanner(System.in);
        String len1 = scanner.nextLine();
        System.out.println(len1);
        String region = len1;
        scanner.close();
        return region;
    };

    public int setLength() {
        System.out.println("Please provide a length of a new reptile instance");
        Scanner scanner = new Scanner(System.in);
        int len = scanner.nextInt();
        System.out.println(len);
        int length = len;
        scanner.close();
        return length;
    };
};