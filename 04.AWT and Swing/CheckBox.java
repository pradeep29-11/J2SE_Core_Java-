import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class CheckBox extends JFrame implements ActionListener
{
	JCheckBox cb1,cb2,cb3,cb4;
	JTextField tf;
	JButton j;

	CheckBox()
	{
		setLayout(null);

		cb1=new JCheckBox("Music");
		cb1.setSize(100,30);
		cb1.setLocation(30,30);
		cb1.addActionListener(this);
		add(cb1);

		cb2=new JCheckBox("Dance");
		cb2.setSize(100,30);
		cb2.setLocation(30,60);
		cb2.addActionListener(this);
		add(cb2);

		cb3=new JCheckBox("Sport");
		cb3.setSize(100,30);
		cb3.setLocation(30,90);
		cb3.addActionListener(this);
		add(cb3);

		cb4=new JCheckBox("Reading");
		cb4.setSize(100,30);
		cb4.setLocation(30,120);
		cb4.addActionListener(this);
		add(cb4);

		tf=new JTextField();
		tf.setSize(100,30);
		tf.setLocation(150,60);
		tf.setEditable(false);
		add(tf);

		j=new JButton("OK");
		j.setSize(100,30);
		j.setLocation(30,150);
		j.addActionListener(this);
		add(j);

		setSize(450,300);
		setLocation(100,200);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	public void actionPerformed(ActionEvent ae)
	{
		String s=(String)ae.getActionCommand();
		if(s.equals("OK"))
		{
			String str="";
			if(cb1.isSelected())
			{
				str=str+cb1.getText()+" ";
			}
			if(cb2.isSelected())
			{
				str=str+cb2.getText()+" ";
			}
			if(cb3.isSelected())
			{
				str=str+cb3.getText()+" ";
			}
			if(cb4.isSelected())
			{
				str=str+cb4.getText()+" ";
			}
			tf.setText(str);
		}
	}
	public static void main(String args[])
	{
		CheckBox ob = new CheckBox();
	}
}