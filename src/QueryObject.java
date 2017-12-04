import javax.swing.*;
import java.util.LinkedList;
import java.util.List;

/**
 * Created by jeffeben on 12/2/17.
 */
public abstract class QueryObject extends JFrame{

    public static List<QueryObject> getQueryObjects() {
        return queryObjects;
    }

    private static List<QueryObject> queryObjects = new LinkedList<>();

    List<JPanelAttribute> attributeList;

    public JCheckBox getjCheckBox() {
        return jCheckBox;
    }

    private JCheckBox jCheckBox;

    public QueryObject(JCheckBox jCheckBox) {
        queryObjects.add(this);
        this.jCheckBox = jCheckBox;

        attributeList = JDBC_Driver.attributeList(getName());

        this.setTitle(getName());
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

    public String getName() {
        return this.getClass().getSimpleName();
    }

    public String getQuery() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("SELECT * FROM ");
        stringBuilder.append(getName());
        stringBuilder.append(" WHERE");
        for (JPanelAttribute j : attributeList) {
            stringBuilder.append(" ");
            stringBuilder.append(j.getAttributeQuery());
        }
        return stringBuilder.toString();
    }

}
