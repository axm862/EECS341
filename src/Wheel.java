/**
 * Created by jeffeben on 12/2/17.
 */
public class Wheel extends QueryObject {

    private int wheelID;
    private double wheelSize;

    public Wheel(int wheelID, double wheelSize) {
        this.wheelID = wheelID;
        this.wheelSize = wheelSize;
    }

    public int getWheelID() {
        return wheelID;
    }

    public double getWheelSize() {
        return wheelSize;
    }
}
