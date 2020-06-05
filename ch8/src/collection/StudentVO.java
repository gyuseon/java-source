package collection;

public class StudentVO {

	
		private int num;
		private String name;
		public StudentVO(int num,String name) {
			super();
			this.num=num;
			this.name=name;
		

	}
		
		@Override
		public boolean equals(Object obj) {
			if(obj instanceof StudentVO) {
				StudentVO vo = (StudentVO)obj;
				return this.name.equals(vo.name);
				
//				return this.num ==vo.num;
			}
			return super.equals(obj);
		}
		
		
		@Override
		public int hashCode() {
			//String이 정의한 hashCode()값
			return name.hashCode();
			
//			return this.num;
		}
		
		
		@Override
		public String toString() {
			return num+":"+name;
		}
		

}
