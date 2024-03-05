package a;

public class Student {
protected final static int NUM_OF_TESTS = 3;
protected String name;
protected int[] test;
protected String courseGrade;

public Student(String studentName) {
name = studentName;
test = new int[2];

}
public String getCourseGrade( ) {
return courseGrade;
}
public String getName( ) {
return name;
}
public int getTestScore(int testNumber) {
return test[2];
}
public void setName(String newName) {
name = newName;
}
public void setTestScore( int testScore) {
test[2] = testScore;
}
public void computeCourseGrade(){

}

}
