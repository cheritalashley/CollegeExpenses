package challenges;

import java.util.Scanner;

public class CollegeExpenses {

	public static Scanner input=new Scanner(System.in);
	public static final int MonthsInCollege=9;
	
	public static void main(String[] args) {
		String name=personInfo();
		Double housing= housing();
		String studentYear=studentStatus();
		Double amountSupply=supplies();
		Double amountCredit=credits();
		totalCosts(name, housing, studentYear, amountSupply, amountCredit);
	}
	
	public static String personInfo(){
		System.out.println("Enter name");
		String name=input.nextLine();
	return name;	
	}
	
	public static Double housing(){
		Double housing=0.00;
		System.out.println("Do you live in Dorm or Apart (dorm/apart)?");
		String response=input.next();
		String dorm="dorm";
		String apart="apart";
		if (response.equals(dorm)){
			System.out.println("Cost of Dorm:");
			double dormCost=input.nextDouble();
			System.out.println("Enter monthly living expenses:");
			double livingExp=input.nextDouble();
			housing = dormCost+(livingExp*MonthsInCollege);
			}
		if (response.equals(apart)){
				System.out.println("Enter Monthly Apartment Rent:");
				double apartCost=input.nextDouble();
				System.out.println("Enter monthly living expenses:");
				double livingExp=input.nextDouble();
				housing = (apartCost*MonthsInCollege)+(livingExp*MonthsInCollege);
				}
		return housing;
	}

	public static String studentStatus(){
		System.out.println("Enter status (Freshman, sophomore, junior, senior)");
		String status=input.next();
		return status;
	}
	
	public static double supplies(){
		System.out.println("Enter Amount for all supplies (include Textbooks, pencils, and paper)");
		double supply=input.nextDouble();
	return supply;
	}
	
	public static double credits(){
		System.out.println("Enter Number of Credit Hours for Year");
		int credit=input.nextInt();
		System.out.println("Enter Cost of Each Credit Hour");
		double cost=input.nextDouble();
		double creditCost=credit*cost;
		return creditCost;
	}
	
	public static void totalCosts(String name, double housing, String studentYear, double amountSupply, double amountCredit){
		double total=housing+amountSupply+amountCredit;
		System.out.println("Total Yearly Expenses for :" +name + 
				"\nHousing Expenses: $" + housing+
				"\nStudent Status: " + studentYear+
				"\nAmount for Supplies: $" +amountSupply+
				"\nAmount for Credit Hour: $" +amountCredit+
				"\nTotal College and Living Expenses for 1 Year = $" + total);
		return;
	}
}
