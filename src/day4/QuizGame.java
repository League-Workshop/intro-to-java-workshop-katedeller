package day4;

import javax.swing.JOptionPane;

public class QuizGame {
	
	public static void main(String[] args) {
		
		// 1.  Create a variable to hold the user's score 
		int score = 0;
		// 2.  Ask the user a question 
		String word = JOptionPane.showInputDialog("What is the capital of California?");
		// 3.  Use an if statement to check if their answer is correct
		if(word.equals("Sacramento")) {
		// 4.  if the user's answer is correct
			 speak("correct");
		// -- add one to their score 
		score ++;}
		// 5.  Create more questions by repeating steps 1, 2, and 3 below. 
		word = JOptionPane.showInputDialog("What is the capital of America");
		if(word.equals("Washington D.C.")) {
			speak("correct");
			score ++;}
		word = JOptionPane.showInputDialog("What is the capital of New York");
		if(word.equals("Albany")) {
			speak("correct");
			score ++;}
		
		// 6.  After all the questions have been asked, print the user's score 
		JOptionPane.showMessageDialog(null, "You scored " +score);
	}
	static void speak(String words) {
		try {
			Runtime.getRuntime().exec("say " + words).waitFor();
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}
}
