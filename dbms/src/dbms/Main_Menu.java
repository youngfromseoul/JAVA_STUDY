package dbms;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class Main_Menu {
	private static Database db = new Database("kjlee", "�ڹ�", "sa", "moLA12");
	public static void main(String[] args) {
		ResultSet rs = db.ExecuteDataset("Select * from �л�");
		try {
			while(rs.next()) {
				System.out.print(rs.getString("ID")+ "," );
				System.out.print(rs.getString("�̸�")+ "," );
				System.out.print(rs.getString("��ȭ��ȣ")+ "," );
				System.out.print(rs.getString("�ּ�"));
				System.out.println();
			}
		} catch (SQLException e) {
			e.printStackTrace();
			return;
		}
		Scanner scan = new Scanner(System.in);
		int select;
		
		for(;;) {
			System.out.println("1. select �л�");
			System.out.println("2. insert �л�");
			System.out.println("3. delete �л�");
			System.out.println("4. update �л�");
			System.out.println("5. exit");
			System.out.print("�Է� : ");
			
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
				System.out.println("�߸��� ���ڸ� �Է��߽��ϴ�");
			}
			
		}

	}

}
