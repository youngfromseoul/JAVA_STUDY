package startup;

import java.util.Scanner;

public class Java_Statement {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		// ������ �Է¹ޱ�
		for(;;) {
			System.out.println("----------������ �����-----------");
			System.out.println("�Ʒ��� ���� �� ����� ���ϴ� ������ ����� �������ּ���");
			System.out.println("1, 2, 3, 4");
			System.out.print("�Է� : ");
			int select = scan.nextInt();
			scan.nextLine();
				
		// �Է¹��� ���ڿ� ���� ���ǹ� 
			switch (select) {
			case 1 : 
		// �Է¹��� ���ڿ� ���� �迭 ���� �� ������ ����
		
				
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
				
			case 2 :
			case 3 :
			case 4 :
			default :
				
				
			}
		
			
			

		}
		
	}

}
