package Chlid;

import practice.Animal;

public class Animal_Human extends Animal {
	public String name;
	
	public Animal_Human  (String name, int width, int height, int length) {
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
