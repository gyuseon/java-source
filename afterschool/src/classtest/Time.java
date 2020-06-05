package classtest;

public class Time {
	//속성 : 시,분,초
	private int hour;
	private int m;
	private int s;
	
	//생성자 : 기본생성자, 인자를 받는 생성자
	public Time() {
		super();
		
	}
	
	//hour가 0~23사이로 들어왔는지 확인한 후 
	//초기화 / minute : 0~59  / second : 0~59
	public Time(int hour, int m, int s) {
		super();
		 
		this.hour = ((hour>=0 && hour<24)? hour : 0);
		this.m = ((m>=0 && m<60)? m : 0);
		this.s = ((s>=0 && s<60)? s :0);
	}

	public int getHour() {
		return hour;
	}

	public int getM() {
		return m;
	}

	public int getS() {
		return s;
	}
	
	
	

}
