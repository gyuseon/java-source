package shop;
//휴대폰 : 상품명, 가격, 통신사
//상품명과 가격을 출력하는 메소드
//통신사 정보를 출력하는 메소드
public class Cellphone extends Product{
	private String carrier;  //통신사
	
	public Cellphone(String pname,int price,String carrier) {
		super(pname,price);		
		this.carrier = carrier;
	}	
	@Override
	public void printExtra() {
		System.out.println("통신사 정보 : "+carrier);		
	}	
}
