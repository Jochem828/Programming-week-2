package ss.week2.hotel;

import ss.utils.TextIO;
import  ss.week2.hotel.Room;
public class Guest {

private	String name;
private	Room room ;
		
	public Guest(String name) {
	this.name = name;
		/**@param name name of the guest*/
	    
		
	}
	/**@return true if succesfull, return false if room already has a guest or guest already has a room*/
	public boolean checkin(Room room) {
		if(room.getGuest()== null && this.room == null) {
			room.setGuest(this);
			this.room = room;
			return true;
		} 
			return false;
	
		
		/**@param room Room that guest wants to rent
		 * @requires room != null
		 */
	}
	/**@return true if succesfull, return false if guest doesn't have a room*/
	public boolean checkout() {
		
		if(this.room != null) {
			this.room.setGuest(null);
			this.room = null;
			return true;
	}
		return false;
	}
	/**@return name of the guest*/
	public String getName() {
		return name;
	}
	/**@return the room of the guest, null if guest has no room*/
	public ss.week2.hotel.Room getRoom() {
		if(this.room != null) {
			return this.room;
		}
		return null;
		
	}
	public String toString(){
		return "guest " + getName();
	}
	
	
	
	
	
	
}
