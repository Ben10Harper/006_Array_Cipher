Julius Caesar (Roman General) is credited with our first "cipher."

This is a shift cipher, where each alpha is shifted by the same number. For example,

key = 1
a = b, b = c, c = d, etc

to decipher, reverse the process:

b-key = a, c-key = b, etc
----------


-----------CLASS BeginHere-------------


---------------------------------------

-----------CLASS CaesarCipher----------


		//System.out.println("test: alpha length = " + alpha.length());
		//System.out.println("test: first char is: " + alpha.charAt(0));
		//System.out.println("test: first char is: " + alpha.charAt(alpha.length()-1));
		
		//for (int i = 0; i < alpha.length(); i++) {
		//	System.out.println(alpha.charAt(i));
		//}
		
		//System.out.println("\n\n");
		
		//for (int i = 0; i < plainText.length(); i++) {
		//	System.out.println(plainText.charAt(i));
		//}
		
		/*
		 * each char that I read from plainText I find the index in alpha
		 * ex. read A, look up index for A get 0
		 *     read M, look up index for M get 12
		 * then, add key to that index, so A index 0 becomes 0+key
		 * and 0+key becomes my coded char
		 * let's say key=1, then a index 0, 0+1 = 1 charAt 1 is B
		 * and that is my encoding
		 */

---------------------------------------

