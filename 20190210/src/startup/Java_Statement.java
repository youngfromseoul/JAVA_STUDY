package startup;

import java.util.Scanner;

public class Java_Statement {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		// 사이즈 입력받기
		for(;;) {
			System.out.println("----------마름모 만들기-----------");
			System.out.println("아래의 숫자 중 출력을 원하는 마름모 사이즈를 선택해주세요");
			System.out.println("1, 2, 3, 4");
			System.out.print("입력 : ");
			int select = scan.nextInt();
			scan.nextLine();
				
		// 입력받은 숫자에 따른 조건문 
			switch (select) {
			case 1 : 
		// 입력받은 숫자에 따른 배열 생성 및 마름모 구현
		
				
				System.out.println(select + " 크기 마름모를 선택하셨습니다.");
				System.out.println("------------------------------");
				
				int startStar = select / 2;
				
						
		//마름모 구현		
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
					System.out.println(); //줄바꿈
				}
				
			case 2 :
			case 3 :
			case 4 :
			default :
				
				
			}
		
			
			

		}
		
	}

}
