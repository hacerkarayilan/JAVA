package greeks;

public class lisans extends student{
	lisans(int id, String name,double midterm,double f�nal){
		super(id, name,midterm,f�nal);
	}
	public void ortalama() {
		int total = 0;
		total += midterm*0.4 + f�nal *0.6;
		
		if(total > 60) {
			System.out.println("pass");
		}
			else {
				System.out.println("fail");
			
		}
	}
}
