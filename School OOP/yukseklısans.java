package greeks;

public class yukseklısans extends student{
yukseklısans(int id, String name,double midterm,double fınal){
	super(id, name,midterm,fınal);}
	
	
	public void ortalama() {
		int total = 0;
		total += midterm*0.4 + fınal *0.6;
		
		if(total > 70) {
			System.out.println("pass");
		}
			else {
				System.out.println("fail");
			
		}
}
}
