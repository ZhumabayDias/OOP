package model;

import enums.Language;

public class Translator {
	private Dictionary dict;
	private Language lang;
	
	public Translator(Language lang) {
		this.dict = new Dictionary();
		this.lang = lang;
	}
	
	public String translate(String text) {
		if(this.lang.name().equals("EN")) {
			return text;
		}
		else if(this.lang.name().equals("RU")) {
			return this.dict.getMap().get("en-ru").get(text);
		}else  {
			return this.dict.getMap().get("en-kz").get(text);
		}
		
	}
	
	public void setLanguage(Language lang) {
		this.lang = lang;
	}
	public Language getLanguage() {
		return this.lang;
	}
}
