import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;

public class JPanelConfirmCancel extends JPanel{

    JButton confirm, cancel;
    QueryObject queryObject;

    public JPanelConfirmCancel(QueryObject queryObject){
        this.queryObject = queryObject;
        this.setLayout(new GridLayout());
        cancel = new JButton("Cancel");
        confirm = new JButton("Confirm");
        this.add(cancel);
        this.add(confirm);
        cancel.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                queryObject.getjCheckBox().setSelected(false);
                QueryObject.getQueryObjects().remove(queryObject);
                queryObject.dispatchEvent(new WindowEvent(queryObject, WindowEvent.WINDOW_CLOSING));
            }
        });
        confirm.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                queryObject.dispatchEvent(new WindowEvent(queryObject, WindowEvent.WINDOW_CLOSING));
            }
        });
    }
}
