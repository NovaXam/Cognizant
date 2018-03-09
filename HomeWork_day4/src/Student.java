import com.sun.xml.internal.ws.api.message.Packet;

/**
 * Created by student on 3/8/18.
 */
public class Student extends Person {
    public static Packet.Status FRESHMAN, SOPHOMORE, JUNIOR;
    public Student(String name) {
        super(name);
    };

    @Override
    public String toString() {
        return this.getClass().getName().concat(" ").concat(super.name);
    }
}
