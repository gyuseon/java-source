package ch4;

public class ArrayTest8 {
	public static void main(String[] args) {
		//타입 배열명[][]=new 타입[2][2]; 
		int arr1[][]=new int[2][2];
		
		arr1[0][0] = 15;
		arr1[0][1] = 25;
		arr1[1][0] = 35;
		arr1[1][1] = 45;
		
		for(int i=0;i<arr1.length;i++) { //행길이
			for(int j=0;j<arr1[i].length;j++) { //열길이
				System.out.println(arr1[i][j]);
			}
			System.out.println();
		}

	}

}







