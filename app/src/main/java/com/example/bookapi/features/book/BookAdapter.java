package com.example.bookapi.features.book;

import android.annotation.SuppressLint;
import android.content.Context;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.bookapi.R;
import com.example.bookapi.features.book.helper.AuthorsItem;
import com.example.bookapi.features.book.helper.BookPojo;

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
        BookPojo book = bookPojoList.get(position);
        holder.tvTitle.setText(book.getTitle());
        // Get the author list from the BooksPojo object at the given position
        List<AuthorsItem> authorsItemList = bookPojoList.get(position).getAuthors();
        StringBuilder listOfAuther = new StringBuilder();
        for (int i = 0; i < authorsItemList.size(); i++) {
            listOfAuther.append(authorsItemList.get(i).getName());
            if (i != authorsItemList.size() - 1) {
                listOfAuther.append(", ");
            }
        }

        Log.d("BookPojo","Error"+listOfAuther);
        System.out.println("Auther name From API:"+listOfAuther);
        // Set the final author names string to the authorTextView
        holder.tvAuther.setText(listOfAuther.toString());
        holder.tvDownloadCount.setText(book.getDownloadCount()+" ");
    }

    @Override
    public int getItemCount() {
        return bookPojoList.size();
    }

    protected static class ViewHolder extends RecyclerView.ViewHolder {
        TextView tvTitle;
        TextView tvAuther;
        TextView tvDownloadCount;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            tvTitle = itemView.findViewById(R.id.title_text_view);
            tvAuther = itemView.findViewById(R.id.author_text_view);
            tvDownloadCount = itemView.findViewById(R.id.downloadCount_text_view);
        }
    }
}
