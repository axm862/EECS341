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
        this.setLayout(new GridLayout());
        name = new JLabel();
        name.setText(AttributeName.toReadableString(this.getAttributeName()));
        this.add(name);
        data = new JTextField();
        this.add(data);
    }

    @Override
    public String getAttributeQuery() {
        if(data.getText().length() <= 0){
            return "";
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(getAttributeName());
        stringBuilder.append(" = \'");
        stringBuilder.append(data.getText());
        stringBuilder.append("\'");
        return stringBuilder.toString();
    }
}
