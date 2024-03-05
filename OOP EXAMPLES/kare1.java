package udemy;

public class kare1 extends geometri{
public int kenar1;
public int kenar2;

	public kare1(int kenar1, int kenar2) {
		this.kenar1=kenar1;
		this.kenar2=kenar2;
	}
	public void alan() {
System.out.println("alan " + kenar1*kenar2);		
	}

	@Override
	public void cevre() {
System.out.println("cevre " + 2*(kenar1+kenar2));		
	}

}
