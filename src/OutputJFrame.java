import javax.swing.*;

public class OutputJFrame extends JFrame {

    private String[] columns;

    public void setColumns(String[] columns) {
        this.columns = columns;
    }

    public void setData(String[][] data) {
        this.data = data;
    }

    private String[][] data;

    public OutputJFrame(){

    }

    public void initFrame(){
        this.setTitle("Selected Bikes");

        //JPanel output = new JPanel();

        //output.setLayout(new BoxLayout(output, BoxLayout.Y_AXIS));

        JTable table = new JTable(data, columns);

        //JScrollPane scrollPane = new JScrollPane(output);
        this.add(new JScrollPane(table));
        this.pack();
        this.revalidate();
        this.setVisible(true);
    }
}
