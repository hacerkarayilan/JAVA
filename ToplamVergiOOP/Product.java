package week7;

class Product extends Item{


	Product(String name, double price, int amount) {
		super(name, price, amount);
		// TODO Auto-generated constructor stub
	}

	public double ComputeTaxedPrice()
	{
		return total+total*0.18;
	}
}

