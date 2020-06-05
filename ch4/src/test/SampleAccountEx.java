package test;

public class SampleAccountEx {

	public static void main(String[] args) {
		SampleAccount account =new SampleAccount();
		
		account.setBalnace(100000);
		System.out.println("현재잔고 : "+account.getBalance());

		account.setBalnace(-100000);
		System.out.println("현재잔고 : "+account.getBalance());

		account.setBalnace(1500000);
		System.out.println("현재잔고 : "+account.getBalance());

	}

}
