package a;

public class Element {
	private String name;
	private int number;
	private String symbol;
	private double mass;
	private int period;
	private int group;
	//Constructor
	public Element (String name, int number,String symbol, double mass,
	int elementPeriod, int elementGroup) {
	this.name = name;
	this.number =number;
	this.symbol = symbol;
	this.mass = mass;
	period = elementPeriod;
	group = elementGroup;
	
	}
	public String tostring() {
		return name+" "+number+" "+" "+symbol+" "+mass+" "+period+" "+group;
	}
}
