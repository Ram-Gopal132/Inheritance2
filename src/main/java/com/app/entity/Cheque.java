package com.app.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name="Cheque")
public class Cheque extends Payment {
	
	private int chqueno;
	
	private String chquetype;

	public int getChqueno() {
		return chqueno;
	}

	public void setChqueno(int chqueno) {
		this.chqueno = chqueno;
	}

	public String getChquetype() {
		return chquetype;
	}

	public void setChquetype(String chquetype) {
		this.chquetype = chquetype;
	}
	
	

}
