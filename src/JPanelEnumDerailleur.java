import javax.swing.*;

public class JPanelEnumDerailleur extends JPanelEnum{

    JComboBox<String> combo;

    JPanelEnumDerailleur(String attributeName) {
        super(attributeName);
        combo = new JComboBox<>();
        combo.addItem("SRAM");
        combo.addItem("Shimano");
        setCombo(combo);
    }
}
