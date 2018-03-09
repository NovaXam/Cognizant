/**
 * Created by student on 3/7/18.
 */
public class MamalChild extends Mammal {
    private boolean ableToSwim;
    private String newNoize;

    public MamalChild(String name, String kind, String noise, boolean swimmer) {
        super(name, kind, noise);
        this.ableToSwim = swimmer;
        this.newNoize = noise;
    }

    public void setAbleToSwim(boolean value) {
        this.ableToSwim = value;
    }

    public boolean getSpecialAbility() {
        return this.ableToSwim;
    };

    @Override
    public void makeNoize() {
        System.out.println(this.getNoise() + "... " + this.newNoize);
    };

    @Override
    public String toString() {
        return ("kind: ".concat(this.getKind()) + " " + "name: ".concat(this.getName()) + " " + "able to swim: " + this.getSpecialAbility() + " " + "make noise: ".concat(this.getNoise()));
    };
}
