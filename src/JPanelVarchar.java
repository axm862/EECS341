import javax.swing.*;

public class JPanelVarchar extends JPanelAttribute {

    public JPanelVarchar(String name){
        super(name);
    }

    JLabel name;
    JTextField data;

    @Override
    public void initPanel() {
        name = new JLabel();
        name.setText(this.getName());
        this.add(name);
        data = new JTextField();
        this.add(data);
    }

    @Override
    public String getAttributeQuery() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(getAttributeName());
        stringBuilder.append(" = ");
        stringBuilder.append(data.getText());
        return stringBuilder.toString();
    }
}
