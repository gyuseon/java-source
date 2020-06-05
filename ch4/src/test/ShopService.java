package test;

public class ShopService {
	    // ShopService의 여러 객체를 생성해도
		// 항상 동일한 하나의 객체가 생성되도록 하기
	private static ShopService ShopService;
	
	private ShopService() {}
	public static ShopService gietInstance() {
		if(ShopService==null) {
			ShopService = new ShopService();
		}
		return ShopService;
	}
}
