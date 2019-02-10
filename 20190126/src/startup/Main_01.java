package startup;

import practice.Animal;
import practice.Cat;
import practice.Chicken;
import practice.Dog;
import practice.Human;

public class Main_01 {
	public static void main(String[] args) {
		Animal animal = new Animal();
		animal.speak();
		
		Cat cat = new Cat();
		cat.speak();
		
		Chicken chicken = new Chicken();
		chicken.speak();
		
		Dog dog = new Dog();
		dog.speak();
		
		Human human = new Human();
		human.speak();
		
		System.out.println("-----메소드 오버라이딩-----");
		
		Animal animal1 = new Dog();
		animal1.speak();
		
		Animal animal2 = new Cat();
		animal2.speak();
		
		Animal animal3 = new Human();
		animal3.speak();
	

	}
}