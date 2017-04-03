package examples;

import java.util.Scanner;

public class CalculateShipping {

	public static void main(String[] args) {
		double totalSale=0;
		Scanner input=new Scanner(System.in);
		System.out.println("Enter Total Sales: ");
		totalSale=input.nextDouble();
		
		if(totalSale<25){
			totalSale=totalSale+15;
		}
		else if(totalSale <50){
			totalSale=totalSale+10;
		}
		else if(totalSale <=75){
			totalSale=totalSale+5;
		}
		System.out.println("Total sales plus shipping = " + totalSale);
		input.close();
	}

}
