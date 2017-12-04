import javax.swing.*;

public class JPanelEnumCrankset extends JPanelEnum{

    JComboBox<String> combo;

    JPanelEnumCrankset(String attributeName) {
        super(attributeName);
        combo = new JComboBox<>();
        combo.addItem("SRAM");
        combo.addItem("Shimano");
        setCombo(combo);
    }
}
