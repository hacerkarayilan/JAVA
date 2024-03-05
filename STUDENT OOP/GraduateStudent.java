package a;

public class GraduateStudent extends Student {
	public GraduateStudent(String studentName) {
		super(studentName);
		// TODO Auto-generated constructor stub
	}

	public void computeCourseGrade() {
		int total = 0;
		for (int i = 0; i < 2; i++) {
		total += test[i];
		}
		if (total/2 >= 80) {
		courseGrade = "Pass";
		} else {
		courseGrade = "No Pass";
		}
		}
		}

