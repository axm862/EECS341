import javax.swing.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
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

    public String getPrimaryKey() {
        return primaryKey;
    }

    public void setPrimaryKey(String primaryKey) {
        this.primaryKey = primaryKey;
    }

    private String primaryKey;

    public QueryObject(JCheckBox jCheckBox) {
        queryObjects.add(this);
        this.jCheckBox = jCheckBox;
        initFrame();
        System.out.println(" * Created " + getName() + " jFrame");
    }

    public void initFrame() {
        attributeList = JDBC_Driver.attributeList(getName());

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

    public String getName() {
        return this.getClass().getSimpleName();
    }

    public String getQuery() {
        int attributes = 0;
        StringBuilder stringBuilder = new StringBuilder();
        String and = "";

        stringBuilder.append("(SELECT ");
        stringBuilder.append(getPrimaryKey());
        stringBuilder.append(" FROM ");
        stringBuilder.append(getName());
        stringBuilder.append(" WHERE ");
        for (JPanelAttribute j : attributeList) {
            if(j.getAttributeQuery().length() > 0) {
                stringBuilder.append(and);
                stringBuilder.append(j.getAttributeQuery());
                and = " AND ";
                attributes++;
            }
        }
        stringBuilder.append(")");
        return attributes > 0 ? stringBuilder.toString() : "";
    }

}
