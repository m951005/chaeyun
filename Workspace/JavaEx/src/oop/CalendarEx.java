package oop;

import java.util.*;

public class CalendarEx {

	public static void main(String[] args) {
		Calendar cal = Calendar.getInstance();		//	Calendar는 추상클래스이므로 메소드를 통해 인스턴스를 생성
		System.out.println(cal);
		int year = cal.get(Calendar.YEAR);			//	Calendar의 필드는 static변수. Calendar.YEAR & cal.YEAR 동일 값이 나옴
		System.out.println("year: " + year);
		int month = cal.get(Calendar.MONTH);
		System.out.println("month: " + month);		//	 month는 0~11까지로 표시되므로 +1 한 값으로 사용하면 됨
		int date = cal.get(Calendar.DATE);
		System.out.println("date: " + date);
		
		int hour = cal.get(Calendar.HOUR);
		int minute = cal.get(Calendar.MINUTE);
		int second = cal.get(Calendar.SECOND);
		System.out.println(hour + "시 " + minute + "분 " + second + "초");
		
	}

}
