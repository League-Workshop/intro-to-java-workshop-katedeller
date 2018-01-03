package day2;

import java.awt.Color;

import org.jointheleague.graphical.robot.Robot;

public class FlamingNinjaStar {
	
	public static void main(String[] args) {

		int baseSize = 300;		//the size of the black part of the star
		int flameSize = 200;		//the length of the flaming arms
		
		// 1. Make a new robot, and set it's pen down.
Robot k11 =new Robot ();
k11.penDown();
		// *14. Use the methods setX and setY to move the ninja star into the center of the screen
		k11.moveTo(500, 200);
		// *15. Make some adjustments to see what other kinds of shapes you can make.

		// 12. Set the robot speed to 10
k11.setSpeed(500);
		// 13. Make all the code below repeat 25 times
for (int i = 0; i < 25; i++) {
			// 2. Turn the robot 1/8 of a circle
		k11.turn(360/8);
			// 3. Move the robot 64 pixels
k11.move(64);
			// 4. Turn the robot 40 degrees to the LEFT. (Negative numbers will turn the robot counter-clockwise.)
			k11.turn(-40);
			// 5. Move the robot the distance in the variable flameSize
			k11.setPenColor(Color.yellow);
			k11.move(flameSize);
			// 6. Turn the robot 170 degrees
			k11.turn(170);
			// 7. Move the robot the distance in the variable flameSize (again)
			k11.move(flameSize);
			k11.setPenColor(Color.black);
			// 8. Turn the robot 64 degrees to the right
			k11.turn(64);
			// 9. Move the robot the distance in the variable baseSize
			k11.move(baseSize);
			// 10. Check that your shape is the same as Figure 1. This is one arm of the ninja star.
			
			// 11. Color your ninja star like Figure 2.
		
	}

}}


