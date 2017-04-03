package examples;

import java.util.Scanner;

public class Methods {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		double x, y, z;
		double avg;
		
		System.out.println("Enter your 3 numbers" );
		x=input.nextDouble();
		y=input.nextDouble();
		z=input.nextDouble();
		
		avg=average(x,y,z);
		System.out.println("The average is: " + avg);
		input.close();
	}
	
	public static double average(double num1, double num2, double num3){
		double avg=(num1+num2+num3)/3;
		return avg;
	}
	
}
