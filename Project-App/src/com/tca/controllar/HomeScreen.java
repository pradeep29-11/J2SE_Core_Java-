package com.tca.controllar;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;

import com.tca.veiw.AddStudentScreen;
import com.tca.veiw.DeleteStudentScreen;
import com.tca.veiw.DisplayStudentScreen;
import com.tca.veiw.UpdateStudentScreen;

public class HomeScreen extends JFrame implements ActionListener
{
	JMenuBar mbr;
	JMenu  mStudent, mTeacher, mFees;
	JMenuItem miAddStudent, miDisplayStudent, miDeleteStudent, miUpdateStudent,miExit;
	
	public HomeScreen()
	{
		setLayout(null);
		
		mbr = new JMenuBar();
		mbr.setSize(1200,30);
		mbr.setLocation(0,0);
		add(mbr);
		
		mStudent = new JMenu("Student");
		mbr.add(mStudent);
		
		mTeacher = new JMenu("Teacher");
		mbr.add(mTeacher);
		
		 mFees = new JMenu("Fees");
		 mbr.add(mFees);
		
		miAddStudent = new JMenuItem("Add Student");
		miAddStudent.addActionListener(this);
		mStudent.add(miAddStudent);
		
		miDisplayStudent = new JMenuItem("Display Student");
		miDisplayStudent.addActionListener(this);
		mStudent.add(miDisplayStudent);
		
		miDeleteStudent = new JMenuItem("Delete Student");
		miDeleteStudent.addActionListener(this);
		mStudent.add(miDeleteStudent);
		
		miUpdateStudent = new JMenuItem("Update Student");
		miUpdateStudent.addActionListener(this);
		mStudent.add(miUpdateStudent);
		
		miExit = new JMenuItem("EXIT");
		miExit.addActionListener(this);
		mStudent.add(miExit);
		
		setTitle("TCA--Home Screen");
		setSize(1200,800);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	@Override
	public void actionPerformed(ActionEvent e) 
	{
		String command = e.getActionCommand();
		
		if(command.equals("Add Student"))
		{
			AddStudentScreen ob = new AddStudentScreen();
		}
		if(command.equals("Display Student"))
		{
			DisplayStudentScreen ob = new DisplayStudentScreen();
		}
		if(command.equals("Delete Student"))
		{
			DeleteStudentScreen ob = new DeleteStudentScreen();
		}
		if(command.equals("Update Student"))
		{
			UpdateStudentScreen ob = new UpdateStudentScreen();
		}
		if(command.equals("EXIT"))
		{
			JOptionPane.showMessageDialog(null, "Shuting Down....!!");
			System.exit(0);
		}
	}
	

}
