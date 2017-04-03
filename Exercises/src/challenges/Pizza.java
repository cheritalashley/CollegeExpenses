package challenges;

public abstract class Pizza {
	private String pizzaName;
	private double price;

	private Pizza(){
		pizzaName="pizza";
		price=0;
	}
	
	public Pizza(String pizzaName){
		this.pizzaName=pizzaName;
		price=0;
	}
	
	public Pizza(String name, double price){
		this.pizzaName=name;
		this.price=price;
	}
	
	public abstract double calPrice();
}

	