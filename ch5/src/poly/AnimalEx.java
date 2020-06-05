package poly;

public class AnimalEx {

	public static void main(String[] args) {
		Cat cat = new Cat();
		System.out.println();
		
		//자동 형변환이 일어남
		Animal animal = new Cat();
		//Cat cat1= new Dog(); cat ,dog는 부모자식 관계가 아니라서 안됨
		System.out.println();
		Feline feline = new Cat();
		
		
		//ClassCastException
		Feline feline2 =(Feline) new Animal();
		
		
		
		
	
	
	}

}
