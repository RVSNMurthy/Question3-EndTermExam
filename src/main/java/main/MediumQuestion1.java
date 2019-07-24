package main;

import java.util.Scanner;

abstract class Customer {

	private String name, address, mobileNumber;

	private Integer age;

	Customer(String name, String address, Integer age, String mobile) {

		this.name = name;
		this.address = address;
		this.age = age;
		this.mobileNumber = mobile;

	}

	public String toString() {
		return "Name: " + this.name + "\n" + "Mobile: " + this.mobileNumber + "\n" + "Age: " + this.age + "\n"
				+ "Address: " + this.address;
	}

	abstract Double getBillAmount(Double amt);

}

class SeniorCitizenCustomer extends Customer {

	SeniorCitizenCustomer(String name, String address, Integer age, String mobile) {
		super(name, address, age, mobile);
	}

	Double getBillAmount(Double amount) {
		Double bill = null; // edit as per the question
		// Write your code here of required
		Double discount = 0.10 * amount;
		bill = amount - discount;
		return bill;
	}

}

class PrivilegeCustomer extends Customer {
	PrivilegeCustomer(String name, String address, Integer age, String mobile) {
		super(name, address, age, mobile);
	}

	Double getBillAmount(Double amount) {
		Double bill = null; // edit as per the Question
		// write your code here if required.
		Double discount = 0.30 * amount;
		bill = amount - discount;
		return bill;
	}
}


