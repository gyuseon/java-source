package student;

public class StudentVO {
	int no;
	String name;
	int grade;
	String birth;
	
	public StudentVO() {
		super();
		this.no = no;
		this.name = name;
		this.grade = grade;
		this.birth = birth;
	}

	public int getNo() {
		return no;
	}

	public void setNo(int no) {
		this.no = no;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getGrade() {
		return grade;
	}

	public void setGrade(int grade) {
		this.grade = grade;
	}

	public String getBirth() {
		return birth;
	}

	public void setBirth(String birth) {
		this.birth = birth;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "StudentVO [no=" +no+ ",name= " +name+ ",grade =" +grade +", birth=" + birth + "]";
	}
	

}
