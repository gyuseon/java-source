package classtest;

public class Transport {
	private Passenger passenger; //승객
	private int money; //요금
	private int number; //열차번호
	private String startLocation; //출발지
	private String endLocation;   //도착지
	private String transLocation; //경유지
	
	public Transport(Passenger passenger, int money, int number, String startLocation, String endLocation) {
		super(); //택시
		this.passenger = passenger;
		this.money = money;
		this.number = number;
		this.startLocation = startLocation;
		this.endLocation = endLocation;
	}
	
	public Transport(Passenger passenger, int money, int number, String startLocation, String endLocation,
			String transLocation) {
		super(); //버스,지하철
		this.passenger = passenger;
		this.money = money;
		this.number = number;
		this.startLocation = startLocation;
		this.endLocation = endLocation;
		this.transLocation = transLocation;
	}
	
	
	
	public void take(int money) { // 승차(태우다)
		this.money+=money; //수입+=요금
	}

	public int getNumber() {
		return number;
	}

	











}
