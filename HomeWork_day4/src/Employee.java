/**
 * Created by student on 3/8/18.
 */
public class Employee extends Person {
    private String office, salary;
    Date date_hired;

    public Employee(String name) {
        super(name);
    };

    @Override
    public String toString() {
        return this.getClass().getName().concat(" ").concat(super.name);
    };
}
