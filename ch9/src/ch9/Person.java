package ch9;

public class Person {
	private String name;

	public Person(String name) {
		super();
		this.name = name;
	}

	@Override
	public String toString() {
		return "Person [name=" + name + "]";
	}

}
class Worker extends Person{
	
	public Worker(String name) {
		super(name);
	}
	@Override
	public String toString() {
		
		return super.toString();
	}
}
class Student extends Person{
	
	public Student(String name) {
		super(name);
	}
	@Override
	public String toString() {
		
		return super.toString();
	}
}
class HighStudent extends Person{
	
	public HighStudent(String name) {
		super(name);
	}
	@Override
	public String toString() {
		
		return super.toString();
	}
}
