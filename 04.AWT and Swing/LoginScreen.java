import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class LoginScreen extends JFrame implements ActionListener
{
	JLabel l1,l2;
	JTextField tf;
	JPasswordField pf;
	JButton b1,b2;
	LoginScreen()
	{
		setLayout(null);

		l1=new JLabel("Login         : ");
		l1.setSize(100,30);
		l1.setLocation(100,50);
		add(l1);

		tf=new JTextField();
		tf.setSize(200,30);
		tf.setLocation(180,50);
		add(tf);


		l2=new JLabel("Password   : ");
		l2.setSize(100,30);
		l2.setLocation(100,100);
		add(l2);

		pf=new JPasswordField();
		pf.setSize(200,30);
		pf.setLocation(180,100);
		add(pf);

		b1=new JButton("Login");
		b1.setSize(100,20);
		b1.setLocation(120,150);
		b1.addActionListener(this);
		add(b1);

		b2=new JButton("CANCEL");
		b2.setSize(100,20);
		b2.setLocation(250,150);
		b2.addActionListener(this);
		add(b2);

		setSize(450,300);
		setLocation(300,200);
		setVisible(true);
		setTitle("Instagram");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	public void actionPerformed(ActionEvent ae)
	{
		String s=(String)ae.getActionCommand();

		if(s.equals("Login"))
		{
			String l=tf.getText();
			String p=pf.getText();

			if(l.equals("Sachine") && p.equals("tca"))
			{
				this.dispose();
				JOptionPane.showMessageDialog(null,"Login Successfull !!");
				new FirstScreen();
			}
			else
			{
				JOptionPane.showMessageDialog(null,"Login Faild !!");
				tf.requestFocus();

			}
		}
		if(s.equals("CANCEL"))
		{
			System.exit(0);
		}
	}
	public static void main(String args[])
	{
		LoginScreen ob = new LoginScreen();
	}
}