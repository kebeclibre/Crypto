package model.cryptEngines;

import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

public abstract class CryptEngine {

	
	private Map<Character,String> table;
	private String input;
	private String output;
	
	
	public abstract String crypt(String st);
	public abstract String unCrypt(String st);

	
	public Map<Character, String> getTable() {
		return table;
	}
	public void setInput(String input) {
		this.input = input;
	}
	public void setOutput(String output) {
		this.output = output;
	}
	public String getInput() {
		return input;
	}
	public String getOutput() {
		return output;
	}
	public void setTable(Map<Character, String> table) {
		this.table = table;
	}
	
	
}
