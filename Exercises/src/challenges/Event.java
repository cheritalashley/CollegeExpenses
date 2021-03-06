package challenges;

public class Event {
	String eventType;
	String eventName;
	String eventDate;
	int guests;
	double costGuest;
	public static String eventNum;
	
	public Event(){}

	public Event(String type){
		eventType=type;
		guests=0;
		eventDate=null;
		this.eventNum=eventNum;
	}
	
	public Event(String type, String eventDate){
		eventType=type;
		guests=0;
		this.eventDate=eventDate;
		this.eventNum=eventNum;
	}
	
	public Event(String type, String eventDate, int numGuests){
		eventType=type;
		guests=numGuests;
		this.eventDate=eventDate;
		this.eventNum=eventNum;
	}
	
	public String getEventName() {
		return eventName;
	}

	public void setEventName(String eventName) {
		this.eventName = eventName;
	}
	
	public String getEventNum() {
		return eventNum;
	}

	public void setEventNum(String eventType){ 
		int num=100;
		char eventChar=eventType.charAt(0);
		num++;
		eventNum=Character.toString(eventChar)+Integer.toString(num);
		this.eventNum = eventNum;
	}

	public String getEventDate() {
		return eventDate;
	}

	public void setEventDate(String eventDate) {
		if(eventDate=="null")
			this.eventDate="there is no date for event";
		else
			this.eventDate = eventDate;
	}

	public String getEventType() {
		return eventType;
	}

	public void setEventType(String eventType) {
		this.eventType = eventType;
	}

	public int getGuests() {
		return guests;
	}

	public void setGuests(int guests) {
		this.guests = guests;
	}

	public double getCostGuest() {
		return costGuest;
	}

	public void setCostGuest(double costGuest) {
		if (costGuest<40.00)
			this.costGuest=40.00;
		else 
			this.costGuest = costGuest;
	}

	public double calculateTotal(){
		double total=getCostGuest()*guests;
		return total;
	}
	
	public void print(){
		System.out.println("Event Num: " + getEventNum() + "\nEvent Type: " + getEventType()
							+ "\nEvent Name: " + getEventName() + "\nEvent Date: " + 
							getEventDate() + "\nNumber of Guests: " + getGuests()
							+ "\nEvent Total: " + calculateTotal());
	}
}
