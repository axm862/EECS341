import javax.swing.*;

public class Price extends NerfedQueryObject{
    public Price(JCheckBox jCheckBox) {
        super(jCheckBox);
    }

    @Override
    public void addAttributes() {
        attributeList.add(new JPanelDouble("Price"));
    }
}
