import javax.swing.*;

public class BikeFinder {

    private static JDBC_Driver jdbc_driver;

    public static void main(String[] args) {
        JFrame frame = new JFrame("Bike Selector");
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
}
