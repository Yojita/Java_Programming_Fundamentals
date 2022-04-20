package classAndObjects;

public class StudentTester {
	public static void main(String[] args) {
		Student student = new Student();
		student.setStudentId(1001);
		student.setName("Nisha");
		student.setQualifyingExamMarks(80);
		student.setResidentialStatus('H');
		student.setYearOfEngg(2);

		System.out.println("Student Name        : " + student.getName());
		System.out.println("Student Id          : " + student.getStudentId());
		System.out.println("Qualifying marks    : " + student.getQualifyingExamMarks());
		System.out.println("Year of Engineering : " + student.getYearOfEngg());
		System.out.println("Residential Status  : " + student.getResidentialStatus());
	}
}
