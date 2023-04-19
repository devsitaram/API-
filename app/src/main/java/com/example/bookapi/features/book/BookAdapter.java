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
import com.example.bookapi.features.book.helper.BooksItem;
import java.util.List;

public class BookAdapter extends RecyclerView.Adapter<BookAdapter.ViewHolder> {

    Context context;
    List<BooksItem> bookPojoList;
    public BookAdapter(Context context, List<BooksItem> bookPojoList) {
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
        BooksItem book = bookPojoList.get(position);
        holder.tvAuther.setText(book.getAuthor());
        holder.tvId.setText(book.getId());
        holder.tvPrices.setText(book.getPrice()+"");
        holder.tvTitle.setText(book.getTitle());
        holder.tvUrl.setText(book.getUrl());
        holder.tvDetail.setText(book.getDetail());
        holder.tvDate.setText(book.getDate());
        holder.tvRating.setText(book.getRating()+"");
    }

    @Override
    public int getItemCount() {
        return bookPojoList.size();
    }

    protected static class ViewHolder extends RecyclerView.ViewHolder {
        TextView tvAuther, tvId, tvPrices, tvTitle, tvUrl, tvDetail, tvDate, tvRating;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            tvAuther = itemView.findViewById(R.id.tvAuthor);
            tvId = itemView.findViewById(R.id.tvId);
            tvPrices = itemView.findViewById(R.id.tvPrices);
            tvTitle = itemView.findViewById(R.id.tvTitle);
            tvUrl = itemView.findViewById(R.id.tvUrl);
            tvDetail = itemView.findViewById(R.id.tvDetail);
            tvDate = itemView.findViewById(R.id.tvDate);
            tvRating = itemView.findViewById(R.id.tvRating);
        }
    }
}
