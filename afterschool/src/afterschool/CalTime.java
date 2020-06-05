package afterschool;

public class CalTime {

	public static void main(String[] args) {
		// long(8byte) < double(8byte)
		
		// 지구에서 가장 가까운 별까지의 거리 계산하기
		
		// 프록시마 센타우리 별
		// 지구로부터 40*10의 12승 km 떨어져있음
		// 40000000000000
		
		// 빛의 속도로 갔을때 걸리는 시간은 얼마인가? 빛(1초에 30만)
		
//		long distance = 40*1000000000000l;
//		long light = 60* 60* 24* 365l *300000;
//		System.out.println("빛의 속도로 걸리는 년도 : "+distance/light);
		
		double light_speed = 30e4d; // e = 지수  e4 = 1000
		double distance = 40e12d;
		
		// 거리 / 초 => 몇초가 걸리지?
		double secs =distance /light_speed;
		
		double light_year = secs / (60*60*24*365.0);
		System.out.println("걸리는 년도는 : "+light_year+" 광년입니다");

	}

}
