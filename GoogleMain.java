package com.hierarchicalinheritance;

public class GoogleMain {
    public static void main(String[] args) {
		Gmap g1 = new Gmap();
		 g1.logIn();
		 g1.search();
		 g1.navigate();
		 g1.route();
		 g1.logOut();
		 
		 
		 System.out.println();
		 
		 Gmail g2 = new Gmail();
		 g2.logIn();
		 g2.compose();
		 g2.send();
		 g2.logOut();
		 
		 System.out.println();
		 
		 Gdrive g3 = new Gdrive();
		 g3.logIn();
		 g3.Stored();
		 g3.Download();
		 g3.send();
		 g3.logOut();
	}
}
