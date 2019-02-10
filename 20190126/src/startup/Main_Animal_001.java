package startup;

import practice.Animal;
import practice.Cat;
import practice.Chicken;
import practice.Dog;
import practice.Human;

public class Main_Animal_001 {

	public static void main(String[] args) {
		Animal[] animal = new Animal[10];
		
		animal[0] = new Animal();
		animal[1] = new Dog();
		animal[2] = new Cat();
		animal[3] = new Chicken();
		animal[4] = new Human();
		animal[5] = new Animal();
		animal[6] = new Dog();
		animal[7] = new Cat();
		animal[8] = new Chicken();
		animal[9] = new Human();
		
		
		
		for(int i=0; i<animal.length;i++) {
		//	System.out.println(i + "번째 울음소리");
			//animal[i].speak();
			
			}
		if(animal[0] instanceof Dog) {
		}
		}
	
		
	}

	


