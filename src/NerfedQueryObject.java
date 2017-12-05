import javax.swing.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.util.LinkedList;

public abstract class NerfedQueryObject extends QueryObject {

    public NerfedQueryObject(JCheckBox jCheckBox) {
        super(jCheckBox);
    }

    @Override
    public String getQuery(){
        StringBuilder stringBuilder = new StringBuilder();
        int attributes = 0;
        String and = "";
        for (JPanelAttribute j : attributeList) {
            if(j.getAttributeQuery().length() > 0) {
                attributes++;
                stringBuilder.append(and);
                stringBuilder.append(j.getAttributeQuery());
                and = " AND ";
            }
        }
        return attributes > 0 ? stringBuilder.toString() : "";
    }

    @Override
    public void initFrame(){
        attributeList = new LinkedList<>();

        addAttributes();

        this.setTitle(AttributeName.toReadableString(getName()));
        this.setLayout(new BoxLayout(this.getContentPane(), BoxLayout.Y_AXIS));

        for (JPanelAttribute j : attributeList) {
            j.initPanel();
            j.setTableName(getName());
            this.add(j);
        }
        this.add(new JPanelConfirmCancel(this));

        this.pack();
        this.revalidate();
        this.setVisible(true);
    }

    public abstract void addAttributes();
}
