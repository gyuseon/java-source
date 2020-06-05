package domain;

import java.util.Date;

public class UserVO2 {
	//userTBL 필드 값과 동일하게 맞추기
	private int no;
	private String username;
	private int birthyear;
	private String address;
	
	public int getNo() {
		return no;
	}
	public void setNo(int no) {
		this.no = no;
	}

	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public int getBirthyear() {
		return birthyear;
	}
	public void setBirthyear(int birthyear) {
		this.birthyear = birthyear;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	@Override
	public String toString() {
		return "UserVO2 [no=" + no + ", username=" + username + ", birthyear=" + birthyear + ", address=" + address
				+ "]";
	}
}