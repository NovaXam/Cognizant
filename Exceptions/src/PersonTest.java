import org.junit.Test;
import static org.junit.Assert.*;
import com.cognizant.Person;

/**
 * Created by student on 3/6/18.
 */
public class PersonTest {
    @Test
    public void testName() {
       Person person = new Person("Vlad", "Novakh", "son");
       String expectedN = "Vlad";
       String expectedSN = "Novakh";
       String actualName = person.firstName;
       String actualSecond = person.lastName;

       assertEquals(expectedN, actualName);
       assertEquals(expectedSN, actualSecond);
    };
};