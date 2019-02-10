package Chlid;

import practice.Animal;

public class Animal_Dog extends Animal {
	
	public String name;
	
	public Animal_Dog(String name, int width, int length, int height) {
		super(width, length, height);
		super.width = width;
		super.height = height;
		super.length = length;
		this.name = name;
	}

	public String getName() {
		return this.name;
	}

}
