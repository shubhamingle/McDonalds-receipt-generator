//Restaurant bill generator using JAVA swing
//S.E Div-A     Subject - OOPM using JAVA
//Roll no- 337, 338
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.*;
public class Project1 implements ItemListener,ActionListener
{
private JFrame frame;
private JPanel panel;
private JCheckBox c1, c2, c3, c4, c5, c6, c7, c8, c9, c10;
private JLabel name, subtotal, gst, total, menu, l1, l2, l3, l4, l5, l6, l7, l8, l9, l10, food, pri, quan, food1, pri1, quan1;
private JTextField nameinput, price, gs, to, t1, t2, t3, t4, t5, t6, t7, t8, t9, t10;
private JTextArea  receipt;
private JButton generate, clear, exit, print;

String nam, b1;
private int sum=0;
private int a1, a2, a3, a4, a5, a6, a7, a8, a9, a10; 
private float g;
private float tot;
String item="";

public Project1()
{
food = new JLabel("ITEM");
food.setBounds(30,40,150,20);
food.setForeground(Color.darkGray);	
pri = new JLabel("PRICE");
pri.setBounds(170,40,150,20);
pri.setForeground(Color.darkGray);		
quan = new JLabel("QUANTITY");
quan.setBounds(220,40,150,20);
quan.setForeground(Color.darkGray);		
food1 = new JLabel("ITEM");
food1.setBounds(310,40,150,20);	
food1.setForeground(Color.darkGray);		
pri1 = new JLabel("PRICE");
pri1.setBounds(450,40,150,20);
pri1.setForeground(Color.darkGray);		
quan1 = new JLabel("QUANTITY");
quan1.setBounds(500,40,150,20);
quan1.setForeground(Color.darkGray);		

c1 = new JCheckBox("McVeggie");
c1.setFont(new Font("Cambria", Font.PLAIN, 18));
c1.setBounds(10,70,150,20);
c1.setBackground(new Color(255,210,166));
l1 = new JLabel("Rs.70");
l1.setBounds(170,70,40, 20);
t1 = new JTextField(30);
t1.setBounds(220,70,30,20);

c2 = new JCheckBox("McChicken");
c2.setFont(new Font("Cambria", Font.PLAIN, 18));
c2.setBounds(10,90,150,20);
c2.setBackground(new Color(255,210,166));
l2 = new JLabel("Rs.89");
l2.setBounds(170,90,40, 20);
t2 = new JTextField(30);
t2.setBounds(220,90,30,20);

c3 = new JCheckBox("Paneer Wrap");
c3.setFont(new Font("Cambria", Font.PLAIN, 18));
c3.setBounds(10,110,150,20);
c3.setBackground(new Color(255,210,166));
l3 = new JLabel("Rs.165");
l3.setBounds(170,110,40, 20);
t3 = new JTextField(30);
t3.setBounds(220,110,30,20);

c4 = new JCheckBox("McAloo Tikki");
c4.setFont(new Font("Cambria", Font.PLAIN, 18));
c4.setBounds(10,130,150,20);
c4.setBackground(new Color(255,210,166));
l4 = new JLabel("Rs.32");
l4.setBounds(170,130,40, 20);
t4 = new JTextField(30);
t4.setBounds(220,130,30,20);

c5 = new JCheckBox("Chicken McGrill");
c5.setFont(new Font("Cambria", Font.PLAIN, 18));
c5.setBounds(10,150,150,20);
c5.setBackground(new Color(255,210,166));
l5 = new JLabel("Rs.134");
l5.setBounds(170,150,40, 20);
t5 = new JTextField(30);
t5.setBounds(220,150,30,20);

c6 = new JCheckBox("McSpicy Paneer");
c6.setFont(new Font("Cambria", Font.PLAIN, 18));
c6.setBounds(290,70,150,20);
c6.setBackground(new Color(255,210,166));
l6 = new JLabel("Rs.123");
l6.setBounds(450,70,40, 20);
t6 = new JTextField(30);
t6.setBounds(500,70,30,20);

c7 = new JCheckBox("Iced Tea");
c7.setFont(new Font("Cambria", Font.PLAIN, 18));
c7.setBounds(290,90,150,20);
c7.setBackground(new Color(255,210,166));
l7 = new JLabel("Rs.27");
l7.setBounds(450,90,40, 20);
t7 = new JTextField(30);
t7.setBounds(500,90,30,20);

c8 = new JCheckBox("Soft Serve");
c8.setFont(new Font("Cambria", Font.PLAIN, 18));
c8.setBounds(290,110,150,20);
c8.setBackground(new Color(255,210,166));
l8 = new JLabel("Rs.25");
l8.setBounds(450,110,40, 20);
t8 = new JTextField(30);
t8.setBounds(500,110,30,20);

c9 = new JCheckBox("Coke");
c9.setFont(new Font("Cambria", Font.PLAIN, 18));
c9.setBounds(290,130,150,20);
c9.setBackground(new Color(255,210,166));
l9 = new JLabel("Rs.30");
l9.setBounds(450,130,40, 20);
t9 = new JTextField(30);
t9.setBounds(500,130,30,20);

c10 = new JCheckBox("Maharaja Mac");
c10.setFont(new Font("Cambria", Font.PLAIN, 18));
c10.setBounds(290,150,150,20);
c10.setBackground(new Color(255,210,166));
l10 = new JLabel("Rs.171");
l10.setBounds(450,150,40, 20);
t10 = new JTextField(30);
t10.setBounds(500,150,30,20);

generate=new JButton("Generate");
generate.setBounds(200,250,100,20);
generate.setBackground(new Color(255,255,187));

exit=new JButton("Exit");
exit.setBounds(310,250,100,20);
exit.setBackground(new Color(255,255,187));

clear=new JButton("Clear");
clear.setBounds(90, 250, 100, 20);
clear.setBackground(new Color(255,255,187));

print=new JButton("Print");
print.setBounds(420, 250, 100, 20);
print.setBackground(new Color(255,255,187));

subtotal = new JLabel("SubTotal : ");
subtotal.setBounds(10, 190, 70, 20);

price = new JTextField(30);
price.setBackground(new Color(255,226,198));
price.setEditable(false);
price.setBounds( 90, 190, 150, 20 );

gst = new JLabel("GST 18% : ");
gst.setBounds(10, 210, 70, 20);

gs = new JTextField(30);
gs.setEditable(false);
gs.setBackground(new Color(255,226,198));
gs.setBounds( 90, 210, 150, 20 );

total = new JLabel("TOTAL : ");
total.setBounds(10, 230, 70, 20);

to = new JTextField(30);
to.setEditable(false);
to.setBackground(new Color(255,226,198));
to.setBounds( 90, 230, 150, 20 );

name = new JLabel( "\nName:" );
name.setBounds( 10, 170, 50, 20 );
	
nameinput = new JTextField(30);
nameinput.setBounds( 90, 170, 150, 20 );
nameinput.setBackground(new Color(255,226,198));
    
menu = new JLabel( "McDonald's" );
menu.setFont(new Font("Impact", Font.BOLD, 28));
menu.setBounds(10, 10, 570, 30);
menu.setHorizontalAlignment(SwingConstants.CENTER);
menu.setOpaque(true);
menu.setBackground(new Color(221,16,33));
menu.setForeground(new Color(255,195,0));

receipt = new JTextArea( "", 36, 5 );
receipt.setEditable( false );
receipt.setBounds( 10, 270, 390, 460 );
receipt.setBackground(new Color(255,242,230));
receipt.setText( "Please enter customer's name and select any food item" );

panel = new JPanel( null );
panel.setBackground(new Color(255,210,166));
panel.add( menu );
panel.add( name );
panel.add( nameinput );
panel.add( subtotal );
panel.add( c1 );
panel.add( c2 );
panel.add( c3 );
panel.add( c4 );
panel.add( c5 );
panel.add( c6 );
panel.add( c7 );
panel.add( c8 );
panel.add( c9 );
panel.add( c10 );
panel.add( clear );
panel.add( price );
panel.add( gst );
panel.add( gs );
panel.add( total );
panel.add( to );
panel.add( receipt );
panel.add( generate );
panel.add( exit );
panel.add( l1 );
panel.add( l2 );
panel.add( l3 );
panel.add( l4 );
panel.add( l5 );
panel.add( l6 );
panel.add( l7 );
panel.add( l8 );
panel.add( l9 );
panel.add( l10 );
panel.add( t1 );
panel.add( t2 );
panel.add( t3 );
panel.add( t4 );
panel.add( t5 );
panel.add( t6 );
panel.add( t7 );
panel.add( t8 );
panel.add( t9 );
panel.add( t10 );
panel.add( food );
panel.add( pri );
panel.add( quan );
panel.add( food1 );
panel.add( pri1 );
panel.add( quan1 );
panel.add( print );
panel.setPreferredSize( new Dimension(600, 660) );

c1.addItemListener(this);
c2.addItemListener(this);
c3.addItemListener(this);
c4.addItemListener(this);
c5.addItemListener(this);
c6.addItemListener(this);
c7.addItemListener(this);
c8.addItemListener(this);
c9.addItemListener(this);
c10.addItemListener(this);
clear.addActionListener(this);
generate.addActionListener(this);
exit.addActionListener(this);
print.addActionListener(this);

frame = new JFrame( "Bill Generator" );
frame.getContentPane().add( panel );
frame.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
frame.pack();
frame.setVisible( true );
}
public void itemStateChanged(ItemEvent e)
{
JCheckBox checkbox = (JCheckBox) e.getSource();
			if (checkbox.isSelected()) {
				if (checkbox == c1) {
                    if(t1.getText().equals("")) {					
					sum = sum+(70);
					a1=1;
					}
					else {
					a1 = Integer.parseInt(t1.getText());
                    sum=sum+(a1*70);
					}					
				} else if (checkbox == c2) {
					if(t2.getText().equals("")) {					
					sum = sum+(89);
					a2=1;
					}
					else {
					a2 = Integer.parseInt(t2.getText());
                    sum=sum+(a2*89);
					}
				} else if (checkbox == c3) {
					if(t3.getText().equals("")) {					
					sum = sum+(165);
					a3=1;
					}
					else {
					a3 = Integer.parseInt(t3.getText());
                    sum=sum+(a3*165);
					}
				} else if (checkbox == c4) {
					if(t4.getText().equals("")) {					
					sum = sum+(32);
					a4=1;
					}
					else {
					a4 = Integer.parseInt(t4.getText());
                    sum=sum+(a4*32);
					}				
				} else if (checkbox == c5) {
					if(t5.getText().equals("")) {					
					sum = sum+(134);
					a5=1;
					}
					else {
					a5 = Integer.parseInt(t5.getText());
                    sum=sum+(a5*134);
					}
				} else if (checkbox == c6) {
					if(t6.getText().equals("")) {					
					sum = sum+(123);
					a6=1;
					}
					else {
					a6 = Integer.parseInt(t6.getText());
                    sum=sum+(a6*123);
					}					
				} else if (checkbox == c7) {
					if(t7.getText().equals("")) {					
					sum = sum+(27);
					a7=1;
					}
					else {
					a7 = Integer.parseInt(t7.getText());
                    sum=sum+(a7*27);
					}					
				} else if (checkbox == c8) {
					if(t8.getText().equals("")) {					
					sum = sum+(25);
					a8=1;
					}
					else {
					a8 = Integer.parseInt(t8.getText());
                    sum=sum+(a8*25);
					}					
				} else if (checkbox == c9) {
					if(t9.getText().equals("")) {					
					sum = sum+(30);
					a9=1;
					}
					else {
					a9 = Integer.parseInt(t9.getText());
                    sum=sum+(a9*30);
					}					
				} else if (checkbox == c10) {
					if(t10.getText().equals("")) {					
					sum = sum+(171);
					a10=1;
					}
					else {
					a10 = Integer.parseInt(t10.getText());
                    sum=sum+(a10*171);
					}					
				}
			} else {
				if (checkbox == c1) {
                    if(t1.getText().equals("")) {					
					sum = sum-(70);
					}
					else {
					a1 = Integer.parseInt(t1.getText());
                    sum=sum-(a1*70);
					}					
				} else if (checkbox == c2) {
					if(t2.getText().equals("")) {					
					sum = sum-(89);
					}
					else {
					a2 = Integer.parseInt(t2.getText());
                    sum=sum-(a2*89);
					}
				} else if (checkbox == c3) {
					if(t3.getText().equals("")) {					
					sum = sum-(165);
					}
					else {
					a3 = Integer.parseInt(t3.getText());
                    sum=sum-(a3*165);
					}
				} else if (checkbox == c4) {
					if(t4.getText().equals("")) {					
					sum = sum-(32);
					}
					else {
					a4 = Integer.parseInt(t4.getText());
                    sum=sum-(a4*32);
					}				
				} else if (checkbox == c5) {
					if(t5.getText().equals("")) {					
					sum = sum-(134);
					}
					else {
					a5 = Integer.parseInt(t5.getText());
                    sum=sum-(a5*134);
					}
				} else if (checkbox == c6) {
					if(t6.getText().equals("")) {					
					sum = sum-(123);
					}
					else {
					a6 = Integer.parseInt(t6.getText());
                    sum=sum-(a6*123);
					}					
				} else if (checkbox == c7) {
					if(t7.getText().equals("")) {					
					sum = sum-(27);
					}
					else {
					a7 = Integer.parseInt(t7.getText());
                    sum=sum-(a7*27);
					}					
				} else if (checkbox == c8) {
					if(t8.getText().equals("")) {					
					sum = sum-(25);
					}
					else {
					a8 = Integer.parseInt(t8.getText());
                    sum=sum-(a8*25);
					}					
				} else if (checkbox == c9) {
					if(t9.getText().equals("")) {					
					sum = sum-(30);
					}
					else {
					a9 = Integer.parseInt(t9.getText());
                    sum=sum-(a9*30);
					}					
				} else if (checkbox == c10) {
					if(t10.getText().equals("")) {					
					sum = sum-(171);
					}
					else {
					a10 = Integer.parseInt(t10.getText());
                    sum=sum-(a10*171);
					}					
				}
			}						
price.setText(String.valueOf(sum));
g=sum*(float)0.18;
gs.setText(String.valueOf(g));
tot=sum+g;
to.setText(String.valueOf(tot));

if (checkbox.isSelected()) {
				if (checkbox == c1) {
					item += "\nMcVeggie\t\tRs.70\t"+a1;
				} else if (checkbox == c2) {
					item += "\nMcChicken\t\tRs.89\t"+a2;
				} else if (checkbox == c3) {
					item += "\nPaneer wrap\t\tRs.165\t"+a3;
				} else if (checkbox == c4) {
					item += "\nMcAloo Tikki\t\tRs.32\t"+a4;
				} else if (checkbox == c5) {
					item += "\nChicken McGrill\t\tRs.134\t"+a5;
				} else if (checkbox == c6) {
					item += "\nMcSpicy Paneer\t\tRs.123\t"+a6;
				} else if (checkbox == c7) {
					item += "\nIced Tea\t\tRs.27\t"+a7;
				} else if (checkbox == c8) {
					item += "\nSoft Serve\t\tRs.25\t"+a8;
				} else if (checkbox == c9) {
					item += "\nCoke\t\tRs.30\t"+a9;
				} else if (checkbox == c10) {
					item += "\nMaharaja Mac\t\tRs.171\t"+a10;
				}
			}	
}
public void actionPerformed(ActionEvent e)
{
nam = nameinput.getText();
if(e.getSource()== generate)
{
		receipt.setText( "- - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - -" +"\nRetail Invoice\t\twww.mcdonaldsindia.net" + "\n- - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - -" + "\n\t\tDate: 31/10/2017" + "\nMCDONALD'S\n" + "Lady Jamshedji Rd, Mahim(West), Mumbai-400016\nINV#009201200000164\tUID#009201217000279\n\n" +
                       "CUSTOMER NAME :  " + nam + "\n\nOrdered Meals:\t\tPrice:\tQuantity:\n" + "-  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -" + item + "\n-  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -" + "\n\nSubTotal :  " + sum + "\nGST 18%(SGST 9% + CGST 9%) :  " + g + "\nTotal :  " + tot +
                       "\n-- THANK YOU! VISIT AGAIN --");
String filename = "CompletedData.txt";

FileWriter writer = null;
    try {
      writer = new FileWriter(filename);
      receipt.write(writer);
    } catch (IOException exception) {
      System.err.println("Save oops");
    } finally {
      if (writer != null) {
        try {
          writer.close();
        } catch (IOException exception) {
          System.err.println("Error closing writer");
          exception.printStackTrace();
        }
      }
    }					   					   					   
}
if(e.getSource()== clear)
{
c1.setSelected(false);
c2.setSelected(false);
c3.setSelected(false);
c4.setSelected(false);
c5.setSelected(false);
c6.setSelected(false);
c7.setSelected(false);
c8.setSelected(false);
c9.setSelected(false);
c10.setSelected(false);
t1.setText("");
t2.setText("");
t3.setText("");
t4.setText("");
t5.setText("");
t6.setText("");
t7.setText("");
t8.setText("");
t9.setText("");
t10.setText("");
g=0;
sum=0;
tot=0;
price.setText(String.valueOf(sum));
gs.setText(String.valueOf(g));
to.setText(String.valueOf(tot));
nameinput.setText("");
item=" ";
receipt.setText( "Please enter customer's name and select any food item" );
}
if(e.getSource()==exit)
{
System.exit(0);
}
if(e.getSource()== print)
{
try {
Desktop.getDesktop().open(new java.io.File("C:\\Users\\Shubham\\Desktop\\JAVA_PROJECT\\CompletedData.txt"));
}
catch (IOException exception) {
System.err.println("Error closing writer");
exception.printStackTrace();
}
}
}
public static void main(String args[])
{
new Project1();
}
}