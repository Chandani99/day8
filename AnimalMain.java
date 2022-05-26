package com.day8;

public class AnimalMain {

	public static void main(String[] args) {
		Animal[] ani=new Animal[3];
		Dog d=new Dog();
		ani[0]= d;
		ani[1]=new Cat();
		ani[2]=new Tiger();
		for(int i=0; i<ani.length; i++) {
			System.out.println("Dog's activity***********");
			ani[i].makeNoise();
			ani[i].eat();
			ani[i].walk();
			System.out.println("");
		}
	}

}
