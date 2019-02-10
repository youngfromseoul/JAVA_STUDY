package startup;

import practice.Human001;

public class Main_Human {

	public static void main(String[] args) {
		Human001 human1 = new Human001(178, 66);
		Human001 human2 = new Human001(172, 96);
		
		double human1Rate = human1.getRate();
		double human2Rate = human2.getRate();
		
		System.out.println("human1Rate : " + human1Rate);
		System.out.println("human2Rate : " + human2Rate);
		
		System.out.println("크기비교(human1 기준) : " + human1.compareTo(human2));
		System.out.println("크기비교(human2 기준) : " + human2.compareTo(human1));
		
	}

}
