/*
 * File: StoneMasonKarel.java
 * --------------------------
 * This program solves the "repair the quad"
 * problem from Stanford's CS106A Assignment 1.
 */

import stanford.karel.*;

public class StoneMasonKarel extends SuperKarel {

	// Karel will place beepers up the entirety of every 4th column 
	//to support the walls of the quad
	
	public void run() {
		fillColumn();
		while (frontIsClear()) {
			moveALot(4);
			fillColumn();
		}
	}
		//Karel will start at the bottom of
		//his world, fill whichever column he is in with beepers
		//until he hits quad wall, and then will turn around and
		//return to the bottom of the column, ready to move to 
		//the next column
		private void fillColumn() {
			verifyBeeperPresence();
			while (notFacingNorth()){
				turnLeft();
			}
			while (frontIsClear()) {
				move();
				verifyBeeperPresence();
			}
			turnAround();
			moveToWall();
			turnLeft();
		}
		//Karel will check each spot for a beeper and add one if 
		//necessary
		private void verifyBeeperPresence() {
			if (noBeepersPresent()) {
				putBeeper();
			}
		}
		
		//Karel will move all the way to the next wall in his path,
		//which in this case is back to the bottom of the world
		private void moveToWall() {
			while (frontIsClear())
				move();
		}
		
		//moveALot allows Karel to move more than one step at a time
		private void moveALot(int numSteps) {
			for (int i = 0; i < numSteps; i++) {
				move();
			}
		}
} 