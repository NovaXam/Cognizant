/**
 * Created by student on 3/8/18.
 */
public class Staff extends Employee {
    private String title;

    public Staff(String name) {
        super(name);
    };

    public String toString() {
        return this.getClass().getName().concat(" ").concat(super.name);
    };
}
