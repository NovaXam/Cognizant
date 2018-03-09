
/**
 * Created by student on 3/7/18.
 */
public class Square extends Shape {
    private int mSideLenght;

    public Square(int length, String color) {
        super(color);
        mSideLenght = length;
    }

    public int getArea() {
        return mSideLenght * mSideLenght;
    };
};