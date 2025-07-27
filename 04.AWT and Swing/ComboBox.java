import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class ComboBox extends JFrame implements ItemListener
{
	JComboBox cdx;
	JTextField tf;

	ComboBox()
	{
		setLayout(null);

		String s[]={"C","C++","Java","Hibernate","Spring","Python"};

		cdx=new JComboBox(s);
		cdx.setSize(100,30);
		cdx.setLocation(30,30);
		cdx.addItemListener(this);
		add(cdx);

		tf=new JTextField();
		tf.setSize(100,30);
		tf.setLocation(30,80);
		add(tf);

		setSize(450,300);
		setLocation(100,100);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	public void itemStateChanged(ItemEvent ie)
	{
		String s=(String)cdx.getSelectedItem();

		tf.setText(s);
	}
	public static void main(String args[])
	{
		ComboBox ob = new ComboBox();
	}
}