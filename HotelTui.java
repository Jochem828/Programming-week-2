package ss.week2.hotel;
import ss.utils.TextIO;

public class HotelTui {
	Hotel hotel1 = new Hotel("U Parkhotel");
	
	public HotelTui() {
		this.hotel1 = hotel1;
	}
	public void printHelpMenu() {
		System.out.println("Welcome to the Hotel booking system of the U Parkhotel		Commands :");
		
		System.out.println("i name ............... check in guest with name");
				
		System.out.println("o name ............... check out guest with name");
		
		System.out.println("r name ............... request room of guest");
		System.out.println("h .................... help");	
		System.out.println("p .................... print state");
		System.out.println("x .................... exit");
	}

	public void start() {
		
			
		
			final char IN = 'i';
			final char OUT = 'o';
			final char ROOM = 'r';
			final char HELP = 'h';
			final char PRINT = 'p';
			final char EXIT = 'x';
	
			
			
			
			String guest = null;
			String hotel = null;
			String room = null;
			String value = null;
			String parameter;
			String input;
			int exit = 0;
			printHelpMenu();
			
			while(exit == 0) {
				
				input = TextIO.getlnString();
				String[] words = input.split("\\W+");
				value = words[0];
				parameter = null;
						
				
				
				
				if (words.length > 1) {
							parameter = words[1];
						}
				guest = parameter;
				char command = value.charAt(0);
			switch(command) {
			case IN:
				Room checkin = hotel1.checkIn(guest);
				if(checkin == null) {
					System.out.println("Full");
				}
				else if(checkin != null){
					guest = parameter;
					System.out.println(guest + " has been checked in into " + checkin);
				} else {
				System.out.println("error");
				}
				break;
			case OUT:
				if(parameter == null) {
					System.out.println("no name");
				} else {
				hotel1.checkOut(guest);
				System.out.println("checked out");
				}
				break;
			case ROOM:
				if(guest == null) {
					System.out.println("no name");
				}
				else {
					System.out.println(hotel1.getRoom(guest));
				}
			break;
			case PRINT:
				Room print = hotel1.getFreeRoom();
				System.out.println("Hotel information");
				if(print != null) {
					System.out.println("a free room is: " + print);
				} 
				else {
					System.out.println("no free rooms");
				}
				
			
			break;
			case HELP:
				printHelpMenu();
		
			break;
			case EXIT:
				exit = 1;
				break;
				default:
					System.out.println("no function");
			}
				}
			}
			
		
	
		public static void main(String[] args) {
			HotelTui hotelTUI= new HotelTui();
			hotelTUI.start();
		}


}


