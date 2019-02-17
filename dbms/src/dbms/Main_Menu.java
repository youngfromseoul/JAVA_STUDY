package dbms;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class Main_Menu {
	private static Database db = new Database("kjlee", "자바", "sa", "moLA12");
	public static void main(String[] args) {
		ResultSet rs = db.ExecuteDataset("Select * from 학생");
		try {
			while(rs.next()) {
				System.out.print(rs.getString("ID")+ "," );
				System.out.print(rs.getString("이름")+ "," );
				System.out.print(rs.getString("전화번호")+ "," );
				System.out.print(rs.getString("주소"));
				System.out.println();
			}
		} catch (SQLException e) {
			e.printStackTrace();
			return;
		}
		Scanner scan = new Scanner(System.in);
		int select;
		
		for(;;) {
			System.out.println("1. select 학생");
			System.out.println("2. insert 학생");
			System.out.println("3. delete 학생");
			System.out.println("4. update 학생");
			System.out.println("5. exit");
			System.out.print("입력 : ");
			
			select = scan.nextInt();
			scan.nextLine();
			
			switch (select) {
			case 1:
			case 2:
			case 3:
			case 4:
			case 5:
				break;
			default :
				System.out.println("잘못된 숫자를 입력했습니다");
			}
			
		}

	}

}
