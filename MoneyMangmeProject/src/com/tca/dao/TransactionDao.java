package com.tca.dao;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import com.tca.confi.Configuration;
import com.tca.entities.Transaction;

public class TransactionDao 
{
	public boolean saveTransaction(Transaction ob) 
	{
	    FileWriter fw = null;
	    try 
	    {
	       
	        double currentBalance = availableBalance() - spendMoney();
	        
	        if (ob.isIncome().equals("expense") && currentBalance < ob.getAmount()) 
	        {
	            System.out.println("Insufficient Balance !!");
	            return false;
	        }
	        int max=0;
	        fw = new FileWriter("rs.csv",true); 

	        fw.write(Transaction.n + "," + ob.getDate() + "," + ob.getDescription() + "," +ob.getAmount() + "," + ob.isIncome() + "\n");
	        Transaction.n++;
	        
	        if(Transaction.n>max)
	        {
	        	max = Transaction.n;
	        }
	        
	        Transaction.n = max + 1;
	        System.out.println("Transaction saved successfully.");
	        return true;

	    } 
	    catch (Exception e) 
	    {
	        System.out.println("Error while saving transaction.");
	        e.printStackTrace();
	        return false;

	    }
	    finally 
	    {
	        try 
	        {
	            if (fw != null) fw.close();
	        } 
	        catch (Exception e) 
	        {
	            e.printStackTrace();
	        }
	    }
	}

	
	public void saveAllTransaction(List<Transaction> L)
	{
		for(Transaction s : L)
		{
			saveTransaction(s);
		}
	}
	public List<Transaction> getAllTransaction()
	{
		FileReader fr = null;
		List<Transaction> L = new  ArrayList<>();
		BufferedReader br = null;
		
		try 
		{
			fr = new FileReader("rs.csv");
			br = new BufferedReader(fr);
			
			
			
			while(true)
			{
				String line = br.readLine();
				
				if(line == null)
				{
					break;
				}
				String a[] = line.split(",");
				
				int s = Integer.parseInt(a[0]);
				LocalDate date = LocalDate.parse(a[1]);
				String description = a[2];
				double amount = Double.parseDouble(a[3]);
				String isIncome = a[4];
				
				Transaction ob = new Transaction(s,date,description,amount,isIncome);
				
				L.add(ob);
				
			}
			
		}
		catch(Exception ae)
		{
			ae.printStackTrace();
			return null;
		}
		
		return L; 
	}
	
	public double availableBalance()
	{
		List<Transaction> L = getAllTransaction();
		double totalAmount = 0;
		for(Transaction ob : L)
		{
			if(ob.isIncome().equals("income"))
			{
				totalAmount += ob.getAmount();
			}
		}
		return totalAmount;
	}
	public double spendMoney()
	{
		List<Transaction> L = getAllTransaction();
		double totalAmount = 0;
		for(Transaction ob : L)
		{
			if(ob.isIncome().equals("expense"))
			{
				totalAmount += ob.getAmount();
			}
		}
		return totalAmount;
		
	}
	
	public boolean deleteTransaction(String des,String isIncome)
	{
		List<Transaction> L = getAllTransaction();
		
		for(Transaction ob : L)
		{
			if(des.equals(ob.getDescription()))
			{
				L.remove(ob);
				
				File f = new File("rs.csv");
				f.delete();
				try 
				{
					f.createNewFile();
					saveAllTransaction(L);
				}
				catch(Exception ae)
				{
					ae.printStackTrace();
					return false;
				}
				return true;
			}
		}
		return true;
	}
}

