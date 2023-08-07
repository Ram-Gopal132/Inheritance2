package com.app;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.app.entity.Card;
import com.app.entity.Cheque;
import com.app.entity.Payment;
import com.app.util.HibernateUtil;

public class FirstActivity
{
	public static void main(String[] args) 
	{
		Transaction transaction=null;
		
		try (Session session=HibernateUtil.getSessionFactory().openSession())
		{
			Payment p=new Payment();
			p.setAmount(80000);
			
			
			Card card=new Card();
			card.setAmount(70000);
			card.setCardno(1008);
			card.setCardtype("Rupay");
			
			
			Cheque chk=new Cheque();
			chk.setAmount(40000);
			
			chk.setChqueno(6007);
			chk.setChquetype("Order");
			
			transaction=session.beginTransaction();
			
			session.persist(p);
			session.persist(chk);
			session.persist(card);
			
			transaction.commit();
			
			System.out.println("Record Inserted");
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("Reason of error"+e.getMessage());
		}
		
	}
}