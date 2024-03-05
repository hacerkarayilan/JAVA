package greeks;

public class studentmain {
	public static void main(String[] args) {
lisans s1 = new lisans(200101043, "fatma", 50,70);
student s2=s1;

System.out.println(s1.tostring());
System.out.println(s2.tostring());
s1.ortalama();

}
}
