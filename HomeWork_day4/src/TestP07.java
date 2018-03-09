import org.junit.Test;

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
        List<List<String>> listOfAs = asList("a", asList("b", "m", asList("c", "o"), asList("d", "e", asList("f", "g"), "a")), "h");
        List<String> killo = instance.flattern(listOfAs);
        assertEquals(6, killo.size());
    }
}
