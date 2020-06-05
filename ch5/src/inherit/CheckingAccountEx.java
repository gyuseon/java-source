package inherit;

public class CheckingAccountEx {

	public static void main(String[] args) throws Exception {
		CheckingAccount checkingAccount = new CheckingAccount("111-11", "홍길동", 1000000, "222-22");
		
		//입금한다
		checkingAccount.deposit(200000);
		System.out.println("현재잔액 : "+checkingAccount.getBalance());
		
		//출금한다
		checkingAccount.withdraw(300000);
		System.out.println("현재잔액 : "+checkingAccount.getBalance());
		
		//체크카드 사용액을 지불한다
		//카드번호가 일차하는 경우
		System.out.println(checkingAccount.pay("222-22", 2000));
		
		//불일치하는 경우
		System.out.println(checkingAccount.pay("333-33", 20000));
				

	}

}
