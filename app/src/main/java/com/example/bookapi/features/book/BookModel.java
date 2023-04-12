package com.example.bookapi.features.book;

import android.util.Log;

import com.example.bookapi.features.api.ApiCallInstance;
import com.example.bookapi.features.api.ApiServices;
import com.example.bookapi.features.book.helper.BookPojo;

import java.util.List;
import retrofit2.Call;
import retrofit2.Retrofit;

public class BookModel implements BookContract.Model {
    @Override
    public Call<List<BookPojo>> getBooks(int id) {
        Retrofit retrofit = ApiCallInstance.getRetrofitInstance();
        Log.d("Retrofit: ", ""+retrofit);
        return retrofit.create(ApiServices.class).getBooks(id);
    }


//    public Call<List<BookPojo>> getSearchBooks(String query) {
//        Retrofit retrofit = ApiCallInstance.getRetrofitInstance();
//        return retrofit.create(ApiServices.class).searchBooks(query);
//    }
}
