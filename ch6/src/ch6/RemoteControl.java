package ch6;

public interface RemoteControl {
	
	//모든 멤버변수는 public static final이어야 하며
	//생략가능
	public int MAX_VOLUME =10;
	public int MIN_VOLUME =0;
	
	//모든 메소드는 public abstract 이어야 하며
	//생략가능(단, static/default 제외)
	public void turnOn();
	public void turnOff();
	public void setVolume(int volume);
	
	//기능 추가 default ,static
	public default void setMute() {}


}
