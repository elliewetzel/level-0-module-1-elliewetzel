import javax.swing.JOptionPane;

public class Remarkable {
	public static void main(String[] args) {
		String answer = JOptionPane.showInputDialog("What's your name?");
		if(answer.equals("Delara")) {
			JOptionPane.showMessageDialog(null,"You are really sweet, and really smart.");
		}
	}

}
