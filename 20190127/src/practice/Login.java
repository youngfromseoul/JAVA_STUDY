package practice;

import java.util.HashMap;

public class Login {
		HashMap<String, String> id = new HashMap<String,String>();
	
		
		boolean matchingID;
		boolean matchingPW;
		
		
		
	
		
	public void getLogin () {
		id.put("ID", "hyoyoung");
		id.put("Password", "1234");
	}

	public void containsID (String ID) {
		boolean isExisValue = id.containsValue(ID);
		if (isExisValue == false) {
			System.out.println("�������� �ʴ� ID�Դϴ�");
		}else if (isExisValue == true) {
			matchingID = isExisValue;
		}
	}
	public void containsPassword (String PW) {
		boolean isExisValue = id.containsValue(PW);
		if (isExisValue == false) {
			System.out.println("�н����尡 �ٸ��ϴ�.");
		}else if (isExisValue == true) {
			matchingPW = isExisValue;
		}
	
	}
	public void succesLogin () {
		if (matchingID && matchingPW) {
			System.out.println("�α��� ����");
		}
	}
	
}

