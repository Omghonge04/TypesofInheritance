package com.hybridinheritance;

public class MainClass {
	public static void main(String[] args) {
		Son s1 = new Son();
		s1.land();
		s1.House();
		s1.Bike();
		
		System.err.println("------------------");
	  
		Daughter d1 = new Daughter();
		d1.land();
		d1.House();
		d1.Framhouse();
		
		System.err.println("------------------");
		 
		Cousin1 c1 = new Cousin1();
		c1.land();
		c1.Plot();
		c1.Car();
		
		System.err.println("------------------");
		
		Cousin2 c2 = new Cousin2();
		c2.land();
		c2.shop();
		c2.Laptop();
		
		System.err.println("------------------");
		
	}

}
