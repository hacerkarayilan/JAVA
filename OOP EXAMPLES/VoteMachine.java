package udemy;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
public class VoteMachine {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);

		ArrayList<person> list=new ArrayList<person>();
		Map<String,Integer> map=new HashMap<String,Integer>();
		for(int i=0;i<3;i++)
		{
			System.out.println("adayin adini giriniz:");
			String name=scan.nextLine();
			System.out.println("adayin mesajini giriniz:");
			String message=scan.nextLine();
			list.add(new person(name,message));
			map.put(name,0);
		}
		String x=" ";
		while(true)
		{
			System.out.println("oyunuzu vereceginiz adayin ismini giriniz:");
			x=scan.nextLine();
			if(map.containsKey(x))
				map.put(x, map.get(x)+1);
			else if(x.equals("a"))
				break;
			else
				System.out.println("gecerli bir aday giriniz!");
		}
		for(person a:list)
			System.out.println(a.Name_Surname+":"+map.get(a.Name_Surname));
	}



	}


