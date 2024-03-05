package udemy;

import java.util.ArrayList;

public class ferrari extends araba implements ýcaprio {

	@Override
	public void tavantipi() {
		System.out.println("metal tavan ");
	}

	@Override
	public void maxspeed() {
		System.out.println("max hýz 350 ");
	}
public static void main(String[] args) {
	ferrari f1 = new ferrari();
	ferrari f2 = new ferrari();
	ferrari f3 = new ferrari();
	f1.ses();
	f1.tavantipi();
	f1.maxspeed();
	ArrayList <ferrari> ferrarimodel = new ArrayList<>();
	ferrarimodel.add(f1);
	ferrarimodel.add(f2);
	ferrarimodel.add(f3);
	ferrari dizi[] = new ferrari [5];
	dizi[0]=f1;
	dizi[1]=f2;
	dizi[2]=f3;
	System.out.println(ferrarimodel.size());
	}
}
