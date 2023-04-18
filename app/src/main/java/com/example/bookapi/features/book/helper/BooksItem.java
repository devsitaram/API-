package com.example.bookapi.features.book.helper;

import java.io.Serializable;

public class BooksItem implements Serializable {
	private String date;
	private String author;
	private int price;
	private int rating;
	private String id;
	private String detail;
	private String title;
	private String url;

	// getter methods
	public String getDate(){
		return date;
	}

	public String getAuthor(){
		return author;
	}

	public int getPrice(){
		return price;
	}

	public int getRating(){
		return rating;
	}

	public String getId(){
		return id;
	}

	public String getDetail(){
		return detail;
	}

	public String getTitle(){
		return title;
	}

	public String getUrl(){
		return url;
	}
}
