package startup;

import java.util.Scanner;

import practice.Login;

public class Main_Login {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Login login = new Login();
		
		for (;;) {
		
		System.out.print("���̵� �Է����ּ��� : ");
		login.containsID(scan.nextLine());
		scan.nextLine();
		
		System.out.println("�н����带 �Ԏ����ּ��� : ");
		login.containsPassword(scan.nextLine());
		scan.nextLine();
		
	
		}
		
		
	}

}
