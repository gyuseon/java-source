package classtest;

public class Person {
	//속성 - 이름,키,몸무게,주소
	private String name;
	private double height;
	private double weight;
	private String address;
	
	public Person() {
		super();
		
	}
	public Person(String name, double height, double weight, String address) {
		super();
		this.name = name;
		this.height = height;
		this.weight = weight;
		this.address = address;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	public void setHeight(double height) {
		this.height = height;
	}
	public void setWeight(double weight) {
		this.weight = weight;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getName() {
		return name;
	}
	public double getHeight() {
		return height;
	}
	public double getWeight() {
		return weight;
	}
	public String getAddress() {
		return address;
	}
	
	
	
	

}
