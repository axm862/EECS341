import javax.swing.*;
import java.util.List;

/**
 * Created by jeffeben on 12/2/17.
 */
public abstract class QueryObject extends JFrame{

    List<JPanelAttribute> attributeList;

    public QueryObject() {

        attributeList = JDBC_Driver.attributeList(getName());

        for (JPanelAttribute j : attributeList) {
            j.initPanel();
            j.setTableName(getName());
            this.add(j);
        }

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
