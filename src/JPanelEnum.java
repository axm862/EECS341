import javax.swing.*;
import java.awt.*;

public class JPanelEnum extends JPanelAttribute {

    private JLabel name;
    private JComboBox<String> combo;

    JPanelEnum(String attributeName) {
        super(attributeName);
    }

    @Override
    public void initPanel() {
        this.setLayout(new GridLayout());
        name = new JLabel();
        name.setText(AttributeName.toReadableString(this.getAttributeName()));
        this.add(name);
        this.add(combo);
    }

    @Override
    public String getAttributeQuery() {
        if (combo.getSelectedIndex() == 0) {
            return "";
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(getAttributeName());
        stringBuilder.append(" = ");
        String input = String.valueOf(combo.getSelectedItem());
        stringBuilder.append(input);
        return stringBuilder.toString().toLowerCase();
    }

    public void setCombo(JComboBox<String> combo) {
        this.combo = combo;
    }
}
