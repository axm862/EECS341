import javax.swing.*;

public abstract class JPanelAttribute extends JPanel{

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    String name;

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }

    Object data;

    JPanelAttribute(String name, Object data){
        this.name = name;
        this.data = data;
    }

    public abstract void initPanel();

}
