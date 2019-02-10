package startup;

import java.util.Scanner;

import practice.Login;

public class Main_Login {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Login login = new Login();
		
		for (;;) {
		
		System.out.print("아이디를 입력해주세요 : ");
		login.containsID(scan.nextLine());
		scan.nextLine();
		
		System.out.println("패스워드를 입렫해주세요 : ");
		login.containsPassword(scan.nextLine());
		scan.nextLine();
		
	
		}
		
		
	}

}
