import javax.swing.*;

/**
 * Created by jeffeben on 12/2/17.
 */
public class Derailleur extends QueryObject{

    private int derailleurID;

/*
    public Derailleur(int derailleurID) {
        this.derailleurID = derailleurID;
    }
*/

    public Derailleur(JCheckBox jCheckBox) {
        super(jCheckBox);
    }

    public int getDerailleurID() {
        return derailleurID;
    }
}
