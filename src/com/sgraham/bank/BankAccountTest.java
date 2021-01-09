package com.sgraham.bank;

public class BankAccountTest {

	public static void main(String[] args) {
		BankAccount b1 = new BankAccount();
		
		b1.depChecking(256.00);
		b1.depSavings(500);
		b1.displayAcct();
		
		b1.depChecking(25);
		b1.depSavings(300);
		b1.withdrawChecking(56);
		b1.withdrawSavings(33);
		b1.displayAcct();
		b1.displayAcctTotal();
		b1.withdrawChecking(900);
		System.out.println("Bank total: " + BankAccount.getBankTotalBalance());

	}

}
