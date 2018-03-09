import com.sun.tools.doclets.formats.html.SourceToHTMLConverter;

/**
 * Created by student on 3/8/18.
 */
public class Person {
    protected String name, address, phone, email;

    public Person(String name){
        this.name = name;
    };

    @Override
    public String toString() {
         return this.getClass().getName().concat(" ").concat(this.name);
    };
};
