package greeks;

public class yuksekl�sans extends student{
yuksekl�sans(int id, String name,double midterm,double f�nal){
	super(id, name,midterm,f�nal);}
	
	
	public void ortalama() {
		int total = 0;
		total += midterm*0.4 + f�nal *0.6;
		
		if(total > 70) {
			System.out.println("pass");
		}
			else {
				System.out.println("fail");
			
		}
}
}
