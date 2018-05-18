package com.luv2code.springdemo.mvc;

import java.util.LinkedHashMap;
import java.util.List;

public class Student {

	private String primeiroNome;
	private String sobrenome;

	private String country;

	private LinkedHashMap<String, String> countryOptions;

	private String favoriteLanguage;
	
	private LinkedHashMap<String, String> languagesOptions;
	
	private List<String> operatingSystems;

	public Student() {

		// populate country options: used ISO country code
		countryOptions = new LinkedHashMap<>();
		countryOptions.put("BR", "Brasil");
		countryOptions.put("FR", "França");
		countryOptions.put("DE", "Alemanha");
		countryOptions.put("IN", "India");
		countryOptions.put("US", "Estado Unidos");
		
		languagesOptions = new LinkedHashMap<>();
		languagesOptions.put("Java", "Java");
		languagesOptions.put("C#", "C#");
		languagesOptions.put("PHP", "PHP");
		languagesOptions.put("Python", "Python");
		languagesOptions.put("Ruby", "Ruby");

	}

	public String getPrimeiroNome() {
		return primeiroNome;
	}

	public void setPrimeiroNome(String primeiroNome) {
		this.primeiroNome = primeiroNome;
	}

	public String getSobrenome() {
		return sobrenome;
	}

	public void setSobrenome(String sobrenome) {
		this.sobrenome = sobrenome;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public LinkedHashMap<String, String> getCountryOptions() {
		return countryOptions;
	}

	public String getFavoriteLanguage() {
		return favoriteLanguage;
	}

	public void setFavoriteLanguage(String favoriteLanguage) {
		this.favoriteLanguage = favoriteLanguage;
	}

	public LinkedHashMap<String, String> getLanguagesOptions() {
		return languagesOptions;
	}

	public List<String> getOperatingSystems() {
		return operatingSystems;
	}

	public void setOperatingSystems(List<String> operatingSystems) {
		this.operatingSystems = operatingSystems;
	}

}
