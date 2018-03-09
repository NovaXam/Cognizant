import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;


public class testP09 {
    @Test
    public void testPOFunc() throws Exception {
        PO9 instane = new PO9();
        List<List<String>> list = instane.pack(Arrays.asList("n", "a", "a", "b", "o", "d", "c", "c"));
        assertEquals(6, list.size());
    };
};
