package ch7;

public class ClassCastExceptionEx {

	public static void main(String[] args) {
		
		try {
		Animal animal1 = new Dog();
		Dog dog1 =(Dog) animal1;
		//changeDog(animal1);
		Animal animal2 = new Animal();
		Dog dog2 =(Dog) animal2;
		//changeDog(animal2);
		} catch (Exception e) {
			System.out.println("타입 변환 할 수 없습니다");
		}
		
		
//		Dog dog2 =(Dog) animal2;
		
	}
//	public static void changeDog(Animal animal) {
//        if(animal instanceof Dog) {
//        	Dog dog1 =(Dog) animal;
//		}
//	}

}
