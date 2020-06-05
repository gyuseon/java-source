package date;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class LocalDateEx {

	public static void main(String[] args) {
		//JDK8 버전부터 사용가능
		// 날짜 얻기
		LocalDate currDate = LocalDate.now();
		System.out.println("현재 날짜 "+currDate);
		
		//시간 얻기
		LocalTime currTime = LocalTime.now();
		System.out.println("현재 시간 "+currTime);
		
		//날자와 시간 얻기
		LocalDateTime currDateTime = LocalDateTime.now();
		System.out.println("현재 날짜와 시간 "+currDateTime);
		

	}

}
