package test;

public class Member {
	//이름 : name (문자열)
	//아이디 : id (문자열)
	//비밀번호 : password (문자열)
	//나이 : age(정수)
	
	String name;
	String id;
	String password;
	int age;
	
	//생성자 : name과 id필드를 받아서 초기화
	public Member(String name,String id){
		this.name=name;
		this.id=id;
	}
	
	//login(String id, String password) 메소드
	//전달인자로 id,password를 전달받아 id가 hong 이고
	//password가 12345 인 경우 true 리턴
	//조건에 맞지 않으면 false리턴
	boolean login(String id, String password) {
		if(id.equals("hong") && password.equals("12345")) {
			return true;
		}
		return false;
	}
	//logout() 메소드
	//로그아웃 되었습니다 라는 메세지를 출력
	void logout(){
		System.out.println("로그아웃 되었습니다");
	}
}





