import javax.swing.JOptionPane;

public class HappyUnbirthday {
	public static void main(String[] args) {
		String birthday = JOptionPane.showInputDialog("Input your birthday");
		if(birthday.equals("6/25")) {
			JOptionPane.showMessageDialog(null, "Happy Birthday!"); }
		else { 
			JOptionPane.showMessageDialog(null, "Have a merry, merry UNbirthday");
		}
		
	}

}
