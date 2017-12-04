/**
 * Created by jeffeben on 12/2/17.
 */
public class Brake extends QueryObject{

    private int brakeID;
    private String brakeType;

    public Brake(int brakeID, String brakeType) {
        this.brakeID = brakeID;
        this.brakeType = brakeType;
    }

    public int getBrakeID() {
        return brakeID;
    }

    public String getBrakeType() {
        return brakeType;
    }
}
