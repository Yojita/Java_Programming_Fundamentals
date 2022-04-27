package enumeratedDataType;

public class Student {

	enum Grade {
		A, B, C, D, E
	}

	private int studentId;
	private String name;
	private Grade grade;
	private int scholarshipAmount;
	private int totalMarks;

	public int getStudentId() {
		return studentId;
	}

	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getScholarshipAmount() {
		return scholarshipAmount;
	}

	public void setScholarshipAmount(int scholarshipAmount) {
		this.scholarshipAmount = scholarshipAmount;
	}

	public int getTotalMarks() {
		return totalMarks;
	}

	public void setTotalMarks(int totalMarks) {
		this.totalMarks = totalMarks;
	}

	public Grade getGrade() {
		return grade;
	}

	public void setGrade(Grade grade) {
		this.grade = grade;
	}

	public void calculateGrade() {
		if (totalMarks >= 250) {
			grade = Grade.A;
		} else if (totalMarks >= 200 && totalMarks < 250) {
			grade = Grade.B;
		} else if (totalMarks >= 175 && totalMarks < 200) {
			grade = Grade.C;
		} else if (totalMarks >= 150 && this.totalMarks < 175) {
			grade = Grade.D;
		} else {
			grade = Grade.E;
		}
	}

	public void calculateScholarshipAmount(Grade grade) {
		switch (grade) {
		case A:
			scholarshipAmount = 5000;
			break;
		case B:
			scholarshipAmount = 4000;
			break;
		case C:
			scholarshipAmount = 3000;
			break;
		case D:
			scholarshipAmount = 2000;
			break;
		default:
			scholarshipAmount = 0;
			break;
		}
	}
}
