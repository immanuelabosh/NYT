package com.example.nyt.AsyncTasks;

import android.os.AsyncTask;

import com.example.nyt.Database.AppDatabase;
import com.example.nyt.model.Book;

import java.util.List;

public class InsertBooksAsyncTask extends AsyncTask<List<Book>, Void, Void> {
    // This is just a scaffold example for a task that would handle inserting books into the database.
    // You need to complete the doInBackground and onPostExecute methods.
    // Then you will need to make your own class for a task that handles retrieving Books from the
    // database.
    // Refer to the tutorial slide for more information.

    // This asynctask will also need to be given a database instance, so it can perform database
    // queries. If your Room database class is named something else, change this.
    private AppDatabase db;

    public void setDatabase(AppDatabase db) {
        this.db = db;
    }

    @Override
    protected Void doInBackground(List<Book> ... books) {
        // Do some task here that would take a long time... for example, database queries
        // Also note: Book... books.
        //                  ^ the ... notation means it accepts either a single book or an array (or nothing).

        db.bookDao().insert(books[0]);

        return null;
    }

}

