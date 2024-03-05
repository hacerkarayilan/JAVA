package greeks;

public class student{
	public double midterm;
	public double fýnal;
public int id;
public String name;
student(int id, String name, double midterm,double fýnal){
	this.id=id;
	this.name=name;
	this.fýnal=fýnal;
	this.midterm=midterm;
}
public String tostring() {
	return "name"+name+"id"+id;
}
}
