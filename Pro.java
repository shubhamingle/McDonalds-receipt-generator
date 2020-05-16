import javax.swing.*;
import java.awt.event.*;

public class Pro implements ActionListener
{
JFrame f1=new JFrame("Log In");
JButton b1;

Pro()
{
b1=new JButton("Enter");
f1.setSize(640,640);
f1.setVisible(true);
f1.setLayout(null);
f1.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
f1.setContentPane(new JLabel(new ImageIcon("mcd.jpg")));
f1.getContentPane().add(b1);
f1.repaint();
f1.validate();
b1.setBounds(270,270,100,30);
b1.addActionListener(this);
}
public void actionPerformed(ActionEvent e)
{
f1.dispose();
Project1 p2=new Project1();
}
public static void main(String ag[])
{
Pro p1=new Pro();
}
}
