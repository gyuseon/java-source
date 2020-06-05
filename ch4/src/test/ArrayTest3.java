package test;

public class ArrayTest3 {

	public static void main(String[] args) {
		int arr[] = {3,2,1,6,5,4};
		printArr(arr);
		sortArr(arr);
		printArr(arr);
		System.out.println("배열의 합 : "+sumArr(arr));
		

	}
	public static void printArr(int[] arr) {
		//넘겨받은 배열 출력
		for(int i:arr) {
		System.out.print(i+"\t");
	}
	System.out.println();
	}
	public static int sumArr(int[] arr) {
		//넘겨받은 배열의 합계를 구한 뒤 결과값 리턴
		int sum=0;
		for(int i:arr) {
			sum +=i;
		}
		return sum;
	}
	public static void sortArr(int[] arr) {
		//버블정렬
		for(int i=0;i<arr.length-1;i++) {
			for(int j=0;j<arr.length-1-i;j++) {
				if(arr[j]>arr[j+1]) {
					int temp =arr[j];
					arr[j]= arr[j+1];
					arr[j+1] = temp;
				}
			}
		}
	}

}
