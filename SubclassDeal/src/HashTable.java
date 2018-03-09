import java.util.LinkedList;

/**
 * Created by student on 3/8/18.
 */
public class HashTable {
    public LinkedList [] data;

    public boolean put(MamalChild obj) {
        int hashCode = hashCodeGen(obj.getName());
        int index = converter(hashCode);
        LinkedList list = data[index];
        list.add(obj);
        return true;
    };

    public int hashCodeGen(String str) {
        return 0;
    };

    public int converter(int data) {
      return 1;
    };

}
