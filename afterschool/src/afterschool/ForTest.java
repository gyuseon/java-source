package afterschool;

public class ForTest {

	public static void main(String[] args) {
		// 1~20까지의 숫자 중에서 1,2,4,8,16 출력
		for(int i=1;i<=20;i=i*2) {
			
		System.out.println(i);
			
		}
		
		System.out.println();				
		
		// 250 200 150 100 50
		for (int i=250;i>0;i=i-50) {
			System.out.println(i);
		}
		
		System.out.println();
		
		// 2 4 10 28 82 244 
		for (int i=2; i<250 ;i=i*3-2) {
			System.out.println(i);
		}

	}

}
 