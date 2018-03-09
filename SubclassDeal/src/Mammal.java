/**
 * Created by student on 3/7/18.
 */
public class Mammal extends AnimalLab {
    private String noise;
    private String name;
    private String kind;

    public Mammal(String name, String kind, String noise) {
        super();
        this.noise = noise;
        this.name = name;
        this.kind = kind;
    }

    public String getNoise() {
        return this.noise;
    };

    public String getName() {
        return this.name;
    };

    public String getKind() {
        return this.kind;
    };

    public void setNoise(String newNoise) {
        this.noise = newNoise;
    };

    public void makeNoize() {
        System.out.println(this.getNoise());
    };
}
