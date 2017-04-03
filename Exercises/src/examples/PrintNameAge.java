package examples;

import java.util.Scanner;

public class PrintNameAge {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.println("Enter name");
		String name=input.next();
		System.out.println("Enter age");
		int age=input.nextInt();
		
		System.out.println("Your name is: " + name + " and age is " + age);		
		input.close();
		}

}
