import javax.swing.*;

public class JPanelEnumHandlebar extends JPanelEnum{

    JComboBox<String> combo;

    JPanelEnumHandlebar(String attributeName) {
        super(attributeName);
        combo = new JComboBox<>();
        combo.addItem("Carbon");
        combo.addItem("Metal");
        combo.addItem("Metal Alloy");
        setCombo(combo);
    }
}
