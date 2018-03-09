/**
 * Created by student on 3/7/18.
 */
public class Dog {
    private String sound;

    public Dog(String sound) {
        this.sound = sound;
    }

    public String getSound() {
        return this.sound;
    }

    public void setSound(String newSound) {
        this.sound = newSound;
    };

    public void makeSound() {
        System.out.println(this.sound);
    };
}
