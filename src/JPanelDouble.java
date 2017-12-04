import javax.swing.*;

public class JPanelDouble extends JPanelAttribute{

    public JPanelDouble(String name) {
        super(name);
    }

    @Override
    public void initPanel() {
        JLabel name = new JLabel();
        name.setText(this.getName());
        this.add(name);
        JComboBox combo = new JComboBox();
        combo.addItem(">");
        combo.addItem("<");
        combo.addItem("=");
        this.add(combo);
        JTextField data = new JTextField();
        this.add(data);
    }
}
