package practice;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Date01 {
	
	
	public void getDate() {
	Date date = new Date(System.currentTimeMillis());
	
	SimpleDateFormat date1 = new SimpleDateFormat("yyyy.MM.dd");
	SimpleDateFormat date2 = new SimpleDateFormat("HH.mm.ss");
	SimpleDateFormat date3 = new SimpleDateFormat("HH��mm��");
	SimpleDateFormat date4 = new SimpleDateFormat("yyyy��MM��dd��");
	String now1 = date1.format(date);
	String now2 = date2.format(date);
	String now3= date3.format(date);
	String now4=date4.format(date);
	System.out.println(now1);
	System.out.println(now2);
	System.out.println(now3);
	System.out.println(now4);
	}
	
	public void getCalendar() {
		Calendar cal = Calendar.getInstance();
		System.out.print(cal.get(Calendar.YEAR )); // ��
		System.out.print("�� ");
		System.out.print(cal.get(Calendar.MONTH)+1); // 0������ ����
		System.out.print("�� ");
		System.out.print(cal.get(Calendar.DAY_OF_MONTH)); // ��
		System.out.println("�� ");
		System.out.print(cal.get(Calendar.DATE)); // ���� ���� �� ��¥
		System.out.println("");
		System.out.print(cal.get(Calendar.HOUR_OF_DAY)); // �ð�
		System.out.print(cal.get(Calendar.MINUTE)); // ��
		System.out.print(cal.get(Calendar.MILLISECOND)); // ��
		System.out.print(cal.get(Calendar.DAY_OF_WEEK)); // ����
		System.out.print(cal.get(Calendar.DAY_OF_WEEK_IN_MONTH)); // ���° ����

	}
	
}
