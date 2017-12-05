import javax.swing.*;
import java.awt.*;
import java.util.LinkedList;

public class OutputJPanel extends JPanel {

    public LinkedList<String> getAttributes() {
        return attributes;
    }

    LinkedList<String> attributes;

    OutputJPanel() {
        //attributes = new LinkedList<>();
        //this.setLayout(new GridLayout());
    }

    public void initPanel(){
        for (String s : getAttributes()) {
            JLabel attribute = new JLabel(s);
            this.add(attribute);
        }
    }



}
