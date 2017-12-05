import javax.management.Query;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class BikeFinderForm {

    private Shifter shifter;
    private Handlebar handlebar;
    private Crankset crankset;
    private Wheel wheel;
    private Frame frame;
    private Brake brake;
    private FrontShock frontShock;
    private RearShock rearShock;
    private Derailleur derailleur;
    private Manufacturer manufacturer;
    private Year year;
    private Price price;
    private ModelName modelName;

    public JPanel getPanel() {
        return panel;
    }

    private JPanel panel;
    private JProgressBar progressBar1;
    private JCheckBox modelNameCheckBox;
    private JCheckBox manufacturerCheckBox;
    private JButton searchButton;
    private JCheckBox derailleurCheckBox;
    private JCheckBox rearShockCheckBox;
    private JCheckBox frontShockCheckBox;
    private JCheckBox brakeCheckBox;
    private JCheckBox shifterCheckBox;
    private JCheckBox wheelCheckBox;
    private JCheckBox cranksetCheckBox;
    private JCheckBox handlebarCheckBox;
    private JCheckBox priceCheckBox;
    private JCheckBox yearCheckBox;
    private JCheckBox frameCheckBox1;

    public BikeFinderForm() {

        shifterCheckBox.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (shifterCheckBox.isSelected()) {
                    shifter = new Shifter(shifterCheckBox);
                } else {
                    QueryObject.getQueryObjects().remove(shifter);
                }
            }
        });
        handlebarCheckBox.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (handlebarCheckBox.isSelected()) {
                    handlebar = new Handlebar(handlebarCheckBox);
                }
                else {
                    QueryObject.getQueryObjects().remove(handlebar);
                }
            }
        });
        cranksetCheckBox.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (cranksetCheckBox.isSelected()) {
                    crankset = new Crankset(cranksetCheckBox);
                }
                else {
                    QueryObject.getQueryObjects().remove(crankset);
                }
            }
        });
        wheelCheckBox.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (wheelCheckBox.isSelected()) {
                    wheel = new Wheel(wheelCheckBox);
                }
                else {
                    QueryObject.getQueryObjects().remove(wheel);
                }
            }
        });
        frameCheckBox1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (frameCheckBox1.isSelected()) {
                    frame = new Frame(frameCheckBox1);
                }
                else {
                    QueryObject.getQueryObjects().remove(frame);
                }
            }
        });
        brakeCheckBox.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (brakeCheckBox.isSelected()) {
                    brake = new Brake(brakeCheckBox);
                }
                else {
                    QueryObject.getQueryObjects().remove(brake);
                }
            }
        });
        frontShockCheckBox.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (frontShockCheckBox.isSelected()) {
                    frontShock = new FrontShock(frontShockCheckBox);
                }
                else {
                    QueryObject.getQueryObjects().remove(frontShock);
                }
            }
        });
        rearShockCheckBox.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (rearShockCheckBox.isSelected()) {
                    rearShock = new RearShock(rearShockCheckBox);
                }
                else {
                    QueryObject.getQueryObjects().remove(rearShock);
                }
            }
        });
        derailleurCheckBox.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (derailleurCheckBox.isSelected()) {
                    derailleur = new Derailleur(derailleurCheckBox);
                }
                else {
                    QueryObject.getQueryObjects().remove(derailleur);
                }
            }
        });
        manufacturerCheckBox.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (manufacturerCheckBox.isSelected()) {
                    manufacturer = new Manufacturer(manufacturerCheckBox);
                }
                else {
                    QueryObject.getQueryObjects().remove(manufacturer);
                }
            }
        });
        yearCheckBox.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (yearCheckBox.isSelected()) {
                    year = new Year(yearCheckBox);
                }
                else {
                    QueryObject.getQueryObjects().remove(year);
                }
            }
        });
        priceCheckBox.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (priceCheckBox.isSelected()) {
                    price = new Price(priceCheckBox);
                }
                else {
                    QueryObject.getQueryObjects().remove(price);
                }
            }
        });
        modelNameCheckBox.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (modelNameCheckBox.isSelected()) {
                    modelName = new ModelName(modelNameCheckBox);
                }
                else {
                    QueryObject.getQueryObjects().remove(modelName);
                }
            }
        });
        searchButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                /*
                for (QueryObject qo : QueryObject.getQueryObjects()) {
                    System.out.println(qo.getQuery());
                    BikeFinder.getJdbc_driver().bikeList(qo.getQuery());
                }
                */
                BikeFinder.displayOutput(BikeFinder.getJdbc_driver().bikeList(QueryObject.getQueryObjects()));
            }
        });

    }

    {
// GUI initializer generated by IntelliJ IDEA GUI Designer
// >>> IMPORTANT!! <<<
// DO NOT EDIT OR ADD ANY CODE HERE!
        $$$setupUI$$$();
    }

    /**
     * Method generated by IntelliJ IDEA GUI Designer
     * >>> IMPORTANT!! <<<
     * DO NOT edit this method OR call it in your code!
     *
     * @noinspection ALL
     */
    private void $$$setupUI$$$() {
        panel = new JPanel();
        panel.setLayout(new com.intellij.uiDesigner.core.GridLayoutManager(8, 3, new Insets(0, 0, 0, 0), -1, -1));
        progressBar1 = new JProgressBar();
        panel.add(progressBar1, new com.intellij.uiDesigner.core.GridConstraints(7, 0, 1, 2, com.intellij.uiDesigner.core.GridConstraints.ANCHOR_CENTER, com.intellij.uiDesigner.core.GridConstraints.FILL_HORIZONTAL, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_WANT_GROW, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_FIXED, null, null, null, 1, false));
        final JLabel label1 = new JLabel();
        label1.setText("Search by:");
        panel.add(label1, new com.intellij.uiDesigner.core.GridConstraints(0, 0, 5, 1, com.intellij.uiDesigner.core.GridConstraints.ANCHOR_CENTER, com.intellij.uiDesigner.core.GridConstraints.FILL_NONE, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_FIXED, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        modelNameCheckBox = new JCheckBox();
        modelNameCheckBox.setText("Model Name");
        panel.add(modelNameCheckBox, new com.intellij.uiDesigner.core.GridConstraints(0, 1, 1, 1, com.intellij.uiDesigner.core.GridConstraints.ANCHOR_WEST, com.intellij.uiDesigner.core.GridConstraints.FILL_NONE, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_SHRINK | com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_GROW, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        manufacturerCheckBox = new JCheckBox();
        manufacturerCheckBox.setText("Manufacturer");
        panel.add(manufacturerCheckBox, new com.intellij.uiDesigner.core.GridConstraints(1, 1, 1, 1, com.intellij.uiDesigner.core.GridConstraints.ANCHOR_WEST, com.intellij.uiDesigner.core.GridConstraints.FILL_NONE, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_SHRINK | com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_GROW, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        searchButton = new JButton();
        searchButton.setText("Search");
        panel.add(searchButton, new com.intellij.uiDesigner.core.GridConstraints(7, 2, 1, 1, com.intellij.uiDesigner.core.GridConstraints.ANCHOR_CENTER, com.intellij.uiDesigner.core.GridConstraints.FILL_HORIZONTAL, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_SHRINK | com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_GROW, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        derailleurCheckBox = new JCheckBox();
        derailleurCheckBox.setText("Derailleur");
        panel.add(derailleurCheckBox, new com.intellij.uiDesigner.core.GridConstraints(2, 1, 1, 1, com.intellij.uiDesigner.core.GridConstraints.ANCHOR_WEST, com.intellij.uiDesigner.core.GridConstraints.FILL_NONE, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_SHRINK | com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_GROW, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        rearShockCheckBox = new JCheckBox();
        rearShockCheckBox.setText("Rear Shock");
        panel.add(rearShockCheckBox, new com.intellij.uiDesigner.core.GridConstraints(3, 1, 1, 1, com.intellij.uiDesigner.core.GridConstraints.ANCHOR_WEST, com.intellij.uiDesigner.core.GridConstraints.FILL_NONE, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_SHRINK | com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_GROW, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        frontShockCheckBox = new JCheckBox();
        frontShockCheckBox.setText("Front Shock");
        panel.add(frontShockCheckBox, new com.intellij.uiDesigner.core.GridConstraints(4, 1, 1, 1, com.intellij.uiDesigner.core.GridConstraints.ANCHOR_WEST, com.intellij.uiDesigner.core.GridConstraints.FILL_NONE, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_SHRINK | com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_GROW, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        brakeCheckBox = new JCheckBox();
        brakeCheckBox.setText("Brake");
        panel.add(brakeCheckBox, new com.intellij.uiDesigner.core.GridConstraints(5, 1, 1, 1, com.intellij.uiDesigner.core.GridConstraints.ANCHOR_WEST, com.intellij.uiDesigner.core.GridConstraints.FILL_NONE, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_SHRINK | com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_GROW, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        shifterCheckBox = new JCheckBox();
        shifterCheckBox.setText("Shifter");
        panel.add(shifterCheckBox, new com.intellij.uiDesigner.core.GridConstraints(6, 1, 1, 1, com.intellij.uiDesigner.core.GridConstraints.ANCHOR_WEST, com.intellij.uiDesigner.core.GridConstraints.FILL_NONE, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_SHRINK | com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_GROW, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        wheelCheckBox = new JCheckBox();
        wheelCheckBox.setText("Wheel");
        panel.add(wheelCheckBox, new com.intellij.uiDesigner.core.GridConstraints(0, 2, 1, 1, com.intellij.uiDesigner.core.GridConstraints.ANCHOR_WEST, com.intellij.uiDesigner.core.GridConstraints.FILL_NONE, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_SHRINK | com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_GROW, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        cranksetCheckBox = new JCheckBox();
        cranksetCheckBox.setText("Crankset");
        panel.add(cranksetCheckBox, new com.intellij.uiDesigner.core.GridConstraints(1, 2, 1, 1, com.intellij.uiDesigner.core.GridConstraints.ANCHOR_WEST, com.intellij.uiDesigner.core.GridConstraints.FILL_NONE, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_SHRINK | com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_GROW, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        handlebarCheckBox = new JCheckBox();
        handlebarCheckBox.setText("Handlebar");
        panel.add(handlebarCheckBox, new com.intellij.uiDesigner.core.GridConstraints(2, 2, 1, 1, com.intellij.uiDesigner.core.GridConstraints.ANCHOR_WEST, com.intellij.uiDesigner.core.GridConstraints.FILL_NONE, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_SHRINK | com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_GROW, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        priceCheckBox = new JCheckBox();
        priceCheckBox.setText("Price");
        panel.add(priceCheckBox, new com.intellij.uiDesigner.core.GridConstraints(3, 2, 1, 1, com.intellij.uiDesigner.core.GridConstraints.ANCHOR_WEST, com.intellij.uiDesigner.core.GridConstraints.FILL_NONE, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_SHRINK | com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_GROW, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        yearCheckBox = new JCheckBox();
        yearCheckBox.setText("Year");
        panel.add(yearCheckBox, new com.intellij.uiDesigner.core.GridConstraints(4, 2, 1, 1, com.intellij.uiDesigner.core.GridConstraints.ANCHOR_WEST, com.intellij.uiDesigner.core.GridConstraints.FILL_NONE, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_SHRINK | com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_GROW, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        frameCheckBox1 = new JCheckBox();
        frameCheckBox1.setText("Frame");
        panel.add(frameCheckBox1, new com.intellij.uiDesigner.core.GridConstraints(5, 2, 1, 1, com.intellij.uiDesigner.core.GridConstraints.ANCHOR_WEST, com.intellij.uiDesigner.core.GridConstraints.FILL_NONE, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_SHRINK | com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_GROW, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
    }

    /**
     * @noinspection ALL
     */
    public JComponent $$$getRootComponent$$$() {
        return panel;
    }
}
