import javax.swing.*;

/**
 * Created by jeffeben on 12/2/17.
 */
public class Shifter extends QueryObject{

    int shifterID;
    String family;

    public Shifter(JCheckBox jCheckBox) {
        super(jCheckBox);
    }

/*    public Shifter(){}

    public Shifter(int shifterID, String family) {
        this.shifterID = shifterID;
        this.family = family;
    }*/

    public int getShifterID() {
        return shifterID;
    }

    public String getFamily() {
        return family;
    }
}
