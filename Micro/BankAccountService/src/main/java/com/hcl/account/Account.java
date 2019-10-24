package com.hcl.account;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="account")
public class Account implements Serializable{
 
	
	private static final long serialVersionUID = 1L;
	 @Id
     private int accno;
	 private double amount;
	 private char accounttype;
	 private int userid;
	
	@Column(name="accno")
    public int getAccNo() {
		return accno;
	}
	public void setAccNo(int accno) {
		this.accno = accno;
	}
	
	@Column(name="amount")
    public double getAmount() {
		return amount;
	}
	public void setAmount(double amount) {
		this.amount = amount;
	}
	
	@Column(name="accounttype")
	public char getAccountType() {
		return accounttype;
	}
	public void setAccountType(char accounttype) {
		this.accounttype = accounttype;
	}
	
	@Column(name="userid ")
	public int getUserId() {
		return userid;
	}
	public void setUserId(int userid) {
		this.userid = userid;
	}
	@Override
	public String toString() {
		return "Account [accno=" + accno + ", amount=" + amount + ", accounttype=" + accounttype + ", userid=" + userid
				+ "]";
	}
	
 
}
