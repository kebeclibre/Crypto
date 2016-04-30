
package launch;

import java.io.UnsupportedEncodingException;

import model.CryptMachine;
import model.cryptEngines.CryptEngine;
import model.cryptEngines.LetterToDigit;
import model.cryptEngines.VowelsRevert;

public class Main {

	public static void main(String[] args) {
		CryptMachine cm = new CryptMachine();
		CryptEngine l2d = new LetterToDigit();
		CryptEngine vowels = new VowelsRevert();
		
		cm.setEngine(vowels);
		System.out.println(cm.crypt("eieji"));
		System.out.println(cm.unCrypt("uoujo"));
	}

}
