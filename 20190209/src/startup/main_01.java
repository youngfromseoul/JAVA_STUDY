package startup;

import java.util.Scanner;

import practice.Join;

public class main_01 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Join join = new Join();
		
		
	
		
		for(;;) {
		try {
			System.out.print("id�� �Է����ּ��� : ");
			String id = scan.nextLine();
			join.checkId(id);
			
			System.out.print("pw�� �Է����ּ��� : ");
			String pw = scan.nextLine();
			join.insertNew(id, pw);
		} catch (Exception failId) {
			System.out.println(failId.getMessage());
		}
		
		System.out.println("----------------");
		System.out.println(join.members);
		System.out.println("----------------");
	}
	}
		
}

