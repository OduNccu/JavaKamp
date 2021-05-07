package day2;

public class Main {

	public static void main(String[] args) {
		
		Course course1 = new Course(1, "Yazilim Gelistirici Yerlestirme Kampý (C# + ANGULAR) ", "Engin Demirog", 61);
		Course course2 = new Course(2, "Yazilim Gelistirici Yerlestirme Kampý (JAVA + REACT) ", "Engin Demirog", 84);
		
		Course[] courses = {course1, course2};
		
		for (Course course : courses) {
			System.out.println("Kurs - " + course.courseName);
			System.out.println("Egitmen - " + course.instructorName);
		}
		System.out.println("-------------------------------------------------------------");
		
		CourseManager courseManager = new CourseManager();
		
		courseManager.joinToCourse(course1);
		courseManager.joinToCourse(course2);
		
		System.out.println();
		
		courseManager.lookAtProgress(course1);
		courseManager.lookAtProgress(course2);

	}

}
