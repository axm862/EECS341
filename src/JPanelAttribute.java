import javax.swing.*;

public abstract class JPanelAttribute extends JPanel{

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    String name;

    JPanelAttribute(String name){
        this.name = name;
    }

    public abstract void initPanel();

}
