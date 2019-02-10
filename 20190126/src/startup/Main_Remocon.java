package startup;

import practice.Remocon;
import practice.Television;

public class Main_Remocon {
	public static void main(String[] args) {
		
		Remocon remote = new Television();
		
		remote.turnOn();
		
		remote.turnOff();
		
	}
}
