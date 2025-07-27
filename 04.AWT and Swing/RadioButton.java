import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class RadioButton extends JFrame implements ActionListener
{
	JRadioButton rb1,rb2,rb3;
	ButtonGroup bg;
	JTextField tf;

	RadioButton()
	{
		setLayout(null);

		rb1=new JRadioButton("FY");
		rb1.setSize(100,30);
		rb1.setLocation(30,30);
		rb1.addActionListener(this);
		add(rb1);

		rb2=new JRadioButton("SY");
		rb2.setSize(100,30);
		rb2.setLocation(30,60);
		rb2.addActionListener(this);
		add(rb2);

		rb3=new JRadioButton("TY");
		rb3.setSize(100,30);
		rb3.setLocation(30,90);
		rb3.addActionListener(this);
		add(rb3);

		bg=new ButtonGroup();
		bg.add(rb1);
		bg.add(rb2);
		bg.add(rb3);

		tf=new JTextField();
		tf.setSize(100,30);
		tf.setLocation(40,130);
		add(tf);

		setSize(450,300);
		setLocation(100,30);
		setTitle("RadioButton");
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	public void actionPerformed(ActionEvent ae)
	{
		String s=(String)ae.getActionCommand();
		
		tf.setText(s);
	}
	public static void main(String args[])
	{
		RadioButton ob = new RadioButton();
	}
}