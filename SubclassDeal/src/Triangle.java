/**
 * Created by student on 3/7/18.
 */
public class Triangle extends Shape {
    private int mSideLength1;
    private int mSideLength2;
    private int mSideLength3;

    public Triangle(int length1, int length2, int length3, String color) {
        super(color);
        this.mSideLength1 = length1;
        this.mSideLength2 = length2;
        this.mSideLength3 = length3;
    };

    public double getArea() {
        double s = (mSideLength1 + mSideLength2 + mSideLength3) / 2;
        return Math.sqrt(s * (s - mSideLength1) * (s - mSideLength2) * (s - mSideLength3));
    };
}

