package com.app.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name="card")
public class Card extends Payment{
	
	private int cardno;
	private String cardtype;
	public int getCardno() {
		return cardno;
	}
	public void setCardno(int cardno) {
		this.cardno = cardno;
	}
	public String getCardtype() {
		return cardtype;
	}
	public void setCardtype(String cardtype) {
		this.cardtype = cardtype;
	}
	
	

}
