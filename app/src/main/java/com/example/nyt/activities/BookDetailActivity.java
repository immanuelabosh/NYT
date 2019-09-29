package com.example.nyt.activities;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.example.nyt.FakeDatabase;
import com.example.nyt.R;
import com.example.nyt.model.Book;

public class BookDetailActivity extends AppCompatActivity {
    ConstraintLayout bookConstraintLayout;
    TextView titleTextView;
    TextView authorTextView;
    TextView descriptionTextView;
    TextView rankTextView;
    ImageView coverImageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_book_detail);

        bookConstraintLayout = findViewById(R.id.book);
        titleTextView = bookConstraintLayout.findViewById(R.id.tv_title);
        authorTextView = bookConstraintLayout.findViewById(R.id.tv_author);
        rankTextView = bookConstraintLayout.findViewById(R.id.tv_rank);
        coverImageView = bookConstraintLayout.findViewById(R.id.iv_cover);
        descriptionTextView = findViewById(R.id.tv_description);

        Intent intent = getIntent();

        long isbn = intent.getLongExtra("isbn", 0);
        Book book = FakeDatabase.getBookByIsbn(isbn);

        titleTextView.setText(book.getTitle());
        authorTextView.setText(book.getAuthor());
        rankTextView.setText("#" + String.valueOf(book.getRank()));
        descriptionTextView.setText(book.getDescription());

        String imageUrl = book.getBookImage();
        Glide.with(this).load(imageUrl).into(coverImageView);
    }
}
