package challenges;

public class PizzaMain {

	public static void main(String[] args) {
		Pizza circle=new Regular("Regular");
		System.out.println("The total for the pizza is: " + circle.calPrice());
		Pizza square=new Sicilian("Sicilian");
		System.out.println("The total for the pizza is: " + square.calPrice());
	}

}
