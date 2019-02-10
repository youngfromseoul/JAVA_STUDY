package startup;

import java.util.Arrays;
import Chlid.Animal_Cat;
import Chlid.Animal_Chicken;
import Chlid.Animal_Dog;
import Chlid.Animal_Human;
import practice.Animal;


public class Main_Animal {

	public static void main(String[] args) {
		
		
		Animal[] animal = new Animal[4];
		
		animal[0]= new Animal_Dog("dog", 40, 20, 30);
		animal[1]= new Animal_Cat("cat", 20, 10, 15);
		animal[2]= new Animal_Chicken("chicken", 10, 5, 5);
		animal[3]= new Animal_Human("human", 50, 180, 90);

		
			
		System.out.println("getVolume 결과 값");
		System.out.println("-----------------------");
		Arrays.sort(animal);
		for (int i=0;i < animal.length;i++) {
			String name= "";
			
			if(animal[i] instanceof Animal_Dog) {
				name = ((Animal_Dog) animal[i]).getName();
			}else if (animal[i] instanceof Animal_Cat) {
				name = ((Animal_Cat) animal[i]).getName();
			}else if (animal[i] instanceof Animal_Chicken) {
				name = ((Animal_Chicken) animal[i]).getName();
			}else if (animal[i] instanceof Animal_Human) {
				name = ((Animal_Human) animal[i]).getName();
			}
			
			System.out.println(name+": "+ animal[i].getVolume());
		}
		System.out.println("크기 비교 ");
		System.out.println("-----------------------");
		animal[1].compareTo(animal[2]);
		
		
		
	}
}

