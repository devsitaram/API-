package com.example.bookapi.features.api;

import com.example.bookapi.features.book.helper.BookPojo;

import java.util.List;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Headers;

public interface ApiServices {

    @Headers({"X-RapidAPI-Key: 71bf5ec090msha9ecf2d7b476478p1f2533jsnd5cef4e5ef55",
	        "X-RapidAPI-Host: book4.p.rapidapi.com"})
    @GET("/")
    Call<List<BookPojo>> getBooks();
}
