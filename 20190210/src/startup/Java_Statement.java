package startup;

import java.util.Scanner;

public class Java_Statement {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		// ������ �Է¹ޱ�
		for(;;) {
			System.out.println("----------������ �����-----------");
			System.out.println("�Ʒ��� ���� �� ����� ���ϴ� ������ ����� �������ּ���");
			System.out.println("3, 5, 7, 9");
			System.out.print("�Է� : ");
			int select = scan.nextInt();
			scan.nextLine();
				
		// �Է¹��� ���ڿ� ���� �迭 ���� �� ������ ����
				String[][] arr1 = new String[select][select];
				System.out.println(select + " ũ�� ������ �����ϼ̽��ϴ�.");
				System.out.println("------------------------------");
				
				int startStar = select / 2;
				
						
		//������ ����		
				for (int i=0;i<arr1.length;i++) {
					for (int j=0;j<arr1.length;j++) {
						if (startStar == i || startStar == j)  {
							arr1[i][j]= "*";
							System.out.print(arr1[i][j]);
						}else {
							arr1[i][j]= " ";
							System.out.print(arr1[i][j]);
						}
						
					}
					System.out.println(); //�ٹٲ�
				}
				
		}
		
	}

}
