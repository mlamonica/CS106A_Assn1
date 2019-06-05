/*
 * File: MidpointFindingKarel.java
 * -------------------------------
 * The MidpointFindingKarel class should
 * leave a beeper on the corner closest to the center of 1st Street
 * (or either of the two central corners if 1st Street has an even
 * number of corners).  Karel can put down additional beepers as it
 * looks for the midpoint, but must pick them up again before it
 * stops.  The world may be of any size, but you are allowed to
 * assume that it is at least as tall as it is wide.
 */

import stanford.karel.*;

@SuppressWarnings("serial")
public class MidpointFindingKarel extends SuperKarel {
	public void run() {
		//Karel will keep track of the number of moves he does fwd
		int counter = 1; 
		while (frontIsClear()) {
			move();
			counter = counter + 1;
		}
		//if Karel finds an even number of columns in the world, 
		//then he will adjust the midpoint by 0.5 to find one of
		//the two central corners as described in the intro
		if (counter % 2 == 0) {
			int even_midpoint = counter/2 + (1/2);
			turnAround();
			//Karel will move backward to the calculated midpoint
			for (int i = 0; i < even_midpoint; i++) {
				move();
			}
			//Karel will place a beeper at the midpoint
			putBeeper();
			//Karel will move back to his starting place
			while (frontIsClear()) {
				move();
			}
		} 
			//if the # of columns is odd, Karel can find the true
			//midpoint and place the beeper accordingly
			else {
				int odd_midpoint = counter/2;
				turnAround();
				for (int i = 0; i < odd_midpoint; i++) {
					move();
				}
				putBeeper();
				while (frontIsClear()) {
					move();
				}
			}
		}
}