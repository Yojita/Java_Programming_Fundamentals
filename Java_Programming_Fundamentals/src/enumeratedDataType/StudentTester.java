package enumeratedDataType;

public class StudentTester {
	public static void main(String[] args) {
		Student student = new Student();
		student.setStudentId(1001);
		student.setName("Aakash");
		student.setTotalMarks(300);
		student.calculateGrade();
		student.calculateScholarshipAmount(student.getGrade());
		System.out.println("Student Details : ");
		System.out.println("Student Id :" + student.getStudentId());
		System.out.println("Student Name : " + student.getName());
		System.out.println("Student Grade : " + student.getGrade());
		System.out.println("Scholarship amount : " + student.getScholarshipAmount());
	}
}
