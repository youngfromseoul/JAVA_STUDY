package startup;

import practice.Factory;
import practice.Supplie;

public class Main_Starcraft {

	public static void main(String[] args) {
		Factory fac = new Factory();
		
		System.out.println(fac.canFly());
		
		Supplie sup = new Supplie();
		
		System.out.println(sup.canFly());
		
	}

}
