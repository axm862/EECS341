import javax.swing.*;

public class JPanelEnumShifter extends JPanelEnum{

    JComboBox<String> combo;

    JPanelEnumShifter(String attributeName) {
        super(attributeName);
        combo = new JComboBox<>();
        combo.addItem("");
        combo.addItem("Twist");
        combo.addItem("Trigger");
        setCombo(combo);
    }
}
