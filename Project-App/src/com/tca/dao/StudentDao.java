package com.tca.dao;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.List;

import com.tca.confi.Configuration;
import com.tca.entities.Student;

public class StudentDao 
{
	public boolean save(Student ob)
	{
		FileWriter fw = null;
		try 	
		{
			
			int rno = ob.getStudentRollNo();
			String name = ob.getStudentName();
			float per = ob.getStudentPer();
			
			fw = new FileWriter("rs.csv",true);
			
			fw.write(rno+","+name+","+per+"\n");
			
		}
		catch(Exception ae)
		{
			System.out.println("False");
			return false;
		}
		finally 
		{
			try 
			{
				fw.close();
			}
			catch(Exception ae)
			{
				
			}
		}
		return true;
			
	}
	
	public void saveAll(List<Student> l) 
	{
		for(Student ob : l)
		{
			save(ob);
		}
		
	}
	public List<Student> getAllStudent()
	{
		List<Student> L = new ArrayList<>();
		FileReader fr = null;
		BufferedReader br = null;
		try 
		{
			fr = new FileReader(Configuration.File_Name);
			br = new BufferedReader(fr);
			
			while(true)
			{
				String line = br.readLine();
				
				if(line==null)
				{
					break;
				}
				String a[] = line.split(",");
				
				int rno = Integer.parseInt(a[0]);
				String name = a[1];
				float per = Float.parseFloat(a[2]);
				
				Student ob = new Student(rno,name,per);
				
				L.add(ob);
			}
			
		}
		catch(Exception ae)
		{
			ae.printStackTrace();
			return null;
		}
		finally 
		{
			try 
			{
				fr.close();
				br.close();
			}
			catch(Exception ae)
			{
				ae.printStackTrace();
			}
		}
		
		
		return L;
	}
	public Student searchStudent(int rno)
	{
		List<Student> L = getAllStudent();
		
		if(L==null)
		{
			return null;
		}
		for(Student ob : L)
		{
			if(ob.getStudentRollNo() == rno)
			{
				return ob;
			}
		}
		return null;
	}
	
	public boolean deleteStudent(int rno)
	{
		List<Student> L = getAllStudent();
		
		for(Student ob : L)
		{
			if(ob.getStudentRollNo() == rno)
			{
				L.remove(ob);
				
				File f = new File(Configuration.File_Name);
				f.delete();
				
				try 
				{
					f.createNewFile();
					saveAll(L);
				}
				catch(Exception ae)
				{
					ae.printStackTrace();
					return false;
				}
				return true;
			}
		}
		return false;
	}
	public boolean updateStudent(int rno,String name,float per)
	{
		List<Student> L = getAllStudent();
		
		for(Student ob : L)
		{
			if(ob.getStudentRollNo() == rno)
			{
				ob.setStudentName(name);
				ob.setStudentPer(per);
				
				File f = new File(Configuration.File_Name);
				f.delete();
				
				try 
				{
					f.createNewFile();
					saveAll(L);
				}
				catch(Exception ae)
				{
					ae.printStackTrace();
					return false;
				}
				return true;
			}
		}
		return false;
	}
}
