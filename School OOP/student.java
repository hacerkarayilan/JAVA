package greeks;

public class student{
	public double midterm;
	public double f�nal;
public int id;
public String name;
student(int id, String name, double midterm,double f�nal){
	this.id=id;
	this.name=name;
	this.f�nal=f�nal;
	this.midterm=midterm;
}
public String tostring() {
	return "name"+name+"id"+id;
}
}
