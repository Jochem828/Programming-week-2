package ss.week2;

import ss.utils.TextIO;
import ss.week2.ThreeWayLamp;

public class ThreeWayLampTui {

	

public static void main(String[] args) {
	
	
	ThreeWayLamp lamp = new ThreeWayLamp();
	
	
	
	int value;
	
	int exit = 0;
	System.out.println("0, OFF");
	System.out.println("1, LOW");
	System.out.println("2, MEDIUM");
	System.out.println("3, HIGH");
	System.out.println("4, STATE");
	System.out.println("5, NEXT");
	System.out.println("6, HELP");
	System.out.println("7, EXIT");
	
	final int OFF = 0;
	final int LOW = 1;
	final int MEDIUM = 2;
	final int HIGH = 3;
	final int STATE = 4;
	final int NEXT = 5;
	final int HELP = 6;
	final int EXIT = 7;
	
	while(exit == 0) {
		value = TextIO.getInt();
		
	switch(value) {
	case OFF:
		lamp.off();
		
		break;
	case LOW:
	lamp.low();
	
	break;
	case MEDIUM:
	
	lamp.medium();
	
	break;
	case HIGH:
		lamp.high();
	
	
	break;
	case STATE:
		
	lamp.getState();
	
	break;

	case NEXT:
	System.out.println("NEXT");
	lamp.setNext();
	
	break;
	case HELP:
		System.out.println("0, OFF");
		System.out.println("1, LOW");
		System.out.println("2, MEDIUM");
		System.out.println("3, HIGH");
		System.out.println("4, STATE");
		System.out.println("5, NEXT");
		System.out.println("6, HELP");
		System.out.println("7, EXIT");
		break;
	case EXIT:
	exit = 1;
	break;
	default:
		System.out.println("no input");
	}
}
}
}