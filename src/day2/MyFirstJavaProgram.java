package day2;

import java.awt.Color;
import org.jointheleague.graphical.robot.Robot;

public class MyFirstJavaProgram {
	
	public static void main(String[] args) {
		
		// START HERE
	System.out.println("Hello World");
	Robot k8 = new Robot();
	k8.penDown();
	k8.move(100);
	k8.sparkle();
	k8.setSpeed(100);
	k8.penUp();
	k8.moveTo(30, 40);
	k8.turn(90);
	
	}
}
