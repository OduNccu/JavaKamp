package day2;

public class CourseManager {
	public void joinToCourse(Course course) {
		System.out.println("Kursa Katildiniz! " + course.courseName);
	}
	public void lookAtProgress(Course course) {
		System.out.println(course.courseName + "Bu Kurstaki Ilerlemeniz: " + course.progress + "%");
	}

}
