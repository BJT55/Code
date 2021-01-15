import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.net.ConnectException;

public class Delete extends JFrame {
    JLabel magLaNum = new JLabel("期刊号：");
    JTextField magTextNum = new JTextField("",20);
    JButton buDelete = new JButton("删除");
    JButton buReturn = new JButton("返回");

    public Delete(){
        JPanel magPaNum = new JPanel();
        JPanel magPaButton = new JPanel(new GridLayout(1,1));

        magPaNum.add(magLaNum);
        magPaButton.add(magTextNum);
        magPaButton.add(buDelete);
        magPaButton.add(buReturn);

        buDelete.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String number = magLaNum.getText();

               // Connection conn = null;
                
            }
        });
    }
}
