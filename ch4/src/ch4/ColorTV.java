package ch4;

public class ColorTV {
	//인스턴스변수(필드) - 속성
	
	int channel; // 초기값 : 0 
	boolean power; //      fasle
	String color;  //      null
	
	//ColorTV(){}
	
	
	//메소드 - 동작
	void power() {
		this.power=!this.power;
	}
	void channelUp() {
		channel++;
	}
	void channelDown() {
		channel--;
	}
}



