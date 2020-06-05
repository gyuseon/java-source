package ch9;

import java.util.Arrays;

public class CourseEx {

	public static void main(String[] args) {
		Course<Person> personCourse = new Course<Person>("일반인",5);
		personCourse.add(new Person("일반인"));
		personCourse.add(new Worker("직장인"));
		personCourse.add(new Student("학생"));
		personCourse.add(new HighStudent("고등학생"));
		
		
		
		Course<Worker> workerCourse = new Course<>("직장인",3);
		workerCourse.add(new Worker("직장인"));
		
		Course<Student> studentCourse = new Course<>("학생",3);
		studentCourse.add(new Student("학생"));
		
		Course<HighStudent> highStudentCourse = new Course<>("고등학생",3);
		highStudentCourse.add(new HighStudent("고등학생"));
		
		//수강생 등록
		registerCourse(personCourse);
		registerCourse(studentCourse);
		registerCourse(highStudentCourse);
		
		registerCourseWorker(workerCourse);
		registerCourseWorker(personCourse);
		
		registerCourseStudent(studentCourse);
		registerCourse(highStudentCourse);

	}
	public static void registerCourse(Course<?> course) {
		//Person /Student /Worker /HighStudent
		System.out.println(course.getName()+"수강생 : "+Arrays.toString(course.getStudents()));
	}
	public static void registerCourseStudent(Course<? extends Student> course) {
		//extends 부모 자식
		//Student / HighStudent
		System.out.println(course.getName()+"수강생 : "+Arrays.toString(course.getStudents()));
	}
	public static void registerCourseWorker(Course<? super Worker> course) {
		//super 조상
		//Person / Worker
		System.out.println(course.getName()+"수강생 : "+Arrays.toString(course.getStudents()));
	}

}
