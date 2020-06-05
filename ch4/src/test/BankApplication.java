package test;

import java.util.Scanner;

public class BankApplication {

	
		//Account 객체를 100개 담을 배열 생성
	    static Account[] accountArray =new Account[100];
		//사용자로부터 입력받기 위한 객체 생성
		static Scanner sc = new Scanner(System.in); 
		public static void main(String[] args) {
		    boolean run =true;
		    while(run) {
		    	System.out.println("---------------------------------------------");
		    	System.out.println("1.계좌생성| 2.계좌목록 |3. 예금|4. 출금|5. 종료");
		    	System.out.println("---------------------------------------------");
		    	System.out.print("메뉴선택 >> ");
		    	int menu =sc.nextInt();
		    	switch (menu) {
				case 1:
					createAccount();
					break;
	            case 2:
					accountList();
					break;	
			    case 3:
					deposit();
			        break;
			    case 4:
					withdraw();
			        break;
			    case 5:
					run=false;
			        break;
				default:
					System.out.println("번호를 확인해주세요");
					break;
				}
		    }
		
		}
		public static void createAccount() {
			//계좌번호(ano),계좌주(owner),잔액(balance)
			//정보 입력받기
			System.out.print("계좌번호를 입력하세요 : ");
			String ano = sc.next();
			System.out.print("계좌이름을 입력하세요 : ");
			String owner= sc.next();
			System.out.print("잔액을 입력하세요 : ");
			int balance = sc.nextInt();
			
			//입력받은 정보를 이용해 Account 객체를 생성
			Account account = new Account(ano,owner,balance);
			//배열에 담기 위해 배열 요소의 어느 부분이 
			//비어 있는지 확인한 후 생성된 객체를 담아준다
			for(int i=0;i<accountArray.length;i++) {
				if(accountArray[i]==null) {
					accountArray[i] = account;
					System.out.println("계좌가 생성되었습니다");
					break;//담은 후 break;
				}
			}
					
		}
		
		public static void accountList() {
			//현재 생성된 계좌 목록 출력하기
			for(int i=0;i<accountArray.length;i++) {
				if(accountArray[i]!=null) {
					System.out.print("-----------------------");
					System.out.print("계좌목록");
					System.out.print("-----------------------");
					System.out.printf("\t%s\t%s\t%d\n",accountArray[i].getAno(),accountArray[i].getOwner(),accountArray[i].getBalance());
			}
			}	
			
		}
		
		//예금하다
		public static void deposit() {
			//사용자에게 계좌번호 입력받기
			System.out.print("계좌번호를 입력하세요 : ");
			String ano = sc.next();
			
			//입력받은 계좌번호를 이용해 몇번째 Account의 입금액을 증가해야하는지 알아내기 => findAccount
			 Account account=findAccount(ano);
			  //account => null, 일치한 계좌가 있는경우
			 if(account ==null) {
				 System.out.println("계좌번호를 확인해주세요");
			 }else {
				 System.out.println("예금액 입력 : ");
				 int deposit= sc.nextInt();
				 account.setBalance(account.getBalance()+deposit);
				 System.out.println("입금이 완료 되었습니다");
			 }
			
		}
		//출금하다
		public static void withdraw() {
			System.out.print("계좌번호를 입력하세요 : ");
			String ano = sc.next();
			Account account=findAccount(ano);
			if(account ==null) {
				 System.out.println("계좌번호를 확인해주세요");
			 }else {
				 System.out.println("출금액 입력 : ");
				 int deposit= sc.nextInt();
				 account.setBalance(account.getBalance()-deposit);
				 System.out.println("출금이 완료 되었습니다");
			 }
		}
		//Account 배열에서 ano와 동일한 Account 객체 찾기
		private static Account findAccount(String ano) {
			//넘겨받은 ano를 이용해 몇번째 계좌인지 찾아내기
			Account acc=null;
			for(int i=0;i<accountArray.length;i++) {
				if(accountArray[i]!=null) {
					if(accountArray[i].getAno().equals(ano)) {
						acc=accountArray[i];
						return acc;
					}
				}
			}
			//찾은 Account를 리턴하기
			return acc;
		}

}
