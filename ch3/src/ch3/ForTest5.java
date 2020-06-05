package ch3;

public class ForTest5 {

	public static void main(String[] args) {
		// 1~100까지 숫자 중에서 3의 배수는 더하고
		// 9의 배수는 안더해서 합계 출력하기
		
//		int sum=0;
//		for(int i=3;i<=100;i+=3) {
//			sum+=i;
//			
//		}
//		System.out.println("1~100 : "+sum);
//		
//		
//		System.out.println();
//		for(int i=1;i<=100;i++) {
//			if(i%3==0) {
//				System.out.println(i+" ");
//				System.out.println();
			     int sum=0;
				for(int i=1;i<101;i++) {
					if(i%3==0 && i%9!=0) {
					sum+=i;
			}
					System.out.println("1~100 : "+sum);
		}
				System.out.println();
				//3의 배수이거나 5의 배수의 합 구하기
				sum=0;
				for(int i=1;i<101;i++) {
					if(i%3==0 || i%5==0) {
					sum+=i;
	}

}
				System.out.println("3의 배수이거나 5의 배수인 숫자의 합 : "+sum);
	}
}

