import javax.swing.*;

public class JPanelInt extends JPanelAttribute{

    private JLabel name;
    private JComboBox<String> combo;
    private JTextField data;

    public JPanelInt(String name) {
        super(name);
    }

    @Override
    public void initPanel() {
        name = new JLabel();
        name.setText(this.getName());
        this.add(name);
        combo = new JComboBox();
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
            int value = Integer.parseInt(input);
            stringBuilder.append(value);
            return stringBuilder.toString();
        } catch(NullPointerException | NumberFormatException e1) {
            JOptionPane.showMessageDialog(null, "Must be a real number", "Error", JOptionPane.ERROR_MESSAGE);
            return null;
        }
    }
}
