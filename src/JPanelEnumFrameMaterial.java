import javax.swing.*;

public class JPanelEnumFrameMaterial extends JPanelEnum {

    JComboBox<String> combo;

    JPanelEnumFrameMaterial(String attributeName) {
        super(attributeName);
        combo = new JComboBox<>();
        combo.addItem("Carbon");
        combo.addItem("Aluminum");
        combo.addItem("Steel");
        combo.addItem("Metal Alloy");
        setCombo(combo);
    }
}
