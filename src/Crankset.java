import javax.swing.*;

/**
 * Created by jeffeben on 12/2/17.
 */
public class Crankset extends QueryObject{

    private int CranksetID;

/*    public Crankset(int CranksetID) {
        this.CranksetID = CranksetID;
    }*/

    public Crankset(JCheckBox jCheckBox) {
        super(jCheckBox);
    }

    public int getCranksetID() {
        return CranksetID;
    }
}
