package com.samples.S01springcoredi;

import java.util.Properties;

public class CountriesAndLanguages {

	private Properties countryLanguages;

	public Properties getCountryLanguages() {
		return countryLanguages;
	}

	public void setCountryLanguages(Properties countryLanguages) {
		this.countryLanguages = countryLanguages;
	}

	@Override
	public String toString() {
		return "CountriesAndLanguages [countryLanguages=" + countryLanguages + "]";
	}
	
}
