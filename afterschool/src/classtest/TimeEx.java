package classtest;

public class TimeEx {

	public static void main(String[] args) {
		
		Time time1 = new Time(23,58,25);
		System.out.println(time1.getHour()+"시"+time1.getM()+"분"+time1.getS()+"초");
		System.out.println(time1.getHour());
		System.out.println(time1.getM());
		System.out.println(time1.getS());
		
		Time time2 = new Time(25,58,25);
		System.out.println(time2.getHour());
		System.out.println(time2.getM());
		System.out.println(time2.getS());

	}

}
