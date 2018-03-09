import org.junit.Test;

import java.util.ArrayList;
import java.util.List;
import static java.util.Arrays.asList;
import static org.junit.Assert.*;

/**
 * Created by student on 3/8/18.
 */
public class TestP07 {
    @Test
    public void testP07() {
        P07 instance = new P07();
        List<String> list1 = new ArrayList<>();
        list1.add("Dude");
        list1.add("Order");
        list1.add("Never");

        List<String> list2 = new ArrayList<>();
        list2.add("D");
        list2.add("O");




        List<List<String>> listOfAs = new ArrayList<>();
        listOfAs.add(list1);
        listOfAs.add(list2);

        List<String> killo = instance.flattern(listOfAs);
        assertEquals(5, killo.size());
    }
}
