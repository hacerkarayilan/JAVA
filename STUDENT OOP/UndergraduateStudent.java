package a;

class UndergraduateStudent extends Student {
	public UndergraduateStudent(String studentName) {
		super(studentName);
	}

	public void computeCourseGrade() {
		int total = 0;
		for (int i = 0; i < 2; i++) {
		total += test[i];
		}
		if (total/2 >= 70) {
		courseGrade = "Pass";
		} else {
		courseGrade = "No Pass";
		}
		}
}
