package ex;

public class IPTV extends ColorTV{
	private String add;

	public IPTV(int size, int color,String add) {
		super(size, color);
		this.add=add;
		
	}
	public void printProperty() {
		System.out.println("나의 IPTV는"+add+" 주소의 "+getSize()+"인치"+getColor()+"컬러");
		
	}
	private int getColor() {
		
		return 2048;
	}
	


}
