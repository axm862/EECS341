import javax.swing.*;
import java.awt.*;

public class JPanelVarchar extends JPanelAttribute {

    public JPanelVarchar(String name){
        super(name);
    }

    JLabel name;
    JTextField data;

    @Override
    public void initPanel() {
        this.setLayout(new BoxLayout(this, BoxLayout.LINE_AXIS));
        name = new JLabel();
        name.setText(this.getTableName());
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
