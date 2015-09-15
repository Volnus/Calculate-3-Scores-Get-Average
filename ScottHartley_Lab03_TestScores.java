import javax.swing.JOptionPane;
/**
 * Scott Hartley
 * 
 * This program calculates the average of 3 tests scores. 
 *
 */
public class ScottHartley_Lab03_TestScores {
	public static void main (String [] args){
		double score1; // Holds First Score
		double score2; // Holds Second Score
		double score3; // Holds Third Score
		String input;  // Holds String input

		// Get The First Score
		input = JOptionPane.showInputDialog ("Enter Your First Test Score");
		score1 = Double.parseDouble(input);
		
		// Get The Second Score
		input = JOptionPane.showInputDialog ("Enter Your Second Test Score");
		score2 = Double.parseDouble(input);
		// Get The Third Score
		input = JOptionPane.showInputDialog ("Enter Your Third Test Score");
		score3 = Double.parseDouble(input);
		
		// Prevent scores over 100
		if (score1 >= 101) {
		if (score2 >= 101)
		if (score3 >= 101)
		JOptionPane.showMessageDialog(null,  "Your score must be between 0 and 100");	
		}
		
		// Shows Average Score
		JOptionPane.showMessageDialog(null,  "Your average is " + (score1+score2+score3)/3);	
	
	}
}
