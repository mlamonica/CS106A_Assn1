/*
 * File: StoneMasonKarel.java
 * --------------------------
 * This program solves the "repair the quad"
 * problem from Stanford's CS106A Assignment 1.
 */

import stanford.karel.*;

public class StoneMasonKarel extends SuperKarel {

	// Karel will place beepers every 4 steps to 
	//support the walls of the Quad in various worlds.
	
	public void run() {
		fillColumn();
		while (frontIsClear()) {
			moveALot(4);
			fillColumn();
		}
	}

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
			
		private void verifyBeeperPresence() {
			if (noBeepersPresent()) {
				putBeeper();
			}
		}
		
		private void moveToWall() {
			while (frontIsClear())
				move();
		}
		
		private void moveALot(int numSteps) {
			for (int i = 0; i < numSteps; i++) {
				move();
			}
		}
} 

