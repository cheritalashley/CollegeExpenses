package examples;

public class Overloading {

	public static void main(String[] args) {
		System.out.println("The average of 3 intergers is: " + average(3, 6, 9));
		System.out.println("The average of 3 double is: " + average(6.0, 9.0, 2.0));
	}

	public static double average(int x, int y, int z){
		return (x+y+z)/3;
	}
	
	public static double average(double x, double y, double z){
		return (x+y+z)/3.0;
	}
}
