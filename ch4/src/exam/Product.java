package exam;

public class Product {
	//상품코드(pCode),상품명(pName),제조회사(company)
	//가격(price), 할인율(discount)
	String p_code;
	String p_name;
	String company;
	int price;
	double discount;
	//기본 생성자
	public Product() {}	
	//할인율 뺀 생성자
	public Product(String p_code, String p_name,String company, int price) {		
		this.p_code = p_code;
		this.p_name = p_name;
		this.company = company;
		this.price = price;
	}
	//인자를 모두 받는 생성자
	public Product(String p_code, String p_name,String company, int price, double discount) {
		this.p_code = p_code;
		this.p_name = p_name;
		this.company = company;
		this.price = price;
		this.discount = discount;
	}
	//기능
	//할인율 설정(setDiscount : 할인율을 받아 현재 할인율 변경-void)
	void setDisount(double discount) {
		this.discount=discount;		
	}
	//판매가격 설정(판매가격 = 판매가격 * (1-discount))
	double sellPrice() {
		return price * (1-discount);
	}
}











