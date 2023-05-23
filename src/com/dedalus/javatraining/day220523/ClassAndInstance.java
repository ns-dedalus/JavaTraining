package com.dedalus.javatraining.day220523;

public class ClassAndInstance {

	public static void main(String[] args)	{
		Animal a1 = new Animal();
		a1.Name = "Tiger";
		a1.Weight = 30.5;
		
		Animal a2 = new Animal();
		a2.Name = "Lion";
		a2.Weight = 35.6;

		System.out.println(a1.ToString());
		System.out.println(a2.ToString());
		
		a1.Eat();
		a2.Walk();
		
		Vehicle activa = new Vehicle();
		activa.Model = "Honda";
		activa.Capacity = 100.0;
		
		System.out.println(activa.ToString());
		activa.RotateWheel(10);

		
	}

}
