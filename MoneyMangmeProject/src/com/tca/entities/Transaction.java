package com.tca.entities;

import java.time.LocalDate;

public class Transaction 
{
	public static int n;
	private LocalDate date;
	private String description;
	private double amount;
	private String isIncome;
	
	public Transaction()
	{
		
	}

	public Transaction( String description, double amount, String isIncome) 
	{
		this.date = LocalDate.now();
		this.description = description;
		this.amount = amount;
		this.isIncome = isIncome;
		n=n+1;
	}
	public Transaction(int s,LocalDate date,String description, double amount, String isIncome) 
	{
		this.date = date;
		this.description = description;
		this.amount = amount;
		this.isIncome = isIncome;
	}

	
	public void setDescription(String description) 
	{
		this.description = description;
	}
	
	public void setAmount(double amount) 
	{
		this.amount = amount;
	}
	
	public void setIncome(String isIncome) 
	{
		this.isIncome = isIncome;
	}
	
	public LocalDate getDate() 
	{
		return date;
	}

	public String getDescription() 
	{
		return description;
	}

	public double getAmount() 
	{
		return amount;
	}

	public String isIncome() 
	{
		return isIncome;
	}
	public int getSerial()
	{
		return n;
	}

	public String toFileString() 
	{
		return  date +","+ description +","+ amount +","+ isIncome;
	}
	
}
