package collection;

import java.util.HashSet;
import java.util.Set;

public class SetEx5 {

	public static void main(String[] args) {
		Set<MemberVO> set = new HashSet<MemberVO>();
		
		//MemberVo객체를 3개 생성한 후 Set에 담기
		set.add(new MemberVO("hwang","123456","황"));
		set.add(new MemberVO("gyu","123","규"));
		set.add(new MemberVO("hwang","123456","선"));
		set.add(new MemberVO("hwang","12345","황"));
		
		//단, id와 pwd가 같은 경우 담지 않도록 설정
		
		
		System.out.println(set);

	}

}
