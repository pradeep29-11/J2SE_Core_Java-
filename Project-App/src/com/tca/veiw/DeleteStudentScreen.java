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

public class DeleteStudentScreen extends JFrame implements ActionListener
{
	JLabel lRno,lName, lPer;
	JTextField tfRno, tfName, tfPer;
	JButton bSearch,bDelete;
	
	public DeleteStudentScreen()
	{
		setLayout(null);
		lRno = new JLabel("Roll Number :");
		lRno.setSize(100,30);
		lRno.setLocation(30, 30);
		add(lRno);
		
		tfRno = new JTextField();
		tfRno.setSize(200,30);
		tfRno.setLocation(150 ,30);
		add(tfRno);
		
		lName = new JLabel("Name :");
		lName.setSize(100,30);
		lName.setLocation(30,80);
		add(lName);
		
		tfName = new JTextField();
		tfName.setSize(200,30);
		tfName.setLocation(150,80);
		tfName.setEditable(false);
		add(tfName);
		
		
		lPer = new JLabel("Percentage :");
		lPer.setSize(100,30);
		lPer.setLocation(30,130);
		add(lPer);
		
		tfPer = new JTextField();
		tfPer.setSize(200,30);
		tfPer.setLocation(150,130);
		tfPer.setEditable(false);
		add(tfPer);
		
		bSearch = new JButton("Search");
		bSearch.setSize(100,30);
		bSearch.setLocation(60, 190);
		bSearch.addActionListener(this);
		add(bSearch);
		
		bDelete = new JButton("Delete");
		bDelete.setSize(100, 30);
		bDelete.setLocation(200,190);
		bDelete.addActionListener(this);
		add(bDelete);
		
		setTitle("TCA - Delete Student");
		setSize(400,300);
		setVisible(true);
		setResizable(false);
		setLocation(400,300);
	}

	@Override
	public void actionPerformed(ActionEvent e) 
	{
		String command = e.getActionCommand();
		
		if(command.equals("Search"))
		{
			int rno = Integer.parseInt(tfRno.getText());
			
			StudentDao dao = new StudentDao();
			Student ob = dao.searchStudent(rno); 
			
			if(ob == null)
			{
				JOptionPane.showMessageDialog(null,"No Data Found For Roll No : "+rno);
			}
			else 
			{
				tfName.setText(ob.getStudentName());
				tfPer.setText(Double.toString(ob.getStudentPer()));
			}
			
		}
		if(command.equals("Delete"))
		{
			int rno = Integer.parseInt(tfRno.getText());
			
			StudentDao dao = new StudentDao();
			boolean status = dao.deleteStudent(rno);
			
			if(status == true)
			{
				JOptionPane.showMessageDialog(null,"Record is Deleted for Roll No : "+rno);
			}
			else 
			{
				JOptionPane.showMessageDialog(null,"Unable to Delete Record for Roll No : "+rno);
			}
			
			tfRno.setText("");
			tfName.setText("");
			tfPer.setText("");
			tfRno.requestFocus();
		}
	}
}
