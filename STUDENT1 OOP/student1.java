package aaaaaaa;



public class student1 {

	public static void main(String[] args) {
		student a,b;
		a = new student();
		a.name = "ali";
		a.surname = "yýlmaz";
		b=a;
		b.name = "ayse";
		b.surname = "aslan";
		System.out.println(a.toString());
		System.out.println(b.toString());
		}
		}
