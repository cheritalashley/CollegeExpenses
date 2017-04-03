package challenges;

import java.util.Scanner;

public class PaintHouse {

	public static void main(String[] args) {
		double windows, windowHeight, windowWidth;
		double doors, doorHeight, doorWidth;
		double houseHeight, houseWidth, houseLength;
		double area;
		
		Scanner input=new Scanner(System.in);
		System.out.println("How many windows do house have? ");
		windows=input.nextDouble();
		
		System.out.println("What is the height of the windows (feet)? ");
		windowHeight=input.nextDouble();
		
		System.out.println("What is the width of the windows (feet)? ");
		windowWidth=input.nextDouble();
		
		System.out.println("How many doors do house have? ");
		doors=input.nextDouble();
		
		System.out.println("What is the height of the doors (feet)? ");
		doorHeight=input.nextDouble();
		
		System.out.println("What is the width of the doors (feet)? ");
		doorWidth=input.nextDouble();
		
		System.out.println("What is the height of the House (feet)? ");
		houseHeight=input.nextDouble();
		
		System.out.println("What is the width of the House (feet)? ");
		houseWidth=input.nextDouble();
		
		System.out.println("What is the length of the House (feet)? ");
		houseLength=input.nextDouble();
		
		double areaOfWindows=windows*(windowHeight*windowWidth);
		double areaOfDoors=doors*(doorHeight*doorWidth);
		area=(houseHeight*houseWidth*2 + houseLength *houseHeight*2)-areaOfDoors-areaOfWindows;
		System.out.println("Painted area: " + area );
		input.close();
	}

}
