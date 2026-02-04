package com.hierarchicalinheritance;

public class Gmap extends Google{
	public void search() {
		System.out.println("Searching Location");
	}
    
	public void navigate() {
		System.out.println("Navigating the route using Google Map");
	}
	
	public void route() {
		System.out.println("Showing route");
	}
}
