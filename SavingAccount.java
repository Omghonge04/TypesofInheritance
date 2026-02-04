package com.singleinheritance;

public class SavingAccount extends Bank {
   public void withdraw() {
	   System.out.println("Taking money out from account");
   }
   
   public void deposit() {
	   System.out.println("Deposit money into account");
   }
   public void checkBalance() {
	   System.out.println("Checking Balance");
   }
   
}
