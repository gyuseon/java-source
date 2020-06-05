package ch4;

public class Triangle {
	//필드 
	int baseLine; //밑변 : baseLine
	int height;   //높이 : height
	
	Triangle(int baseLine,int height){
		this.baseLine = baseLine;
		this.height = height;
	}
	
	//기능 - 메소드 getArea()
	// 면적구하기 : 리턴 타입 : double,
	//구현기능 : 클래스의 필드를 이용하여 면적구하기
	double getArea() {
		return (baseLine*height) / 2;
	}
}
