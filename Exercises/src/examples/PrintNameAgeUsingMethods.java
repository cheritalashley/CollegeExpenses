package examples;

import java.util.Scanner;

public class PrintNameAgeUsingMethods {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		String name=Name(input);
		int age=Age(input);
		System.out.println("Your name is: " + name + " and age is " + age);	
		input.close();
	}
		
	public static String Name(Scanner input){
		System.out.println("Enter name");
		String name=input.next();
		return name;
	}
	
	public static int Age(Scanner input){
		System.out.println("Enter age");
		int age=input.nextInt();
		return age;
	}

}
