package ex;

public abstract class Calc {
	int a;
	int b;
	
	void setValue(int a, int b) {
		this.a=a;
		this.b=b;
	}
	
	public abstract int calculate();

}
