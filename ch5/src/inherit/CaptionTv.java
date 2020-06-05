package inherit;

public class CaptionTv extends Tv {
	
	
	public CaptionTv(String color, boolean power, int channel,boolean caption) {
		super(color, power, channel);
		this.caption=caption;
	}











	/* private */ boolean caption; //캡션 상태
	
	
	
	
	
	





	void displayCaption(String text) {
		if(caption) {
			System.out.println(text);
		}
	}

}
