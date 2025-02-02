package org.bank;

public class BankInfo {
	
	private void fullName() {
		System.out.println("indian Bank");
	}
	private void sortCode() {
		System.out.println("623529");
		
	}
private void accountNumber() {
	System.out.println("119405");
	
}
private void bankAdress() {
	System.out.println("thangachimadam");	
	
}

public static void main(String[] args) {
	BankInfo b = new BankInfo();
	
	b.fullName();
	b.accountNumber();
	b.bankAdress();
	b.sortCode();
	
}
}
