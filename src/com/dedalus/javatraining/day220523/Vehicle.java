package com.dedalus.javatraining.day220523;

public class Vehicle {

	public Double Capacity;
	public String Model;
	
	public void RotateWheel(float angle) {
		System.out.println("Rotated "+ angle+" Degree");
	}
	
	public void Run() {
		System.out.println("Ran");
	}
	
	public String ToString() {
		return Model + ":" + Capacity + " CC";
	}

}
