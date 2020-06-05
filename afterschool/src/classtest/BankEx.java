package classtest;

public class BankEx {

	public static void main(String[] args) {
		GoodBank good = new GoodBank();
		printRest(good);
		NormalBank normal = new NormalBank();
		printRest(normal);
		BadBank bad = new BadBank();
		printRest(bad);

	}
	
	
	public static void printRest(Bank good) {
		System.out.println(good.getinterestRate());
	}

}
