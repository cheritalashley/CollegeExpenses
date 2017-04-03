package challenges;

import java.io.File;
import java.io.PrintWriter;
import java.util.Scanner;

public class ReadFileChallenge {

	public static void main(String[] args) {
		File inputFile=new File("menu.txt");
		File outputFile=new File("menu_price.txt");
		String menu;
		double price;
		
		try{
			Scanner input=new Scanner(inputFile);
			PrintWriter output=new PrintWriter(outputFile);
			Scanner in=new Scanner(System.in);
			while(input.hasNextLine()){
				menu=input.nextLine();
				System.out.println("Item from menu is:" + menu);
				System.out.println("What is price?");
				price=in.nextDouble();
				in.nextLine();
				output.print(menu);
				output.print("\t");
				output.print(price);
				output.println();
			}
			output.close();	
			input.close();
			in.close();
		}catch(Exception e){
			System.out.println("Cannot find file" + e.toString());
			}
	}
}
