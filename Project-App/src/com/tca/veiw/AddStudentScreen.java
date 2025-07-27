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

public class AddStudentScreen extends JFrame implements ActionListener
{
	JLabel lRno,lName,lPer;
	JTextField tfRno,tfName,tfPer;
	JButton bSave,bClear;
	
	public AddStudentScreen()
	{
		setLayout(null);
		
		lRno = new JLabel("Roll Number :");
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
		
		bSave = new JButton("Save");
		bSave.setSize(100,30);
		bSave.setLocation(60, 190);
		bSave.addActionListener(this);
		add(bSave);
		
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
	public void actionPerformed(ActionEvent ae) /*ae --> sang kontya butanavar click kelai ?*/
	{
		String command = ae.getActionCommand();
		
		if(command.equals("Save"))
		{
			int rno = Integer.parseInt(tfRno.getText());
			String name = tfName.getText();
			float per = Float.parseFloat(tfPer.getText());
			
			Student s = new Student(rno,name,per);
			
			StudentDao ob = new StudentDao();
			boolean status = ob.save(s);
			
			if(status == true)
			{
				JOptionPane.showMessageDialog(null,"Data is Saved Succesfully for Roll Num:"+ rno);
			}
			else 
			{
				JOptionPane.showMessageDialog(null, "Unable to Save Student for Roll Num:"+rno);
			}
			tfRno.setText("");
			tfName.setText("");
			tfPer.setText("");
			tfRno.requestFocus();			
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
