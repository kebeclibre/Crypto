
package launch;

import model.CryptMachine;
import model.cryptEngines.CryptEngine;
import model.cryptEngines.LetterToDigit;

public class Main {

	public static void main(String[] args) {
		CryptMachine cm = new CryptMachine();
		CryptEngine l2d = new LetterToDigit();
		
		cm.setEngine(l2d);
		System.out.println(cm.crypt("abvojieji"));
		

	}

}
