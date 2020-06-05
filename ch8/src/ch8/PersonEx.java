package ch8;

public class PersonEx {

	public static void main(String[] args) {
		Person person1 = new Person("hong12","홍길동");
		Person person2 = new Person("hong12","홍길동");
		Person person3 = new Person("hong12","정준하");
		
		System.out.println(person1.equals(person2));
		System.out.println(person1.equals(person3));
		
		// toString 은 변수명 만 써도 됨
		System.out.println(person1.toString());
		System.out.println(person2);
		System.out.println(person3);

	}

}
