import javax.swing.*;

public class JPanelEnumBrake extends JPanelEnum {

    JComboBox<String> combo;

    JPanelEnumBrake(String attributeName) {
        super(attributeName);
        combo = new JComboBox<>();
        combo.addItem("");
        combo.addItem("Hydraulic");
        combo.addItem("Mechanical");
        setCombo(combo);
    }
}
