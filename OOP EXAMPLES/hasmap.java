package udemy;

import java.util.HashMap;
import java.util.Map;

public class hasmap {
public static void main(String[] args) {
	HashMap<Integer, String> plakalar = new HashMap<>();
	plakalar.put(01, "adana");
	plakalar.put(34, "istanbul");
	plakalar.put(16, "bursa");
	plakalar.put(35, "izmir");
	plakalar.put(06, "ankara");
	plakalar.put(27, "gaziantep");
	plakalar.put(80, "osmaniye");
	System.out.println(plakalar.get(01));
	
	System.out.println(plakalar);
	String deger = plakalar.get(27);
	HashMap<Integer, String> plakalaryedek = new HashMap<>();
	System.out.println(plakalaryedek.size());
	plakalaryedek.putAll(plakalar);
	System.out.println(plakalaryedek.size());
	plakalaryedek.clear();
	System.out.println("temizlenme sonrasý yedek " + plakalaryedek.size());
	System.out.println(deger);
	System.out.println(plakalar.size());
	System.out.println(plakalar.isEmpty());
	System.out.println(plakalar.containsKey(44));
	System.out.println(plakalar.containsValue("gaziantep"));
	System.out.println(plakalar.remove(35));
	System.out.println(plakalar.size());
	for(Integer key : plakalar.keySet()) {
		System.out.println(key);
	}
	for(String value : plakalar.values()) {
		System.out.println(value);
	}
	for(Map.Entry<Integer, String> entry: plakalar.entrySet()) {
		System.out.println("key: " + entry.getKey() + " value: " + entry.getValue());
	}
}
}
