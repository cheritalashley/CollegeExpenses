package challenges;

import java.util.Scanner;

public class HospitalStayChallenge {

	public static void main(String[] args) {
		double charges;
		double overnightCharges;
		double medCharges;
		double labCharges;
		String response;
		Scanner input=new Scanner(System.in);
		
		do {
			if (checkforOvernight()==true){
				System.out.println("What were patient overnight charges: $");
				overnightCharges=input.nextDouble();
				}
			else
			{
				overnightCharges=0;
			}
			
			System.out.println("What were patient medication charges: $");
			medCharges=input.nextDouble();
			System.out.println("What were patient lab charges: $");
			labCharges=input.nextDouble();
			charges=overnightCharges+medCharges+labCharges;
			System.out.println("Your total hospital charges were: $" + charges);
			
			
			System.out.println("Do you need to enter another patient's info:");
			response=input.next();
			
		}while (response.equalsIgnoreCase("y"));
		
		System.out.println("Goodbye");
		
		input.close();	
	}
	
	public static boolean checkforOvernight(){
		String stay;
		Scanner input=new Scanner(System.in);
		System.out.println("Did patient stay overnight (y or n)?");
		stay=input.next();
		input.close();
		if (stay.equalsIgnoreCase("y"))
			return true;
		else
			return false;
		
		}
		
		
}
