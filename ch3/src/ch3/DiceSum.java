package ch3;

public class DiceSum {

	public static void main(String[] args) {
		// while문과 Math.random() 을 이용해서 두 개의
		// 주사위를 던졌을 때 나오는 수를(수1,수2) 형태로 출력하기
		// 단, 두 수의 합이 5가 아니라면 계속 주사위를 던지로,
		// 두 수의 합이 5가 나오면 실해을 멈추기 =>break;
		
         
		
		while(true) {
			int dice1=(int)(Math.random()*6)+1;
			int dice2=(int)(Math.random()*6)+1;
			
			System.out.println("("+dice1+","+dice2+")");
			if(dice1+dice2==5) {
				break;
			}
		}
	}	
}		