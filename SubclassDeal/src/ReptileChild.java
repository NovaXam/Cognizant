/**
 * Created by student on 3/7/18.
 */
public class ReptileChild extends Reptile {
    private String region;

    public ReptileChild(String name, String kind, int length, String region) {
        super(name, kind, length);
        this.region = region;
    }

    public void setRegion(String newRegion) {
        this.region = newRegion;
    };

    public String getRegion() {
        return this.region;
    };

    @Override
    public String toString() {
        return ("kind: ".concat(this.getKind()) + " " + "name: ".concat(this.getName()) + " " + "region: " + this.getRegion() + " " + "length: " + this.getLength());
    };
}
