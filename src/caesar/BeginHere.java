package caesar;

import javax.swing.JOptionPane;

public class BeginHere {

	public static void main(String[] args) {
		Boolean playing = true;
		String msg = "";
		
	while (playing == true) {
		Object[] selectionsArray = {"Encoder", "Decoder", "Cracker", "Exit", "late addition"};
		String showFirst = "encode";
		String selection = (String) JOptionPane.showInputDialog(
							null,
		                    "Please make you selection",
		                    "Start Here",
		                    JOptionPane.PLAIN_MESSAGE,
		                    null,
		                    selectionsArray,
		                    showFirst);
		if (selection == null) selection = "Cancelled";
		JOptionPane.showMessageDialog(null, "You have selected: "+selection);
		
		CaesarCipher myCipher = new CaesarCipher();
		
		switch (selection) {
		case "Encoder":
			JOptionPane.showMessageDialog(null,
					"We are now in the Encoder switch block - add some code!");
				msg = "Please enter the plain text to encode.";
				String plainText = JOptionPane.showInputDialog(msg);
		
				msg="Please enter the key.";
				int key = Integer.parseInt(JOptionPane.showInputDialog(msg));
				//System.out.println("Your key is: " + key);
		
				String codedText = myCipher.encode(plainText, key);
				msg="Your secret message is: " + codedText;
				JOptionPane.showMessageDialog(null, msg);
			break;
		case "Decoder":
			JOptionPane.showMessageDialog(null,
					"We are now in the Decoder switch block - add some code!");
			break;
		case "Cracker":
			JOptionPane.showMessageDialog(null,
					"We are now in the Cracker switch block - add some code!");
			break;
		case "Exit":
			JOptionPane.showMessageDialog(null,
					"We are now in the Exit switch block - add some code!");
			System.exit(0);
			break;
		default:
			JOptionPane.showMessageDialog(null,
					"We are now in the Unknown Case or Cancel switch block - add some code!");
			break;		
		}

		//String msg = "Would you like to encode a plain text message?";
		//int confirm = JOptionPane.showConfirmDialog(null, msg);

		msg = "Go again? y/n";
		String answer = JOptionPane.showInputDialog(msg);
		if (answer.equalsIgnoreCase("n")||answer.equalsIgnoreCase("no")) {
			playing = false;
		}else if (answer.equalsIgnoreCase("y")||answer.equalsIgnoreCase("yes")) {
			playing = true;
		}else {
			msg = "I don't know what you mean? Try again";
			JOptionPane.showMessageDialog(null, msg);
		}
	}
		msg="Alright, come again soon!";
		JOptionPane.showMessageDialog(null, msg);
	}

}
