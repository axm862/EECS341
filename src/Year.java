import javax.swing.*;

public class Year extends NerfedQueryObject{

    public Year(JCheckBox jCheckBox) {
        super(jCheckBox);
    }

    @Override
    public void addAttributes() {
        attributeList.add(new JPanelInt("Year"));
    }
}
