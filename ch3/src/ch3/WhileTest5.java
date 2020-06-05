package ch3;

public class WhileTest5 {

	public static void main(String[] args) {
		// 구구단 7단 출력
		
		int i=1;
		while(i<100) {
			if(i%7==0) {
				System.out.println(i);
			}
			i++;
		}

	}

}
