/**
 * Created by student on 3/7/18.
 */
public class Reptile extends AnimalLab {
    private String name;
    private String kind;
    private int length;
    private boolean poisonous;

    public Reptile(String name, String kind, int lengh) {
        super();
        this.length = lengh;
        this.poisonous = true;
        this.name = name;
        this.kind = kind;
    };

    public void setLength(int newLength) {
        this.length = length;
    };

    public int getLength() {
        return this.length;
    };

    public String getName() {
        return this.name;
    };

    public String getKind() {
        return this.kind;
    };


    public void changePoisonous() {
        this.poisonous = !this.poisonous;
    };
};
