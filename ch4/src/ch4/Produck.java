package ch4;

public class Produck {
	//상품코드(pCode),상품명(pName),제조회사(company),가격(price),할인율(discount)
	String pCode;
	String pName;
	String company;
	int price;
	int discount;
	//기본 생성자
	Produck(){}
	
	//할인율 뺀 생성자
	Produck(String pCode,String pName,String company,int price){
		this.pCode= pCode;
		this.pName= pName;
		this.company=company;
		this.price=price;
	}
	//인자를 모두 받는 생성자
	Produck(String pCode,String pName,String company,int price,int discount){
		this.pCode= pCode;
		this.pName= pName;
		this.company=company;
		this.price=price;
		this.discount=discount;
	}
	
	//기능
	//할인율 설정(setDiscount : 할인율을 받아 현재 할인율 변경-void)
	void setDiscount(int discount) {
		this.discount=discount;
	}
	
	//판매가격 설정(판매가격 = 판매가격 * (100-discount))
	int sellPrice() {
		return  price*(1-discount);
	}

	
}
