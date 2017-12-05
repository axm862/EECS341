import javax.swing.*;

public class JPanelEnumDerailleur extends JPanelEnum{

    JComboBox<String> combo;

    JPanelEnumDerailleur(String attributeName) {
        super(attributeName);
        combo = new JComboBox<>();
        combo.addItem("XTR");
        combo.addItem("XX1");
        combo.addItem("GX");
        combo.addItem("X01");
        combo.addItem("Deore");
        combo.addItem("Saint");
        combo.addItem("XT");
        combo.addItem("NX");
        combo.addItem("RD");
        combo.addItem("SLX");
        combo.addItem("LG");
        combo.addItem("FD");
        combo.addItem("X5");
        combo.addItem("X1");
        setCombo(combo);
    }
}
