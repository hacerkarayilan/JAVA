package a;

public class book {
public int sayfasayısı;
public String turu;
book(int sayfasayısı, String turu){
	this.sayfasayısı=sayfasayısı;
	this.turu=turu;
}
public String speak(){
	return ("kitap okumayı seviyorum");
	
}
public String tostring() {
return "sayfa sayısı"+ sayfasayısı+ "turu"+turu;}
}
