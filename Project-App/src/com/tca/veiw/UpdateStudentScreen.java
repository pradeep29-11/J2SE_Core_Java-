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

public class UpdateStudentScreen extends JFrame implements ActionListener
{
	JLabel lRno,lName, lPer;
	JTextField tfRno, tfName, tfPer;
	JButton bSearch,bUpdate;
	
	public UpdateStudentScreen()
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
		//tfName.setEditable(false);
		add(tfName);
		
		
		lPer = new JLabel("Percentage :");
		lPer.setSize(100,30);
		lPer.setLocation(30,130);
		add(lPer);
		
		tfPer = new JTextField();
		tfPer.setSize(200,30);
		tfPer.setLocation(150,130);
		add(tfPer);
		
		bSearch = new JButton("Search");
		bSearch.setSize(100,30);
		bSearch.setLocation(60, 190);
		bSearch.addActionListener(this);
		add(bSearch);
		
		bUpdate = new JButton("Update");
		bUpdate.setSize(100, 30);
		bUpdate.setLocation(200,190);
		bUpdate.addActionListener(this);
		add(bUpdate);
		
		setTitle("TCA - UPdate Student");
		setSize(400,300);
		setVisible(true);
		setResizable(false);
		setLocation(400,300);
	}
	@Override
	public void actionPerformed(ActionEvent ae)
	{
		String command = ae.getActionCommand();
		
		if(command.equals("Search"))
		{
			int rno = Integer.parseInt(tfRno.getText());
			
			StudentDao ob = new StudentDao();
			
			Student s = ob.searchStudent(rno);
			
			if(s == null)
			{
				JOptionPane.showMessageDialog(null, "No Data Found for Roll Num:" + rno);
			}
			else 
			{
				tfName.setText(s.getStudentName());
				tfPer.setText(Double.toString(s.getStudentPer()));
			}
			
		}
		if(command.equals("Update"))
		{
			String rno = tfRno.getText();
			String name = tfName.getText();
			String per = tfPer.getText();
			
			if(rno.isEmpty() || name.isEmpty() || per.isEmpty())
			{
				JOptionPane.showMessageDialog(null, "Some Records are Empty !!");
				return;
			}
			int trno = Integer.parseInt(rno);
			String tname = name;
			float tper = Float.parseFloat(per);
			
			StudentDao dao = new StudentDao();
			boolean status = dao.updateStudent(trno, tname, tper);
			
			if(status == true)
			{
				JOptionPane.showMessageDialog(null, "Record Updated Successfully for Roll number :" + trno);
			}
			else 
			{
				JOptionPane.showMessageDialog(null, "Unable to Update Record for Roll number :" + trno);
			}
			
			tfRno.setText("");
			tfName.setText("");
			tfPer.setText("");
			tfRno.requestFocus();
		}
	}
}
