package model.cryptEngines;

import java.io.BufferedReader;
import java.io.UnsupportedEncodingException;
import java.util.TreeMap;
import java.util.Map;
import java.util.Map.Entry;

public class LetterToDigit extends CryptEngine {

	public String crypt(String st) {
		st = st.toLowerCase();
		StringBuffer sb = new StringBuffer();
		byte[] bytes;
		try {
			bytes = st.getBytes("ASCII");
			for (Byte b : bytes) {
				sb.append(b.byteValue()-96+"-");
			}
			sb.deleteCharAt(sb.length()-1);
		} catch (UnsupportedEncodingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return sb.toString();
		

	}

	@Override
	public String unCrypt(String st) {
		String[] stb = st.split("-");
		StringBuffer sb = new StringBuffer();
		
		for (String stc : stb) {
			Integer toByte = Byte.parseByte(stc) + 96;
			char[] charArray = Character.toChars(toByte);
			sb.append(charArray);
			
		}
		return sb.toString();
		
	}
	
}
