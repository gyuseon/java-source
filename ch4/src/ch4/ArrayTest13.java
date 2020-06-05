package ch4;

import java.util.Scanner;

public class ArrayTest13 {
	public static void main(String[] args) {
		String words[]= {"television","computer",
				"mouse","phone"};
		
		Scanner sc = new Scanner(System.in);		
		
		for(int i=0;i<words.length;i++) {		
			char[] question=words[i].toCharArray();
			for(int j=0;j<question.length;j++) {
				int pos = (int)(Math.random()*question.length);
				char temp = question[j];
				question[j] = question[pos];
				question[pos] = temp;
			}
			System.out.printf("Q%d > %s 의 정답을 입력하세요\n",
									i+1, new String(question));
			//사용자의 정답 받아들이기
			String answer=sc.nextLine();
			
			//정답과 비교후 맞았는지 틀렸는지 출력해주기
			if(answer.equals(words[i])) {
				System.out.println("맞았음");
			}else {
				System.out.println("틀렸음");
			}
		}
	}
}







