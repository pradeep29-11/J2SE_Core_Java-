package com.tca.veiw;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

import com.tca.dao.StudentDao;
import com.tca.entities.Student;

public class DisplayStudentScreen  extends JFrame implements ActionListener
{
	JLabel lRno,lName,lPer;
	JTextField tfRno,tfName,tfPer;
	JButton bShow,bClear;
	
	public DisplayStudentScreen()
	{
		setLayout(null);
		
		lRno = new JLabel("Roll No :");
		lRno.setSize(100,30);
		lRno.setLocation(30,30);
		add(lRno);
		
		
		tfRno = new JTextField();
		tfRno.setSize(100,30);
		tfRno.setLocation(120,30);
		add(tfRno);
		
		lName = new JLabel("Name :");
		lName.setSize(100,30);
		lName.setLocation(30,80);
		add(lName);
		
		tfName = new JTextField();
		tfName.setSize(100,30);
		tfName.setLocation(120,80);
		add(tfName);
		
		lPer = new JLabel("Percentage :");
		lPer.setSize(100,30);
		lPer.setLocation(30,130);
		add(lPer);
		
		tfPer = new JTextField();
		tfPer.setSize(100,30);
		tfPer.setLocation(120,130);
		add(tfPer);
		
		bShow = new JButton("Show");
		bShow.setSize(100,30);
		bShow.setLocation(60, 190);
		bShow.addActionListener(this);
		add(bShow);
		
		bClear = new JButton("Clear");
		bClear.setSize(100, 30);
		bClear.setLocation(200,190);
		bClear.addActionListener(this);
		add(bClear);
		
		setTitle("TCA-Add Student");
		setSize(400,500);
		setVisible(true);
		setResizable(false);
		setLocation(400,300);
	}

	@Override
	public void actionPerformed(ActionEvent e) 
	{
		String command  = e.getActionCommand();
		
		if(command.equals("Show"))
		{
			int rno = Integer.parseInt(tfRno.getText());
			
			StudentDao ob = new StudentDao();
			Student s = ob.searchStudent(rno);
			
			if(s == null)
			{
				JOptionPane.showMessageDialog(null,"No Data Foun For Roll No : "+rno); 
			}
			else
			{
				tfName.setText(s.getStudentName());
				tfPer.setText(Double.toString(s.getStudentPer()));
			}
		}
		if(command.equals("Clear"))
		{
			tfRno.setText("");
			tfName.setText("");
			tfPer.setText("");
			tfRno.requestFocus();
		}
	}
	
}
