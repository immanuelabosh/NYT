package com.example.nyt.activities;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.content.Intent;
import android.os.AsyncTask;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.example.nyt.AsyncTasks.AsyncTaskDelegate;
import com.example.nyt.AsyncTasks.InsertBooksAsyncTask;
import com.example.nyt.AsyncTasks.RetrieveBooksAsyncTask;
import com.example.nyt.Database.AppDatabase;
import com.example.nyt.R;
import com.example.nyt.model.Book;

public class BookDetailActivity extends AppCompatActivity implements AsyncTaskDelegate {
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
        AppDatabase db = AppDatabase.getInstance(getApplicationContext());

        //im using an async task so I dont freeze my ui
        RetrieveBooksAsyncTask retrieveBooksAsyncTask = new RetrieveBooksAsyncTask();
        retrieveBooksAsyncTask.setDatabase(db);
        retrieveBooksAsyncTask.setDelegate(this);
        retrieveBooksAsyncTask.execute(isbn);

    }

    @Override
    public void handleTaskResult(Book book) {
        titleTextView.setText(book.getTitle());
        authorTextView.setText(book.getAuthor());
        rankTextView.setText("#" + String.valueOf(book.getRank()));
        descriptionTextView.setText(book.getDescription());

        String imageUrl = book.getBookImage();
        Glide.with(getApplicationContext()).load(imageUrl).into(coverImageView);
    }
}
