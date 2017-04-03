package challenges;

import java.util.ArrayList;
import java.util.Scanner;

public class GroceryChallenge {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		String response;
		ArrayList<String> grocery=new ArrayList<String>();
		
		grocery.add("bread");
		grocery.add("milk");
		grocery.add("pizza");
		grocery.add("apples");
		grocery.add("cookies");
		
		System.out.println("Current grocery list: " + grocery.toString());
		
		System.out.println("Enter a grocery item or quit to exit: ");
		response=input.next();
		boolean found=false;
		
		while(response.equalsIgnoreCase("quit")==false){
			
			for(int i=0; i<grocery.size(); i++){
				
				if (response.equalsIgnoreCase(grocery.get(i))){
					found=true;
					System.out.println(response + " was found in grocerty list");
					}	
			}
			if(found==false){
				grocery.add(response);
			}
			System.out.println("Add another item or quit to exit");
			response=input.next();
		}
		System.out.println("Here is the final list: \n" + 
					grocery.toString());
	}

}
