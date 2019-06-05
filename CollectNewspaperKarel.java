/*
 * File: CollectNewspaperKarel.java
 * --------------------------------
 * At present, the CollectNewspaperKarel subclass does nothing.
 * Your job in the assignment is to add the necessary code to
 * instruct Karel to walk to the door of its house, pick up the
 * newspaper (represented by a beeper, of course), and then return
 * to its initial position in the upper left corner of the house.
 */

import stanford.karel.*;

@SuppressWarnings("serial")
public class CollectNewspaperKarel  Karel {
	
	
	public void run() {
		moveALot(2);
		turnRight();
		move();
		turnLeft();
		move();
		pickBeeper();
		turnAround();
		moveALot(3);
		turnRight();
		move();
		turnRight();
	}
	
	private void turnRight() {
		for (int i = 0; i < 3; i+=1) {   //can also use i++ to increment i by 1
			turnLeft();
		}
	}
	
	private void turnAround() {
		for (int i = 0; i < 4; i+=2) { //illustrating loop with i incremented by 2; alternatively can use same syntax as turnRight method
			turnLeft();
		}
	}
	
	private void moveALot(int numSteps) {
		for (int i = 0; i < numSteps; i++) {
			move();
		}
	}
}
