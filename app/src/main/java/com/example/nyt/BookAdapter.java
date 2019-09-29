package com.example.nyt;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.example.nyt.activities.BookDetailActivity;
import com.example.nyt.model.Book;

import java.util.List;

public class BookAdapter extends RecyclerView.Adapter<BookAdapter.BookViewHolder> {
    private List<Book> booksToAdapt;

    public void setData(List<Book> booksToAdapt) {
        this.booksToAdapt = booksToAdapt;
    }

    @NonNull
    @Override
    public BookViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view =
                LayoutInflater.from(parent.getContext())
                        .inflate(R.layout.book, parent, false);

        BookViewHolder bookViewHolder = new BookViewHolder(view);
        return bookViewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull BookViewHolder holder, int position) {
        final Book bookAtPosition = booksToAdapt.get(position);

        // Contrast how I wrote this method with the method for ArticleAdapter. They both achieve
        // the same goal, but this way is cleaner. I defined my own method "bind" in the BookViewHolder
        // class, and all the assignment and setup is done in there instead.
        holder.bind(bookAtPosition);
    }

    @Override
    public int getItemCount() {
        return booksToAdapt.size();
    }

    public static class BookViewHolder extends RecyclerView.ViewHolder {
        public View view;
        public TextView titleTextView;
        public TextView authorTextView;
        public TextView rankTextView;
        public ImageView shareImageView;
        public ImageView bookmarkImageView;
        public ImageView coverImageView;
        public boolean isBookmarked = false;

        // This constructor is used in onCreateViewHolder
        public BookViewHolder(View v) {
            super(v);  // runs the constructor for the ViewHolder superclass
            view = v;
            titleTextView = v.findViewById(R.id.tv_title);
            authorTextView = v.findViewById(R.id.tv_author);
            rankTextView = v.findViewById(R.id.tv_rank);
            shareImageView = v.findViewById(R.id.iv_share);
            bookmarkImageView = v.findViewById(R.id.iv_save);
            coverImageView = v.findViewById(R.id.iv_cover);

            bookmarkImageView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    if(isBookmarked) {
                        bookmarkImageView.setImageResource(R.drawable.ic_bookmark_border_black_24dp);
                    } else {
                        bookmarkImageView.setImageResource(R.drawable.ic_bookmark_black_24dp);
                    }
                    isBookmarked = !isBookmarked;
                }
            });

        }

        // See comment in onBindViewHolder
        public void bind(final Book book) {
            titleTextView.setText(book.getTitle());
            authorTextView.setText(book.getAuthor());
            rankTextView.setText("#" + book.getRank());

            view.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Context context = view.getContext();

                    Intent intent = new Intent(context, BookDetailActivity.class);
                    intent.putExtra("isbn", book.getIsbn());
                    context.startActivity(intent);
                }
            });

            shareImageView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Context context = view.getContext();
                    Intent intent = new Intent(Intent.ACTION_SEND);

                    intent.putExtra(Intent.EXTRA_TEXT, book.getTitle());
                    intent.setType("text/plain");
                    context.startActivity(intent);
                }
            });

            String imageUrl = book.getBookImage();
            Glide.with(view.getContext()).load(imageUrl).into(coverImageView);
        }
    }
}
