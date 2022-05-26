package com.day8;

public class BirdMain {

	public static void main(String[] args) {
		Bird b1 = new Parrot();
		b1.fly();
		
		Parrot pr=(Parrot)b1;  //downcasting
		pr.sing();


	}

}
