/**
 * Created by jeffeben on 12/2/17.
 */
public class RearShock extends QueryObject{

    private int rearShockID;
    private int travel_mm;

    public RearShock(){}

    public RearShock(int rearShockID, int travel_mm) {
        this.rearShockID = rearShockID;
        this.travel_mm = travel_mm;
    }

    public int getRearShockID() {
        return rearShockID;
    }

    public int getTravel_mm() {
        return travel_mm;
    }
}
