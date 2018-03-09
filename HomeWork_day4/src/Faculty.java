/**
 * Created by student on 3/8/18.
 */
public class Faculty extends Employee {
    private String officeHours, rank;

    public Faculty(String name) {
        super(name);
    };

    @Override
    public String toString() {
        return this.getClass().getName().concat(" ").concat(super.name);
    }
}
