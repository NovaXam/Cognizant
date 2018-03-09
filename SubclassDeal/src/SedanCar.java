/**
 * Created by student on 3/7/18.
 */
public class SedanCar extends Vehicle {
    private int mNumSeats;

    public SedanCar(String modelName, String ownerName) {
        super(modelName, ownerName);
        mNumSeats = 4;
    }

    public int getmNumSeats(){
        return this.mNumSeats;
    };
}
