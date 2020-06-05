package date;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateEx {

	public static void main(String[] args) {
		Date date =new Date();
		System.out.println(date);
		
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy년 mm월 dd일");
		System.out.println(sdf.format(date));
		
		// HH : 24시 기준  / SSS(1/1000)
		sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS");
		System.out.println(sdf.format(date));
		
		// hh : 12시 기준  a(am:pm)
		sdf = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss a");
		System.out.println(sdf.format(date));
		
		// D : 년의 몇번째 일
		sdf = new SimpleDateFormat("오늘은 올 해의 D번째 날입니다");
		System.out.println(sdf.format(date));
		
		// d : 월의 몇번째 일
		sdf = new SimpleDateFormat("오늘은 올 해의 d번째 날입니다");
		System.out.println(sdf.format(date));
		
		// w : 년의 몇번째 주
		sdf = new SimpleDateFormat("오늘은 올 해의 w번째 날입니다");
		System.out.println(sdf.format(date));
		
		// W : 월의 몇번째 주
		sdf = new SimpleDateFormat("오늘은 올 해의 W번째 날입니다");
		System.out.println(sdf.format(date));
		
		// F : 월의 몇번째 요일 / E :요일
		sdf = new SimpleDateFormat("오늘은 이 달의 F번째 E요일입니다");
		System.out.println(sdf.format(date));
		

	}

}
