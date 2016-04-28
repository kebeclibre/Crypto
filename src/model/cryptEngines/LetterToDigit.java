package model.cryptEngines;

import java.io.BufferedReader;
import java.util.TreeMap;
import java.util.Map;
import java.util.Map.Entry;

public class LetterToDigit extends CryptEngine {
	
	public LetterToDigit() {
		super.setInput("abcdefghijklmnopqrstuvwxyz");
		super.setOutput("1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22,23,24,25,26");
		makeTable();
	}

	public String crypt(String st) {
		StringBuffer sb = new StringBuffer();
		
		for (int i = 0; i<st.length();i++) {
			
			sb.append(super.getTable().get(st.charAt(i)));
			sb.append('-');
		}
		sb.deleteCharAt(sb.length()-1);
		return sb.toString();
	}

	@Override
	public String unCrypt(String st) {
		// TODO Auto-generated method stub
		return null;
	}
	
	private void makeTable(){
		Map<Character,String> table = new TreeMap<>();
		String[] out = super.getOutput().split(",");		
		if (super.getInput().length() == out.length) {
			for (int i = 0; i<super.getInput().length();i++) {
				table.put(super.getInput().charAt(i),out[i]);
			}
		}
		super.setTable(table);
	}
	

}
