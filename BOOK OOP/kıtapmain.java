package a;

public class kýtapmain {
	public static void main(String[] args) {
	book kýtap1 = new horror(400," a");
    book kýtap2= new classýc(300, "b");
	book kýtap3 = new book(200,"c");
	System.out.println(kýtap1.speak());
	System.out.println(kýtap2.speak());
	System.out.println(kýtap3.speak());
	System.out.println(kýtap1.tostring());

}
}
