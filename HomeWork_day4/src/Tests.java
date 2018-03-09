import org.junit.Test;
import static org.junit.Assert.*;

public class Tests {
    @Test
    public void testStudent() {
        Student student = new Student("Max");
        assertEquals("Max", student.name);
        assertEquals(student.toString(), "Student Max");
    };

    @Test
    public void testPerson() {
        Person person = new Person("Dave");
        assertEquals(person.toString(), "Person Dave");
        assertEquals("Dave", person.name);
    };

    @Test
    public void testEmployee() {
        Employee employee = new Employee("Greg");
        assertEquals("Greg", employee.name);
        assertEquals(employee.toString(), "Employee Greg");
    };

    @Test
    public void testFaculty() {
        Faculty faculty = new Faculty("Math");
        assertEquals("Math", faculty.name);
        assertEquals(faculty.toString(), "Faculty Math");
    };

    @Test
    public void testStaff() {
        Staff staff = new Staff("Boo");
        assertEquals(staff.toString(), "Staff Boo");
        assertEquals("Boo", staff.name);
    };
};
