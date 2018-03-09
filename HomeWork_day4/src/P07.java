import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * Created by student on 3/8/18.
 */
public class P07 {
    private List<String> myList = new ArrayList<>();

    public List<String> flattern(List<List<String>> list) {
        Iterator<List<String>> it = list.iterator();
        while (it.hasNext()) {
            List<String> value = it.next();
            flattenString(value);
        }
        ;
        return myList;
    };

    public void flattenString(List<String> list) {
        Iterator<String> iterator = list.iterator();
        while (iterator.hasNext()) {
            String str = iterator.next();
            myList.add(str);
        }
        ;
    };
}
