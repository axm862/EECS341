import javax.swing.*;
import java.util.LinkedList;
import java.util.List;

public class OutputJFrame extends JFrame {

    public List<OutputJPanel> getjPanels() {
        return jPanels;
    }

    private List<OutputJPanel> jPanels;

    public OutputJFrame(){
        jPanels = new LinkedList<>();
    }

    public void initFrame(){
        this.setTitle("Selected Bikes");

        JPanel output = new JPanel();

        output.setLayout(new BoxLayout(output, BoxLayout.Y_AXIS));

        for (OutputJPanel j : jPanels) {
            j.initPanel();
            output.add(j);
        }
        JScrollPane scrollPane = new JScrollPane(output);
        this.add(output);
        this.pack();
        this.revalidate();
        this.setVisible(true);
    }
}
