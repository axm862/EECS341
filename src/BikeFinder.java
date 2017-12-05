import javax.swing.*;
import java.util.List;

public class BikeFinder {

    private static JDBC_Driver jdbc_driver;

    public static void main(String[] args) {
        JFrame frame = new JFrame("Bike Selector");
        initJDBC_Driver();
        frame.setContentPane(new BikeFinderForm().getPanel());
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }

    public static void initJDBC_Driver(){
        jdbc_driver = new JDBC_Driver();
    }

    public static JDBC_Driver getJdbc_driver() {
        return jdbc_driver;
    }

    public static void displayOutput(List<String[]> bikes){
        OutputJFrame frame = new OutputJFrame();

        for (String[] s : bikes) {
            OutputJPanel entry = new OutputJPanel();
            for (int i = 0; i < s.length; i++) {
                entry.getAttributes().add(s[i]);
            }
            entry.initPanel();
            frame.getjPanels().add(entry);
        }
        frame.initFrame();
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
}
