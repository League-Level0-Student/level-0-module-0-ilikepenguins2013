package _03_print_and_popups._4_quiz_game;

import javax.swing.JOptionPane;

public class QuizGame {
	public static void main(String[] args) {
		
		// Create a variable to hold the user's score. Set it equal to zero. 
		int score = 0;
		// ASK A QUESTION AND CHECK THE ANSWER
				
				// 2.  Ask the user a question 
				String answer = JOptionPane.showInputDialog("what is 1+1");
				// 3.  Use an if statement to check if their answer is correct
				if(answer.equals("2")) {
					JOptionPane.showMessageDialog(null,"you are correct");
					score++;
				}
				else {
					JOptionPane.showMessageDialog(null, "you got it wrong ha ha");
					score--;
				}
				
				answer = JOptionPane.showInputDialog("what is 2+2");
				// 3.  Use an if statement to check if their answer is correct
				if(answer.equals("4")) {
					JOptionPane.showMessageDialog(null,"you are correct");
					score++;
				}
				else {
					JOptionPane.showMessageDialog(null, "you got it wrong lol");
					score--;
				}
				
				answer = JOptionPane.showInputDialog("what is 3+3");
				// 3.  Use an if statement to check if their answer is correct
				if(answer.equals("6")) {
					JOptionPane.showMessageDialog(null,"dang you got it you're good");
					score++;
				}
				else {
					JOptionPane.showMessageDialog(null, "you got it wrong oof");
					score--;
				}
				// 4.  if the user's answer was correct, add one to their score 
		
		// MAKE MORE QUESTIONS. Ask more questions by repeating the above 
				// Option: Subtract a point from their score for a wrong answer
		
		
		// After all the questions have been asked, tell the user their final score 
				JOptionPane.showMessageDialog(null, "your score is " + score);
		
	}
}
