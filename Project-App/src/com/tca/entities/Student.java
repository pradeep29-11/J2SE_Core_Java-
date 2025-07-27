package com.tca.entities;

public class Student 
{
	private int    studentRollNo;
	private String studentName;
	private float  studentPer;
	
	public Student()
	{}

	
	public Student(int studentRollNo, String studentName, float studentPer) 
	{
		super();
		this.studentRollNo = studentRollNo;
		this.studentName = studentName;
		this.studentPer = studentPer;
	}


	public void setStudentRollNo(int studentRollNo)
	{
		this.studentRollNo=studentRollNo;
	}
	public void setStudentName(String studentName)
	{
		this.studentName=studentName;
	}
	public void setStudentPer(float studentPer)
	{
		this.studentPer=studentPer;
	}
	public int getStudentRollNo()
	{
		return studentRollNo;
	}
	
	public String getStudentName()
	{
		return studentName;
	}
	public float getStudentPer()
	{
		return studentPer;
	}

	
	
	

}
