package model;

import model.cryptEngines.CryptEngine;

public class CryptMachine {
	private CryptEngine engine;

	public void setEngine(CryptEngine engine) {
		this.engine = engine;
	}
	
	public String crypt(String st) {
		return this.engine.crypt(st);
	}
}
