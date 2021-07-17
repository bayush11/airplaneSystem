import java.util.*;
public class airline implements locations{
	private static ticket user[] = new ticket[72];
	
	public static void main(String args[]) {
		char ans = 'z';
		Scanner input = new Scanner(System.in);
		System.out.println("Hello user! Welcome to the airline database. Here are your options:");
		System.out.println("a: Book a Ticket");
		System.out.println("b: Cancel a Ticket");
		System.out.println("c: Use Ticket");
		System.out.println("d: Update Ticket");
		System.out.println("e: Exit");
		
		while(ans != 'e') {
			System.out.print("What is your option: ");
		    ans = input.next().charAt(0);
			
			if(ans == 'a' || ans == 'A') {
				ticketBooking();
			}
			else if(ans == 'b' || ans == 'B') {
				ticketCancel();
			}
			else if(ans == 'c' || ans == 'C') {
				useTicket();
			}
			else if(ans == 'd' || ans == 'D') {
				ticketUpdate();
			}
			else if(ans == 'e' || ans == 'E') {
				break;
			}
			else {
				System.out.println("Invalid input. Try again!");
			}
		}
		
		System.out.println("Thank you for using our system. Have a great day!");
	}
	
	
	private static void ticketBooking() {
		ticket user1 = null;
		Scanner input = new Scanner(System.in);
		System.out.println("Here are the available locations! There are three categories. Category 1 is the most expensive locations, 2 is not as expensive, and 3 is the least expensive");
		System.out.println("Category 1: New York(1), Los Angles(2), San Jose(3), Chicago(4), Houston(5), Phoenix(6), Philadelphia(7), San Antonio(8), San Diego(9), Dallas(10), Austin(11), Miami(12)");
		System.out.println("Category 2: Fort Worth(13), Jacksonville(14), Columbus(15), Charlotte(16), Indianapolis(17), San Franciso(18), Seattle(19), Denver(20), Washington(21), Dallas(22), Boston(23), El Paso(24)");
		System.out.println("Category 3: Nashville(25), Oklahoma City(26), Las Vegas(27), Detriot(28), Portland(29), Memphis(30), Louisville(31), Milwaukee(32), Baltimore(33), Albuquerque(34), Tucson(35), Meso(36)");
		System.out.print("_ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _");
		System.out.printf("\n \n \n");
		System.out.println("_ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _");		
		System.out.println("Please pick a number for your location and additionally, state your name, where you live, and if you want baggage on the plane(True/False): ");
		int loca = input.nextInt();
		String namer = input.next();
		String location = input.next();
		boolean bag = input.nextBoolean();
		user1 = new ticket(namer, ticket.tnum - 1, location, bag);
		user[ticket.tnum - 1] = user1;
		System.out.println("You have booked your ticket!");
		return;
	}
	
	private static void ticketCancel() {
		Scanner input = new Scanner(System.in);
		System.out.println("What is your name and your place of takeoff?");
		String namer = input.next();
		int ticketnum = 0;
		String placer = input.next();
		boolean user2 = false;
		while(user2 == false){
			System.out.print("What is your ticket number: ");
		    ticketnum = input.nextInt();
			if(ticketnum > ticket.tnum) {
				if(ticket.tnum == 0) {
					System.out.println("There are no tickets currently.");
					return;
				}
				else {
					System.out.println("Invalid ticket number. Try again");
				}
			}
			else {
				user[ticketnum] = null;
				System.out.println("You have successfully cancelled your ticket!");
				user2 = true;
			}
		}
		
	}
	
	private static void useTicket() {
		Scanner input = new Scanner(System.in);
		System.out.print("Please state your ticket number: ");
		int ticketnum = input.nextInt();
		if(ticketnum > ticket.tnum) {
			System.out.println("Invalid ticket number.");
			return;
		}
		user[ticketnum] = null;
		System.out.println("You have successfully used your ticket. Congratulations!");
	}
	
	private static void ticketUpdate() {
		Scanner input = new Scanner(System.in);
		System.out.print("State your ticket number, so we can make the changes accordingly: ");
		int num = input.nextInt();
		if(num > ticket.tnum) {
			System.out.println("Invalid ticket number.");
			return;
		}
		ticket user2 = user[num];
		System.out.println("What attribute about your ticket would you like to change?");
		System.out.println("a: Location");
		System.out.println("b: Date of return");
		System.out.println("c: Exit");
	    char val = 'z';
		while(val != 'c') {
		    val = input.next().charAt(0);
			if(val == 'a') {
				printer();
				System.out.println("Please state the new location you want on the ticekt by inputting the corresponding number: ");
				int x = input.nextInt();
				user2.ticketnum = x;
				System.out.println("Location changed!");
				break;
			}
			else if(val == 'b') {
				System.out.print("What is the new date you would like: ");
				int x = input.nextInt();
				user2.dateOfReturn = x;
				System.out.println("Date changed!");
				break;
			}
			else {
				System.out.println("Invlaid input. try again");
			}
		}
	}
	
    private static void printer() {
		for(int i = 0; i < locations.length; i++) {
			System.out.println("Number: " + i + " Location: " + locations[i]);
		}
	}
}
