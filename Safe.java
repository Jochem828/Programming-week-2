package ss.week2.hotel;

public class Safe {
	private boolean open;
	private boolean active;
	
	public Safe() {
		open = false;
		active = false;
	}

	public boolean open() {
		open = true;
		return open;
	}
	public boolean close() {
		open = false;
		return open;
	}
	public boolean activate() {
		active = true;
		return active;
	}
	public boolean deactivate() {
		active = false;
		return active;
		
	}
	public boolean isActive() {
		return active;
	}
	public boolean isOpen() {
		return open;
	}
}
