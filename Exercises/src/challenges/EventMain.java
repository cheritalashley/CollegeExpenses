package challenges;

import java.text.ParseException;
import java.util.Scanner;

public class EventMain {

	public static void main(String[] args) throws ParseException {
		String name, eventDate, type;
		int numGuest;
		double guestCost;
		Event event=new Event();
		Scanner input=new Scanner(System.in);
		
		System.out.println("Enter type of event ");
		type=input.nextLine();
		event.setEventType(type);
		
		System.out.println("Enter name of event ");
		name=input.nextLine();
		event.setEventName(name);
	
		System.out.println("Enter Date of Event");
		eventDate=input.nextLine();
		event.setEventDate(eventDate);
		
		System.out.println("Enter number of Guests ");
		numGuest=input.nextInt();
		event.setGuests(numGuest);
		
		System.out.println("Enter cost per Guest ");
		guestCost=input.nextDouble();
		event.setCostGuest(guestCost);
		
		event.print();
		input.close();
		
	}

}
