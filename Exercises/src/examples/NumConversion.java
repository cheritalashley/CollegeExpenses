package examples;

import java.util.Scanner;

public class NumConversion {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.println("Enter number");
		int num=input.nextInt();
		if(num>0 || num<0){
			try{
				System.out.println(num + " must be an integer");
			}catch (NumberFormatException e){
				System.out.println(num + " is not a number");
				System.out.println("Try again");
				num=input.nextInt();
				}
			}
		input.close();
		}

}
