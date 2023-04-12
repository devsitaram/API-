package com.example.bookapi.features.book;

import android.util.Log;
import androidx.annotation.NonNull;
import com.example.bookapi.features.book.helper.BookPojo;
import java.util.List;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class BookPresenter implements BookContract.Presenter {

    private final BookContract.View mView;
    private final BookModel bookModel = new BookModel();

    public BookPresenter(BookContract.View mView) {
        this.mView = mView;
    }

    @Override
    public void setBooks(int id) {
        bookModel.getBooks(id).enqueue(new Callback<List<BookPojo>>() {
            @Override
            public void onResponse(@NonNull Call<List<BookPojo>> call, @NonNull Response<List<BookPojo>> response) {
                if (response.isSuccessful()) {
                    mView.setBook(response.body());
                    mView.successMessage("Api call Success.");
                } else {
                    mView.errorMessage("Api call BookPojo is error.");
                }
            }

            @Override
            public void onFailure(@NonNull Call<List<BookPojo>> call, @NonNull Throwable throwable) {
                throwable.printStackTrace();
                Log.d("onFailure", "Api call BookPojo is fails: " + throwable);
            }
        });
    }




//    // set books search
//    @Override
//    public void setSearchBooks(String query) {
//        bookModel.getSearchBooks(query).enqueue(new Callback<List<BookPojo>>() {
//            @Override
//            public void onResponse(@NonNull Call<List<BookPojo>> call, @NonNull Response<List<BookPojo>> response) {
//                if (response.isSuccessful()) {
//                    mView.setSearchBook(response.body());
//                    Log.d("BookPojo", "Api book search onResponse is Success.");
//                } else {
//                    Log.d("BookPojo", "Api book search onResponse is fails:" + response); // error message
//                }
//            }
//
//            @Override
//            public void onFailure(@NonNull Call<List<BookPojo>> call, @NonNull Throwable throwable) {
//                throwable.printStackTrace();
//                Log.d("BookPojo", "Api book search onFailure is fails: " + throwable);
//            }
//        });
//    }
}
