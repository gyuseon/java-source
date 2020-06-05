package classtest;

public class TransportEx {

	public static void main(String[] args) {
		//객체 생성
		Passenger passenger = new Passenger("홍길동", 20000);
		Subway subway =new Subway(passenger, 0, 4, "당고개", "안산", null);
		Bus bus = new Bus(new Passenger("성춘향", 10000),0, 1233, "공릉동", "시청", null);
		
		Transport transport = new Taxi(passenger, 10000, 4381, "잠실", "노원");
		

	}

}
