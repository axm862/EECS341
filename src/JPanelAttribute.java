import javax.swing.*;

public abstract class JPanelAttribute extends JPanel{

    JPanelAttribute(String attributeName){
        this.attributeName = attributeName;
    }

    public abstract void initPanel();

    public String getAttributeName() {
        return attributeName;
    }

    public void setAttributeName(String name) {
        this.attributeName = name;
    }

    String attributeName;

    public String getTableName() {
        return tableName;
    }

    public void setTableName(String tableName) {
        this.tableName = tableName;
    }

    String tableName;

    public abstract String getAttributeQuery();

}
