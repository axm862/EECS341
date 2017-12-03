import javax.swing.*;

public class BikeFinder {

    public static void main(String[] args) {
        JFrame frame = new JFrame("Bike Selector 420");
        frame.setContentPane(new BikeFinderForm().getPanel());
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
}
