package udemy;
import java.util.ArrayList;
public class arraylist {
//ArrayList<telefon> telefonlar = new ArrayList<>(); 
	//telefon tel1= new telefon(model:"mi8", fiyat:"4500");
	//telefonlar.add(tel1);
	//telefonlar.add(index:0, tel2);
	//telefonlar.remove(index:0);
	//telefonlar.remove(tel3);
	//sysout(telefonlar.size()); 
	public static void main(String[] args) {
	ArrayList<String> cityList = new ArrayList<>();
	 
	 cityList.add("London");
	 cityList.add("Denver");
	 cityList.add("Paris");
	 cityList.add("Miami");
	 cityList.add("Seoul");
	 cityList.add("Tokyo");
	
	 System.out.println("List size? " + cityList.size());
	 System.out.println("Is Miami in the list? " + cityList.contains("Miami"));
	 System.out.println("The location of Denver in the list? " + cityList.indexOf("Denver"));
	System.out.println("Is the list empty? " +cityList.isEmpty()); // Print false
	
	 cityList.add(2, "Xian");
	
	 cityList.remove("Miami");
	
	 cityList.remove(1);
	
	 System.out.println(cityList.toString());
	 
	 

	}
	}
	
	 