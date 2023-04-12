package com.example.bookapi.features.book.helper;

public class AuthorsItem{
	private String name;
	private int deathYear;
	private int birthYear;

	public String getName(){
		return name;
	}

	public int getDeathYear(){
		return deathYear;
	}

	public int getBirthYear(){
		return birthYear;
	}

//	public AuthorsItem(String name, int deathYear, int birthYear) {
//		this.name = name;
//		this.deathYear = deathYear;
//		this.birthYear = birthYear;
//	}
}
