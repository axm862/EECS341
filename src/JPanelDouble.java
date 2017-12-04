import javax.swing.*;
import java.awt.*;

public class JPanelDouble extends JPanelAttribute{

    public JPanelDouble(String name) {
        super(name);
    }

    private JLabel name;
    private JComboBox<String> combo;
    private JTextField data;

    @Override
    public void initPanel() {
        this.setLayout(new BoxLayout(this, BoxLayout.X_AXIS));
        name = new JLabel();
        name.setText(this.getTableName());
        this.add(name);
        combo = new JComboBox<>();
        combo.addItem(">");
        combo.addItem("<");
        combo.addItem("=");
        this.add(combo);
        data = new JTextField();
        this.add(data);
    }

    @Override
    public String getAttributeQuery() {
        try{
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(getAttributeName());
            stringBuilder.append(" ");
            stringBuilder.append(combo.getSelectedItem());
            stringBuilder.append(" ");
            String input = data.getText();
            double value = Double.parseDouble(input);
            stringBuilder.append(value);
            return stringBuilder.toString();
        } catch(NullPointerException | NumberFormatException e1) {
            JOptionPane.showMessageDialog(null, "Must be a real number", "Error", JOptionPane.ERROR_MESSAGE);
            return null;
        }
    }
}