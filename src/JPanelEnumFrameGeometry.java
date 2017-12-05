import javax.swing.*;

public class JPanelEnumFrameGeometry extends JPanelEnum {

    JComboBox<String> combo;

    JPanelEnumFrameGeometry(String attributeName) {
        super(attributeName);
        combo = new JComboBox<>();
        combo.addItem("");
        combo.addItem("XC Geometry");
        combo.addItem("S3 Geometry");
        combo.addItem("G2 Geometry");
        setCombo(combo);
    }
}
