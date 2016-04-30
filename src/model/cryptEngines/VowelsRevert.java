package model.cryptEngines;

import java.util.Map;
import java.util.TreeMap;

public class VowelsRevert extends CryptEngine{
	
	private Map<Character,Character> corres = new TreeMap<>();
	
	{
	corres.put('a', 'y');
	corres.put('e', 'u');
	corres.put('i', 'o');
	corres.put('o', 'i');
	corres.put('u', 'e');
	corres.put('y', 'a');
	}
	
	
	public String crypt(String st) {
		StringBuffer sb = new StringBuffer();
		for (int i = 0; i < st.length(); i++) {
			if (corres.containsKey(st.charAt(i))) {
				sb.append(corres.get(st.charAt(i)));
			} else {
				sb.append(st.charAt(i));
			}
		}
		return sb.toString();
		
	}


	@Override
	public String unCrypt(String st) {
		
		return this.crypt(st);
	}
}
