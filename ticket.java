public class ticket implements locations{
	String name;
	String airline;
	int ticketnum;
	String ogplace;
	String destination;
	boolean baggage;
	boolean C19TESTRESULT;
	boolean valid;
	double cost;
	double distance;
	int dateOfReturn;
	static int tnum = 0;
	
	public ticket(String name, int ticketnum, String ogplace, boolean baggage) {
		this.name = name;
		this.ticketnum = ticketnum;
		this.ogplace = ogplace;
		this.baggage = baggage;
		valid = true;
		this.airline = ogplace + " airlines";
		tnum++;
		//We factor not only the distance, but also the popularity of the location
		if(destination == "New York" || destination == "Los Angles" || destination == "San Jose" || destination == "Chicago" || 
				destination == "Houston" || destination == "Phoenix" || destination == "Philadelphia" || destination == "San Antonio" || 
				destination == "San Diego" || destination == "Dallas" || destination == "Austin" || destination == "Miami") {
			/*	if (distance > 300){
				cost = 324$;
			
			*/
		}
		else if(destination == "Fort Worth" || destination == "Jacksonville" || destination == "Columbus" || destination == "Charlotte" || 
				destination == "Indianapolis" || destination == "San Franciso" || destination == "Seattle" || destination == "Denver" || 
				destination == "Washington" || destination == "Dallas" || destination == "Boston" || destination == "El Paso") {
			}
		
		else if(destination == "Nashville" || destination == "Oklahoma City" || destination == "Las Vegas" || destination == "Detriot" || 
				destination == "Portland" || destination == "Memphis" || destination == "Louisville" || destination == "Milwaukee" || 
				destination == "Baltimore" || destination == "Albuquerque" || destination == "Tucson" || destination == "Meso") {
			
			}
		
		
	}
	public String toString() {
		String user = "";
		
		user = "name: " + this.name + "\n";
		user = "airline: " + this.airline + "\n";
		user = "Place of takeoff: " + this.ogplace + "\n";
		user = "Ticket Number: " + ticketnum + "\n";
		return user;
	}
}
