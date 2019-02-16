package com.singtel.serviceImpl;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class LocaleAdaptor {
	
	static class CountriesInterface {
		public List<String> getList() {
			List<String> countries = Arrays.asList(
					  "Danish"
					, "Dutch"
					, "Finnish"
					, "French"
					, "German"
					, "Greek"
					, "Hebrew"
					,"Hungarian"
					,"Italian"
					,"Japanese"
					,"Portuguese"
					,"Russian"
					,"Swedish"
					,"Turkish"
					,"Urdu");
			return countries;
		}
	}
	
	static class CountriesLacaleAdapter {
		private static Map<String, String> countryCodeLangMapping = new HashMap<String, String>();
		static {
			countryCodeLangMapping.put("Danish","kykyliky");
			countryCodeLangMapping.put("Dutch","kukeleku");
			countryCodeLangMapping.put("Finnish","kukkokiekuu");
			countryCodeLangMapping.put("French","cocorico");
			countryCodeLangMapping.put("German","kikeriki");
			countryCodeLangMapping.put("Greek","kikiriki");
			countryCodeLangMapping.put("Hebrew","coo-koo-ri-koo");
			countryCodeLangMapping.put("Hungarian","kukuriku");
			countryCodeLangMapping.put("Italian","chicchirichi");
			countryCodeLangMapping.put("Japanese","ko-ke-kok-ko-o");
			countryCodeLangMapping.put("Portuguese","cucurucu");
			countryCodeLangMapping.put("Russian","kukareku");
			countryCodeLangMapping.put("Swedish","kuckeliku");
			countryCodeLangMapping.put("Turkish","kuk-kurri-kuuu");
			countryCodeLangMapping.put("Urdu","kuklooku");
			//...A lot of others as well
		}

		public List<String> getTranslatedList() {
			List<String> countryCodes = new CountriesInterface().getList();
			List<String> countryLocale = new ArrayList<String>();
			for (String country : countryCodes) {
				countryLocale.add(countryCodeLangMapping
						.get(country));
			}
			return countryLocale;
		}
	}
}
