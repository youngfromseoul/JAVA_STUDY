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
			System.out.println("존재하지 않는 ID입니다");
		}else if (isExisValue == true) {
			matchingID = isExisValue;
		}
	}
	public void containsPassword (String PW) {
		boolean isExisValue = id.containsValue(PW);
		if (isExisValue == false) {
			System.out.println("패스워드가 다릅니다.");
		}else if (isExisValue == true) {
			matchingPW = isExisValue;
		}
	
	}
	public void succesLogin () {
		if (matchingID && matchingPW) {
			System.out.println("로그인 성공");
		}
	}
	
}

