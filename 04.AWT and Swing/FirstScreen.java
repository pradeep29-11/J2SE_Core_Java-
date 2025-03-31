import java.awt.event.*;
import javax.swing.*;

public class FirstScreen extends JFrame implements ActionListener
{
	JLabel l;
	JTextField tf;
	JButton b1,b2;

	FirstScreen()
	{
		setLayout(null);

		l=new JLabel("Message : ");
		l.setSize(100,30);
		l.setLocation(50,30);
		add(l);

		tf=new JTextField();
		tf.setSize(200,30);
		tf.setLocation(180,30);
		add(tf);

		b1=new JButton("Show");
		b1.setSize(100,30);
		b1.setLocation(90,80);
		b1.addActionListener(this);
		add(b1);

		b2=new JButton("Clear");
		b2.setSize(100,30);
		b2.setLocation(230,80);
		b2.addActionListener(this);
		add(b2);

		setTitle("Pradeep");
		setSize(450,200);
		setLocation(300,200);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}
	public void actionPerformed(ActionEvent ae)
	{
		String s=(String)ae.getActionCommand();

		if(s.equals("Show"))
		{
			tf.setText("India is My Country");
		}
		if(s.equals("Clear"))
		{
			tf.setText("");
		}
	}
	public static void main(String args[])
	{
		FirstScreen ob = new FirstScreen();
	}
}