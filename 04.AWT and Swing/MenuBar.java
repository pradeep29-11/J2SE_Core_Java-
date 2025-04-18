import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class MenuBar extends JFrame implements ActionListener
{
	JMenuBar mbr;
	JMenu mStudent;

	JMenuItem miAddStudent,miDisplayStudent,miExit;

	MenuBar()
	{
		setLayout(null);

		mbr=new JMenuBar();
		mbr.setSize(500,300);
		mbr.setLocation(0,0);
		add(mbr);

		mStudent=new JMenu("Student");
		mbr.add(mStudent);

		miAddStudent=new JMenuItem("Add Student");
		miAddStudent.addActionListener(this);
		mStudent.add(miAddStudent);

		miDisplayStudent=new JMenuItem("Display Student");
		miDisplayStudent.addActionListener(this);
		mStudent.add(miAddStudent);
		mStudent.add(miDisplayStudent);
		mStudent.addSeparator();

		miExit=new JMenuItem("Exit");
		miExit.addActionListener(this);
		mStudent.add(miExit);

		setTitle("TCA Pvr. LTD");
		setSize(500,500);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	public void actionPerformed(ActionEvent ae)
	{
		String s=(String)ae.getActionCommand();

		if(s.equals("Add Student"))
		{
			JOptionPane.showMessageDialog(null,"Student Information Saved Succeddfully !!!");
		}
		if(s.equals("Display Student"))
		{
			JOptionPane.showMessageDialog(null,"Displaying Student Information !!!");
		}
		if(s.equals("Exit"))
		{
			JOptionPane.showMessageDialog(null,"Bye bye Good Night");	
		}
	}

	public static void main(String args[])
	{
		MenuBar ob = new MenuBar();
	}
}
