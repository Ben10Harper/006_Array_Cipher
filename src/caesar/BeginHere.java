package caesar;

import javax.swing.JOptionPane;

public class BeginHere {

	public static void main(String[] args) {
		
	  /*Object[] possibilities = {"encode", "decode", "crack", "exit"};
		String s = (String)JOptionPane.showInputDialog(
		                    null,
		                    "Please make you selection",
		                    "Start Here",
		                    JOptionPane.PLAIN_MESSAGE,
		                    possibilities,
		                    "encode");
	   */

		//String msg = "Would you like to encode a plain text message?";
		//int confirm = JOptionPane.showConfirmDialog(null, msg);
		
		CaesarCipher myCipher = new CaesarCipher();
		
		String msg = "Please enter the plain text to encode.";
		String plainText = JOptionPane.showInputDialog(msg);
		
		msg="Please enter the key.";
		int key = Integer.parseInt(JOptionPane.showInputDialog(msg));
		//System.out.println("Your key is: " + key);
		
		String codedText = myCipher.encode(plainText, key);
		msg="Your secret message is: " + codedText;
		JOptionPane.showMessageDialog(null, msg);
		
	}

}
