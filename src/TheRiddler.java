import javax.swing.JOptionPane;

//    Copyright (c) The League of Amazing Programmers 2013-2017
//    Level 0



public class TheRiddler {

	public static void main(String[] args) {

		// 1. Make a variable to hold the score
		int score = 0;
		// 3. Ask the user a riddle. Here are some ideas: bit.ly/some-riddles
		String answer = JOptionPane.showInputDialog("What is greater than God,\n" + 
				"more evil than the devil,\n" + 
				"the poor have it,\n" + 
				"the rich need it,\n" + 
				"and if you eat it, you'll die?\n" + 
				"\n" + "What is the answer to this riddle");
		// 4. If they got the answer right, pop up "correct!" and increase the score by one
		if(answer.equals("nothing")) {
			JOptionPane.showMessageDialog(null, "Correct!");
			score = score + 1;
			JOptionPane.showMessageDialog(null, "Your score is now " + score);
		}
		// 5. Otherwise, say "wrong" and tell them the answer
		else {
			JOptionPane.showMessageDialog(null, "Wrong");
			JOptionPane.showMessageDialog(null, "Your score is still " + score);
		}
		// 6. Add some more riddles
		
		// 2. Make a pop up to show the score.
		
	}
}

