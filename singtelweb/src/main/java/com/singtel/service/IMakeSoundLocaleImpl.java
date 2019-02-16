package com.singtel.service;

import java.util.HashMap;
import java.util.Map;

public class IMakeSoundLocaleImpl implements IMakeSound{

	private String lang;
	private Animal animal;
	public IMakeSoundLocaleImpl(String language) {
		super();
		lang =language;
	}
	
	public IMakeSoundLocaleImpl(Animal a, String language) {
//		System.out.println(roosterCountryCodeLangMapping.get(lang));
		setLang(language);
		setAnimal(a);
	}

	@Override
	public void sound() {
		System.out.println(roosterCountryCodeLangMapping.get(lang));
	}


	private static Map<String, String> roosterCountryCodeLangMapping = new HashMap<String, String>();
	static {
		
		roosterCountryCodeLangMapping.put("Danish","kykyliky");
		roosterCountryCodeLangMapping.put("Dutch","kukeleku");
		roosterCountryCodeLangMapping.put("Finnish","kukkokiekuu");
		roosterCountryCodeLangMapping.put("French","cocorico");
		roosterCountryCodeLangMapping.put("German","kikeriki");
		roosterCountryCodeLangMapping.put("Greek","kikiriki");
		roosterCountryCodeLangMapping.put("Hebrew","coo-koo-ri-koo");
		roosterCountryCodeLangMapping.put("Hungarian","kukuriku");
		roosterCountryCodeLangMapping.put("Italian","chicchirichi");
		roosterCountryCodeLangMapping.put("Japanese","ko-ke-kok-ko-o");
		roosterCountryCodeLangMapping.put("Portuguese","cucurucu");
		roosterCountryCodeLangMapping.put("Russian","kukareku");
		roosterCountryCodeLangMapping.put("Swedish","kuckeliku");
		roosterCountryCodeLangMapping.put("Turkish","kuk-kurri-kuuu");
		roosterCountryCodeLangMapping.put("Urdu","kuklooku");
		//...A lot of others as well
	}
	public String getLang() {
		return lang;
	}

	public void setLang(String lang) {
		this.lang = lang;
	}

	public Animal getAnimal() {
		return animal;
	}

	public void setAnimal(Animal animal) {
		this.animal = animal;
	}




}
