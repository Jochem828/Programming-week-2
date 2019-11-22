package ss.week2;

import ss.utils.TextIO;
import org.junit.Assert;


public class ThreeWayLamp {
	
	public enum Level{
		OFF,
		LOW,
		MEDIUM,
		HIGH,
	}
	
	/**
	 * 
	 * @author jochem
	 *@return the state of the lamp
	 *@invariant \setting == level.OFF || \setting == level.LOW || \input == "MEDIUM" || \input == "HIGH || \input == "STATE" || \input == "NEXT" || \input == "HELP" || \input == "EXIT"
	 *
	 * constructor
	 *
	 *
	 * @ensures getsetting() == level.OFF"
	 */
	
	
	Level setting = Level.OFF;
	public ThreeWayLamp() {
	Level setting = Level.OFF;
		/**
		 * end constructor
		 */
	}
	
	
	public void off() {
		setting = Level.OFF;
		System.out.println("OFF");
	}
	public void low() {
		setting = Level.LOW;
		System.out.println("LOW");
	}
	public void medium() {
	    setting = Level.MEDIUM;
	    System.out.println("MEDIUM");
	}
	public void high() {
		setting = Level.HIGH;
		System.out.println("HIGH");
	}
	public Level getState() {
		System.out.println(setting);
		return setting;
	}
	/**
	*@ensures \old(state) == "OFF" ==> state = "LOW"
	*@ensures \old(state) == "LOW" ==> state = "MEDIUM"
	*@ensures \old(state) == "MEDIUM" ==> state = "HIGH"
	*@ensures \old(state) == "HIGH" ==> state = "OFF
	 *@ensures \old(state) == "OFF==> state = 0
	 */
	public Level setNext() {
		if(setting == Level.OFF) {
			setting = Level.LOW;
		}
		else if(setting == Level.LOW) {
			setting = Level.MEDIUM;
		}
		else if(setting == Level.MEDIUM) {
			setting = Level.HIGH;
		}
		else if(setting == Level.HIGH) {
			setting = Level.OFF;
		}
		return setting;
	}

}
