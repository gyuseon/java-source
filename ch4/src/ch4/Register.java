package ch4;

public class Register {
	//필드
	String userid;
	String name;
	String password;
	String mobile;
	String addr;
	//생성자
	
	public Register(String userid, String name, String password, String mobile, String addr) {
		super();
		this.userid = userid;
		this.name = name;
		this.password = password;
		this.mobile = mobile;
		this.addr = addr;
	}
	public Register() {
		super();		
	}
	public Register(String userid, String name, String password) {
		super();
		this.userid = userid;
		this.name = name;
		this.password = password;
	}
	
	
	
}
