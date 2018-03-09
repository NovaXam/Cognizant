/**
 * Created by student on 3/7/18.
 */
public class Poodle extends Dog {
    public Poodle(String noise) {
        super(noise);
    };

    @Override
    public void makeSound() {
        System.out.println(this.getSound() + "bu-bu");
    };

    public void makeSound(double level) {
        System.out.println(this.getSound().length() + level);
    }
}
