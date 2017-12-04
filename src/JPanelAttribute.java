import javax.swing.*;
import java.awt.*;

public abstract class JPanelAttribute extends JPanel{

    JPanelAttribute(String attributeName){
        this.attributeName = attributeName;
        System.out.println("Generating window for " + attributeName);
    }

    public abstract void initPanel();

    public String getAttributeName() {
        return this.attributeName;
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
