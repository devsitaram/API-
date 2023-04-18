package com.example.bookapi.features.book;

import android.annotation.SuppressLint;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import com.example.bookapi.R;
import com.example.bookapi.features.book.helper.BookPojo;
import com.example.bookapi.features.book.helper.BooksItem;

import java.util.List;

public class BookAdapter extends RecyclerView.Adapter<BookAdapter.ViewHolder> {

    Context context;
    List<BookPojo> bookPojoList;
    public BookAdapter(Context context, List<BookPojo> bookPojoList) {
        this.context = context;
        this.bookPojoList = bookPojoList;
    }

    @NonNull
    @Override
    public BookAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.book_items, parent, false);
        return new ViewHolder(view);
    }

    @SuppressLint("SetTextI18n")
    @Override
    public void onBindViewHolder(@NonNull BookAdapter.ViewHolder holder, int position) {

//        BookPojo book = bookPojoList.get(position);
//        holder.tvTitle.setText(book.getTitle());
//        // Get the author list from the BooksPojo object at the given position
//        List<AuthorsItem> authorsItemList = bookPojoList.get(position).getAuthors();
//        StringBuilder listOfAuther = new StringBuilder();
//        for (int i = 0; i < authorsItemList.size(); i++) {
//            listOfAuther.append(authorsItemList.get(i).getName());
//            if (i != authorsItemList.size() - 1) {
//                listOfAuther.append(", ");
//            }
//        }

        BooksItem booksItem = new BooksItem();
        holder.tvAuther.setText(booksItem.getAuthor());
        holder.tvId.setText(booksItem.getId());
        holder.tvPrices.setText(booksItem.getRating()+" ");
        holder.tvTitle.setText(booksItem.getTitle());
        holder.tvDownloadUrl.setText(booksItem.getUrl());

    }

    @Override
    public int getItemCount() {
        return bookPojoList.size();
    }

    protected static class ViewHolder extends RecyclerView.ViewHolder {

        TextView tvAuther;
        TextView tvId;
        TextView tvPrices;
        TextView tvTitle;
        TextView tvDownloadUrl;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            tvAuther = itemView.findViewById(R.id.author_text_view);
            tvId = itemView.findViewById(R.id.id_text_view);
            tvPrices = itemView.findViewById(R.id.prices_text_view);
            tvTitle = itemView.findViewById(R.id.title_text_view);
            tvDownloadUrl = itemView.findViewById(R.id.downloadUrl_text_view);
        }
    }
}
