package collection;

import java.util.HashSet;
import java.util.Set;

public class SetEx4 {

	public static void main(String[] args) {
		Set<StudentVO> set = new HashSet<StudentVO>();
		//num 값이 같다면 저장이 안되도록
		set.add(new StudentVO(1024,"홍길동"));
		set.add(new StudentVO(1025,"홍길동"));
		
		System.out.println(set);

	}

}
