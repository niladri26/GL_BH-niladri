package com.project.model;

public class Hier {		//----------super class
	class Car {
		public void Type() {
			System.out.println("Type: SUV");
		}
	}
	class Hyundai extends Car {  //---------- subclass 1 
		public void brand() {
			System.out.println("Brand: Hyundai");
		}
		public void speed() {
			System.out.println("Speed: 100kmpl");
		}
	}
	class Ford extends Car {  // ----------------subclass 2 
		public void brand() {
			System.out.println("Brand: Ford");
		}
		public void speed() {
			System.out.println("Speed: 111kmpl");
		}
	}

}
