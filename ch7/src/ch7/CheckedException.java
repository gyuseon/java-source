package ch7;

public class CheckedException {

	public static void main(String[] args) {
		// 컴파일 단계에서 Exception 여부 확인
		try {
			Class.forName("");
		} catch (ClassNotFoundException e) {
			
			//e.printStackTrace();
			System.out.println("클래스명을 확인해 주세요");
		}

	}

}
