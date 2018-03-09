
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * Created by student on 3/9/18.
 */
public class P15 {
    public List<String> duplicate(List<String> income, int num) {
        List<String> newList = new ArrayList<>();
        int index = 0;
        Iterator<String> it = income.iterator();
        while(it.hasNext()) {
            String str = it.next();
            while(index < num) {
                newList.add(str);
                index++;
            };
            index = 0;
        };
        return newList;
    };
}
