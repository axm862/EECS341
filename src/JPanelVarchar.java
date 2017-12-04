import javax.swing.*;

public class JPanelVarchar extends JPanelAttribute {

    public JPanelVarchar(String name){
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
