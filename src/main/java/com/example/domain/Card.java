package com.example.domain;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
public class Card {

	
	//private String id;
	private int cardNumber ; 
	private String userName;
	private boolean cardStatus;
//	private User user;
	
	@Temporal(TemporalType.DATE)
	Date expiryDate;
	
	/*public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}*/

	@Id
	public int getCardNumber() {
		return cardNumber;
	}

	public void setCardNumber(int cardNumber) {
		this.cardNumber = cardNumber;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}
	
	public boolean isCardStatus() {
		return cardStatus;
	}



	public void setCardStatus(boolean cardStatus) {
		this.cardStatus = cardStatus;
	}

//
//	@ManyToOne(fetch=FetchType.LAZY)
//	@JoinColumn(name="user_id")
/*	public User getUser() {
		return user;
	}



	public void setUser(User user) {
		this.user = user;
	}
*/


	public Card(){}

	
	
	
}
