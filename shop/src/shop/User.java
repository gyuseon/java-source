package shop;

public class User {
	//이름, 결제방법(PayType 의 값에서 결정)
	private String name;
	private PayType payType;
	
	public User(String name, PayType payType) {
		super();
		this.name = name;
		this.payType = payType;
	}

	public String getName() {
		return name;
	}

	public PayType getPayType() {
		return payType;
	}	
}
