package com.project.main;
import com.project.model.*;
public class DriverClass {
	public static void main(String[] args) {
		
		Hyundai h = new Hyundai(); //why this error while creating object of Hyundai and Ford
		Ford f = new Ford();
		
		h.brand();
		h.speed();
		h.Type();
		
		f.brand();
		f.speed();
		f.Type();
		
	}

}
