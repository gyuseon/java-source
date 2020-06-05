package ch8;

public class MatcherEx1 {

	public static void main(String[] args) {
		String src="aabbccAABBCCaa";
		
		System.out.println("aa 를"+stringCount(src,"aa")+" ");

	}
	
	static int stringCount(String src,String key) {
		
		int index=0;
		int pos=0;
		int cnt=0;
		while((index=src.indexOf(key,pos))!=-1) {
			cnt++;
			pos=index+key.length();
		}
		
					
		
		return  cnt;
	}

}
