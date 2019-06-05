/*
 * File: CollectNewspaperKarel.java
 * --------------------------------
 * Karel walks to walk to the door of its house, picks up the
 * newspaper (represented by a beeper, of course), and then returns
 * to its initial position in the upper left corner of its house.
 */

import stanford.karel.*;

@SuppressWarnings("serial")
public class CollectNewspaperKarel extends Karel {
	
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
	//allows Karel to turn right
	private void turnRight() {
		for (int i = 0; i < 3; i+=1) {   //can also use i++ to increment i by 1
			turnLeft();
		}
	}
	
	//allows Karel to turn around
	private void turnAround() {
		for (int i = 0; i < 4; i+=2) { //illustrating loop with i incremented by 2; alternatively can use same syntax as turnRight method
			turnLeft();
		}
	}
	
	//allows Karel to move more than one step at a time
	private void moveALot(int numSteps) {
		for (int i = 0; i < numSteps; i++) {
			move();
		}
	}
}
