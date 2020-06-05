package classtest;

public class Box {
	//속성 : 가로,세로,높이
	private int width;
	private int length;
	private int height;
	
	//기본생성자, 인자를 받는 생성자
	public Box() {
		super();
		
	}
	
	
	public Box(int width, int length, int height) {
		super();
		this.width = width;
		this.length = length;
		this.height = height;
	}
	
	//메소드 getVolume() => 가로*세로*높이
	
	int getVolume(){
		return width*length*height;
	
	}



}
