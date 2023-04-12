package com.example.bookapi.features.api;

import com.example.bookapi.features.book.helper.BookPojo;
import java.util.List;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Headers;
import retrofit2.http.Path;

public interface ApiServices {

    String X_RAPID_API_KEY = "9e20034fd9msh152d8e07f3542bcp15f9efjsne0833ef8a71e";
    String RAPID_API_HOST = "project-gutenberg-api.p.rapidapi.com";

    @Headers({
            "X-RapidAPI-Key: "+X_RAPID_API_KEY,
            "X-RapidAPI-Host: "+RAPID_API_HOST})
    @GET("books/{id}.json")
    Call<List<BookPojo>> getBooks(@Path("id") int bookId);



//    @Headers({
//            "X-RapidAPI-Key: "+X_RAPID_API_KEY,
//            "X-RapidAPI-Host: "+RAPID_API_HOST})
//    @GET("books/search")
//    Call<List<BookPojo>> searchBooks(@Query("query") String query);

}
