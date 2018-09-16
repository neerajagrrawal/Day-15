package com.capgemini.bankapplication.database;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;

import com.capgemini.bankapplication.model.BankAccount;
import com.capgemini.bankapplication.model.Customer;

public class Database {
	public static ArrayList<Customer> customerSet;
	/*static BankAccount b1=new BankAccount(123, "Savings", 1000) ;
	static Customer c1=new Customer(321, "Neeraj", "neeraj123", "cool@gmail.com", "Mumbai", LocalDate.of(12, 12, 12), b1) ;
	
	static BankAccount b2=new BankAccount(100, "Savings", 1000) ;
	static Customer c2=new Customer(322, "Aman", "aman123", "aman@gmail.com", "Mumbai", LocalDate.of(12, 12, 12), b2) ;*/
	
	static {
		BankAccount b1=new BankAccount(123, "Savings", 1000) ;
		Customer c1=new Customer(321, "Neeraj", "neeraj123", "cool@gmail.com", "Mumbai", LocalDate.of(12, 12, 12), b1) ;
		BankAccount b2=new BankAccount(100, "Savings", 1000) ;
		Customer c2=new Customer(322, "Aman", "aman123", "aman@gmail.com", "Mumbai", LocalDate.of(12, 12, 12), b2) ;
		customerSet=new ArrayList<>() ;
		customerSet.add(c1) ;
		customerSet.add(c2) ;
	}

}
