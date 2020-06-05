package anithing;

public class phoneEx {

	public static void main(String[] args) {
		
		
		
		phone p = new phone();
		p.setName("갤럭시");
		work(p);
		Lg l= new Lg();
		l.setName("v20");
		work(l);
		

	}
	public static void work(phone p) {
		p.worker();
	}

}
