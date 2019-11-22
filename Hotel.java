package ss.week2.hotel;

public class Hotel {

	private String name;
	private Room room1;
	private Room room2;
	private Guest guest;
	
	
	public Hotel(String name) {
		
		this.name = name;
		room1 = new Room(101);
		room2 = new Room(102);
		
	}
	public Room checkIn(String name){
		if(getFreeRoom() == null){
			return null;
		} else if(getFreeRoom() == room1) {
			guest = new Guest(name); 
			guest.checkin(room1);
			return room1;
		}else {
		guest = new Guest(name);
		guest.checkin(room2);
		return room2;
		}
	}
	
	public void checkOut(String name) {
		
		if(room1.getGuest() != null) {	
			if(room1.getGuest().getName().equals(name)) {
			room1.getGuest().checkout();
			room1.getSafe().deactivate();
			}} else if (room2.getGuest() != null) {
				if(room2.getGuest().getName().equals(name)) {
					room2.getGuest().checkout();
					room2.getSafe().deactivate();
				} else {
					System.out.println("error on checkout");
				}
			}
	}
	public Room getFreeRoom() {
		if(room1.getGuest() == null) {
			return room1;
		} else if(room2.getGuest() == null) {
			return room2;
		} else {
		return null;
		}
	}
	public Room getRoom(String name) {
		if(room1.getGuest() != null && room1.getGuest().getName().equals(name)) {
			return room1;
		}
		else if(room2.getGuest() != null && room1.getGuest().getName().equals(name)) {
			return room2;
		} else {
		return null;
		}
	}
	public String toString() {
		return room1.toString() + " " + room2.toString();
	}
}
