package com.example.bookapi.features.api;

import android.util.Log;

import okhttp3.OkHttpClient;
import okhttp3.logging.HttpLoggingInterceptor;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class ApiCallInstance {
    private static Retrofit retrofit;

    private static final String BASE_URL = "https://book4.p.rapidapi.com/";

    public static Retrofit getRetrofitInstance() {
        if (retrofit == null) {
            HttpLoggingInterceptor httpLoggingInterceptor = new HttpLoggingInterceptor();
            httpLoggingInterceptor.setLevel(HttpLoggingInterceptor.Level.BODY);

            OkHttpClient okHttpClient = new OkHttpClient.Builder()
                    .addInterceptor(httpLoggingInterceptor)
                    .build();

            retrofit = new Retrofit.Builder()
                    .baseUrl(BASE_URL)
                    .client(okHttpClient)
                    .addConverterFactory(GsonConverterFactory.create()) // converter
                    .build();
        }
        return retrofit;
    }



//
//    // search book
//    public static Retrofit getRetrofitInstances() {
//        if (retrofit == null) {
//            HttpLoggingInterceptor httpLoggingInterceptor = new HttpLoggingInterceptor();
//            httpLoggingInterceptor.setLevel(HttpLoggingInterceptor.Level.BODY);
//
//            OkHttpClient okHttpClient = new OkHttpClient.Builder() //
//                    .addInterceptor(httpLoggingInterceptor)
//                    .build();
//
//            retrofit = new Retrofit.Builder()
//                    .baseUrl(BASE_URL)
//                    .client(okHttpClient)
//                    .addConverterFactory(GsonConverterFactory.create()) // converter
//                    .build();
//        }
//        return retrofit;
//    }



//    private static final String BASE_URL = "https://book-finder1.p.rapidapi.com/";
//    https://book-finder1.p.rapidapi.com/api/search?series=Wings%20of%20fire&book_type=Fiction&lexile_min=600&lexile_max=800&results_per_page=25&page=1
//    private static final String BASE_URL = "https://project-gutenberg-api.p.rapidapi.com/";
}
