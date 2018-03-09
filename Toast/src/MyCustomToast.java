/**
 * Created by student on 3/7/18.
 */
public class MyCustomToast extends Toast {
    public MyCustomToast(String name) {
        super(name);
    };

    @Override
    public String getName() {
        return (this.getName() + "customazed");
    };
}
