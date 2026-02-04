package com.hierarchicalinheritance;

public class Gmail extends Google {
   public void compose() {
	   System.out.println("Write a Email...!");
   }
   
   public void send() {
	   System.out.println("Sending a Email...!");
   }
}
