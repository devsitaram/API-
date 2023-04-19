package com.example.bookapi.features.book.helper;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class BookPojo {

	private List<BooksItem> books;

	public List<BooksItem> getBooks(){
		return books;
	}
}