package com.dedalus.javatraining.day220523;

import java.lang.*;

public class Animal {

	public String Name;
	public Double Weight;
	
	public void Walk() {
		System.out.println("Walked");
	}
	
	public void Eat() {
		System.out.println("Ate");
	}
	
	public String ToString() {
		return Name + ":" + Weight;
	}
	
}
