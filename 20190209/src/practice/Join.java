package practice;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;

public class Join {
	
	
	Date date = new Date(System.currentTimeMillis());
	SimpleDateFormat joinTime = new SimpleDateFormat("���Խð� : yyyy��MM��dd��HH��mm��ss��");
	
	
	public HashMap<String, String> members = new HashMap<String, String>();
	
	public Join() {
		this.members.put("freey", "1234");
		this.members.put("dsfs", "2134");
	}
	public void checkId(String id) throws Exception {
		if(members.containsKey(id)) {
			throw new Exception("���̵� �����մϴ�.");
		}
	}
	
	public void insertNew(String id, String pw) {
		this.members.put(id, pw);
		System.out.println(this.getNowTime());
	
	}
	public String getNowTime() {
		return joinTime.format(date);
	}
}
