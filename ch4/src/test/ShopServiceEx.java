package test;

public class ShopServiceEx {

	public static void main(String[] args) {
		
		ShopService service1=ShopService.gietInstance();
		ShopService service2=ShopService.gietInstance();
		
		System.out.println(service1==service2);
	}

}
