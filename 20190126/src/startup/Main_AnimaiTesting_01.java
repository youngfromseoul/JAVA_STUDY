package startup;

import practice.Animal;
import practice.Animal_Testing;
import practice.Cat;
import practice.Chicken;
import practice.Dog;
import practice.Human;

public class Main_AnimaiTesting_01 {

	public static void main(String[] args) {
		Animal_Testing searcher = new Animal_Testing();
		Animal animal = new Animal();
		Cat cat = new Cat();
		Chicken chicken = new Chicken();
		Dog dog = new Dog();
		Human human = new Human();
	
		searcher.searchSpeak(dog);
		searcher.searchSpeak(cat);
		searcher.searchSpeak(chicken);
		searcher.searchSpeak(human);

		
	}

}
