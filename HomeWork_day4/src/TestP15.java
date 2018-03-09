import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

/**
 * Created by student on 3/9/18.
 */
public class TestP15 {
    @Test
    public void testP15() throws Exception {
        List<String> list1;
        List<String> list = new ArrayList<>();
        P15 instance = new P15();
        list.add("a");
        list.add("h");
        list.add("hjhj");
        list1 = instance.duplicate(list, 5);
        System.out.println(list1);
        assertEquals(list1.size(), (list.size() * 5));
    };
};
