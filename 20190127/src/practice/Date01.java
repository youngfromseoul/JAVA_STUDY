package practice;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Date01 {
	
	
	public void getDate() {
	Date date = new Date(System.currentTimeMillis());
	
	SimpleDateFormat date1 = new SimpleDateFormat("yyyy.MM.dd");
	SimpleDateFormat date2 = new SimpleDateFormat("HH.mm.ss");
	SimpleDateFormat date3 = new SimpleDateFormat("HH시mm분");
	SimpleDateFormat date4 = new SimpleDateFormat("yyyy년MM월dd일");
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
		System.out.print(cal.get(Calendar.YEAR )); // 년
		System.out.print("년 ");
		System.out.print(cal.get(Calendar.MONTH)+1); // 0월부터 시작
		System.out.print("월 ");
		System.out.print(cal.get(Calendar.DAY_OF_MONTH)); // 일
		System.out.println("일 ");
		System.out.print(cal.get(Calendar.DATE)); // 현재 달의 총 날짜
		System.out.println("");
		System.out.print(cal.get(Calendar.HOUR_OF_DAY)); // 시간
		System.out.print(cal.get(Calendar.MINUTE)); // 분
		System.out.print(cal.get(Calendar.MILLISECOND)); // 초
		System.out.print(cal.get(Calendar.DAY_OF_WEEK)); // 요일
		System.out.print(cal.get(Calendar.DAY_OF_WEEK_IN_MONTH)); // 몇번째 요일

	}
	
}
