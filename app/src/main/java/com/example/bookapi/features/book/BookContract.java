package com.example.bookapi.features.book;

import com.example.bookapi.features.book.helper.BookPojo;

import java.util.List;

import retrofit2.Call;

public interface BookContract {

    interface View {
        void successMessage(String success);

        void errorMessage(String error);

        void setBook(List<BookPojo> body);

//        void setSearchBook(List<BookPojo> body);
    }

    interface Presenter {
        void setBooks(int id);

//        void setSearchBooks(String query);
    }

    interface Model {
        Call<List<BookPojo>> getBooks(int id);

//        Call<List<BookPojo>> getSearchBooks(String query);
    }
}
