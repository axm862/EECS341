import javax.swing.*;

public class JPanelInt extends JPanelAttribute{

    public JPanelInt(String name) {
        super(name);
    }

    @Override
    public void initPanel() {
        JLabel name = new JLabel();
        name.setText(this.getName());
        this.add(name);
        JTextField data = new JTextField();
        this.add(data);
    }
}
