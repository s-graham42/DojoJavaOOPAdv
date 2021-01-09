package com.sgraham.bank;

//Create a BankAccount class.
//
//-  The class should have the following attributes: (string) account number,
//   (double) checking balance, (double) savings balance.
//-  Create a class member (static) that has the number of accounts created thus far.
//-  Create a class member (static) that tracks the total amount of money stored in
//   every account created.
//-  Create a private method that returns a random ten digit account number.
//-  In the constructor, call the private method from above so that each user has a
//   random ten digit account.
//-  In the constructor, be sure to increment the account count.
//-  Create a getter method for the user's checking account balance.
//-  Create a getter method for the user's saving account balance.
//-  Create a method that will allow a user to deposit money into either the checking or saving, be sure to add to total amount stored.
//-  Create a method to withdraw money from one balance. Do not allow them to withdraw money if there are insufficient funds.
//-  Create a method to see the total money from the checking and saving.
//-  Users should not be able to set any of the attributes from the class.
import java.util.Random;

public class BankAccount {
	private String accountNumber;
	private double checkingBalance;
	private double savingsBalance;
	private static int numAccounts = 0;
	private static double bankTotalBalance = 0;
	
	private static String generateAcctNum() {
		String acctNum = "";
		Random r = new Random();
		for (int i = 0; i < 10; i++) {
			acctNum = acctNum + (Integer.toString(r.nextInt(10)));
		}
		return acctNum;
	}
	
	public BankAccount() {
		this.accountNumber = generateAcctNum();
		this.checkingBalance = 0;
		this.savingsBalance = 0;
		numAccounts++;
	}
	
	// getters
	public String getAcctNum() {
		return this.accountNumber;
	}
	public double getCheckingBalance() {
		return this.checkingBalance;
	}
	public double getSavingsBalance() {
		return this.savingsBalance;
	}
	public double getAcctTotal() {
		return this.getCheckingBalance() + this.getSavingsBalance();
	}
	public void displayAcct() {
		System.out.println("Account Number:  " + accountNumber);
		System.out.println("Checking Balance:  $" + checkingBalance);
		System.out.println("Saving Balance:  $" + savingsBalance);
	}
	public void displayAcctTotal() {
		System.out.println("Account total balance (checking + savings:  $" + this.getAcctTotal() + ")");
	}
	public static int getNumAccts() {
		return numAccounts;
	}
	public static double getBankTotalBalance() {
		return bankTotalBalance;
	}
	
	// setters
	public void depChecking(double amt) {
		this.checkingBalance += amt;
		bankTotalBalance += amt;
		System.out.println("Deposited " + amt + " to Checking.");
	}
	public void depSavings(double amt) {
		this.savingsBalance += amt;
		bankTotalBalance += amt;
		System.out.println("Deposited " + amt + " to Savings.");
	}
	public void withdrawChecking(double amt) {
		if (this.checkingBalance >= amt) {
			this.checkingBalance -= amt;
			bankTotalBalance -= amt;
			System.out.println("Withdrew " + amt + " from Checking.");
		} else {
			System.out.println("Withdrawal failed.  Insufficient Funds.");
		}
	}
	public void withdrawSavings(double amt) {
		if (this.savingsBalance >= amt) {
			this.savingsBalance -= amt;
			bankTotalBalance -= amt;
			System.out.println("Withdrew " + amt + " from Savings.");
		} else {
			System.out.println("Withdrawal failed.  Insufficient Funds.");
		}
	}
	
	
	
}
