/**
 * Created by jeffeben on 12/2/17.
 */
public class FrontShock extends QueryObject{

    private int frontShockID;
    private int travel_mm;

    public FrontShock(int frontShockID, int travel_mm) {
        this.frontShockID = frontShockID;
        this.travel_mm = travel_mm;
    }

    public int getFrontShockID() {
        return frontShockID;
    }

    public int getTravel_mm() {
        return travel_mm;
    }
}
