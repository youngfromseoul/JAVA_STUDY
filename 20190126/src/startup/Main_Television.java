package startup;

import practice.Television_003;

public class Main_Television {

	public static void main(String[] args) {
		Television_003 tv = new Television_003();
		
		tv.print();
		System.out.println("---------오버로딩-------");
		tv.print("오버로딩 : ");
	}

}
