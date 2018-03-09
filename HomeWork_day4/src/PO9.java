import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * Created by student on 3/8/18.
 */
public class PO9 {

    public List<List<String>> pack(List<String> list) {
        ArrayList<String> singleList = new ArrayList<>();
        List<List<String>> twoDimList = new ArrayList<>();

        Iterator it = list.iterator();
        while(it.hasNext()) {
            String elem = (String) it.next();
            if (singleList.isEmpty()) {
                singleList.add(elem);
            } else {
                if (!singleList.contains(elem)) {
                    twoDimList.add(singleList);
                    singleList = new ArrayList<>();
                    singleList.add(elem);
                } else {
                    singleList.add(elem);
                }
            }
            ;
        }
        twoDimList.add(singleList);
        System.out.println(twoDimList.toString());
        return twoDimList;
    };
}
