package startup;

import java.util.Scanner;

import practice.Join;

public class main_01 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Join join = new Join();
		
		
	
		
		for(;;) {
		try {
			System.out.print("id를 입력해주세요 : ");
			String id = scan.nextLine();
			join.checkId(id);
			
			System.out.print("pw를 입력해주세요 : ");
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

