package udemy;

import java.util.ArrayList;

public class sarkıcımain {
public static void main(String[] args) {
	asarkıcısı a = new asarkıcısı();
	asarkıcısı b = new asarkıcısı();
	a.kısaelbise();
	a.sarkısoyle();
	a.uzunelbise();
	asarkıcısı dizi [] = new asarkıcısı [5];
	dizi[0]=a;
	dizi[1]=b;
	ArrayList<asarkıcısı> sarkıcılar = new ArrayList<>();
	
	sarkıcılar.add(a);
	sarkıcılar.add(b);
	
}
}
