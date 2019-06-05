/*
 * File: StoneMasonKarel.java
 * --------------------------
 * The StoneMasonKarel subclass as it appears here does nothing.
 * When you finish writing it, it should solve the "repair the quad"
 * problem from Assignment 1.  In addition to editing the program,
 * you should be sure to edit this comment so that it no longer
 * indicates that the program does nothing.
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

