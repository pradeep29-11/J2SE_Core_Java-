package com.tca;

import java.util.ArrayList;
import java.util.List;

import com.tca.confi.Configuration;
import com.tca.dao.TransactionDao;
import com.tca.entities.Transaction;

public class Main 
{
	public static void main(String[] args) 
	{
		
		System.out.println("=========================================================");
		
		List<Transaction> L = new ArrayList<>();
	
		//Transaction ob1 = new Transaction("bonus",110,"expense");
		//Transaction ob2 = new Transaction("bonus",1000,true);
		
		//L.add(ob1);
		//L.add(ob2);
		
		
		
		Transaction ob1 = new Transaction("Amount",2000,"income");
		TransactionDao ob = new TransactionDao();
		//ob.deleteTransaction("bonus","expense");
		ob.saveTransaction(ob1);
		
		//ob.deleteTransaction("Amount","income");
		System.out.println("Available   : "+ob.availableBalance());
		System.out.println("Spend Money : "+ob.spendMoney());
		
		
		/*
		TransactionDao dao = new TransactionDao();
		
		List<Transaction> L = dao.getAllTransaction();
		
		for(Transaction ob : L)
		{
			System.out.println(ob.getDate());
		}
		*/
	}

}
